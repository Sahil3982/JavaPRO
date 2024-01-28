public class CopyConstructor {
    int id;
    int ed;
    static {
        System.out.println("Omg");
    }
    CopyConstructor(int a,int b){
        System.out.println(a+b);
    }
    CopyConstructor(CopyConstructor anything){
        this.ed=34;
        System.out.println("Hy:"+this.ed);
    }
    public static void main(String[] args) {
        CopyConstructor cc1=new CopyConstructor(2,4);
        CopyConstructor cc2= new CopyConstructor(cc1);
        System.out.println("Main Bhiya!");

    }
}
