public class ThreadGroupExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Group Thread:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroup group=new ThreadGroup("My Thread Group");
        Thread t1=new Thread(group, new ThreadGroupExample(),"T1 thread");
        Thread t2=new Thread(group,new ThreadGroupExample(),"T2 thread");
        t1.start();
        t2.start();

    }
}
