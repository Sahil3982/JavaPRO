public class InvaildAgeException extends RuntimeException{
    InvaildAgeException(String s){
        super(s);
    }
}
class TestCustomException{
    static void vaildate_age(int age)throws InvaildAgeException{

        if (age<18){
            throw new InvaildAgeException("Yes Invalid age");
        }
        else {
            System.out.println("Vaild Age You can vote it");
        }
    }

    public static void main(String[] args) throws InvaildAgeException {
        vaildate_age(7);
//        try {
//            vaildate_age(134);
//        }
//        catch (InvaildAgeException e){
//            System.out.println("Exception Occurs");
//        }
    }
}