public class Priority_Thread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Running thread name is :"+ Thread.currentThread().getName());
        System.out.println("Running thread priorities is :"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Priority_Thread pt= new Priority_Thread();
        Priority_Thread pt1= new Priority_Thread();
        Priority_Thread pt3= new Priority_Thread();
        pt.setPriority(Thread.MIN_PRIORITY);
        pt1.setPriority(Thread.MAX_PRIORITY);
        pt3.setPriority(Thread.NORM_PRIORITY);
        pt.start();
        pt1.start();
        pt3.start();
    }
}
