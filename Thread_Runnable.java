public class Thread_Runnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is Running.........");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }


    public static void main(String[] args) {
        Thread_Runnable tr= new Thread_Runnable();
        Thread t= new Thread(tr);
        t.start();
    }
}
