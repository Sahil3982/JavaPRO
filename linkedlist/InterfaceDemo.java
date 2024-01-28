 class InterfaceDemo implements A2 {
    public static void main(String[] args) {
        InterfaceDemo id=new InterfaceDemo();
        id.draw();
        id.draw1();

    }

     @Override
     public void draw1() {
         System.out.println("In");
     }

     @Override
     public void draw() {
         System.out.println("Hello");
     }
 }
interface A1 {
    void draw();
}
interface A2 extends A1{
    void draw1();

    @Override
    void draw();
}