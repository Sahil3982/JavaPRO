public class Thread_class extends Thread{

    public void run(){
        System.out.println("thread is running........");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread_class t1=new Thread_class();
        Thread_class t3=new Thread_class();
        t1.start();
        t3.start();
    }
}
