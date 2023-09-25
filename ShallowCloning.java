public class ShallowCloning implements Cloneable {
    int a;

    ShallowCloning(int a) {
        this.a = a;
    }

    public static void main(String[] args) throws Exception {
        ShallowCloning s = new ShallowCloning(34);

        ShallowCloning t = (ShallowCloning) s.clone(); // Shallow cloning

        t.a = 98;

        System.out.println(s.a); // Output: 34
        System.out.println(t.a); // Output: 98
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Performing shallow cloning
    }
}
