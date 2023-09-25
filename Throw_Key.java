public class Throw_Key {
    static void vaildate_age(int age) throws ArithmeticException    {
        if (age<18){
            throw new ArithmeticException("Not vaild");
        }
        else {
            System.out.println("Yes u can vote!");
        }
    }
    public static void main(String[] args) {
        vaildate_age(23);
        vaildate_age(3);
    }
}
