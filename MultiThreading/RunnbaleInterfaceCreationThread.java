public class RunnbaleInterfaceCreationThread implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("this is thread");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        RunnbaleInterfaceCreationThread r1=new RunnbaleInterfaceCreationThread();
        // Thread th=new Thread(r1);
        // th.start()
        r1.run();// yes we cam directally call the run methods
       String str= Thread.currentThread().getName();
       System.out.println(str);
    }
    
}
