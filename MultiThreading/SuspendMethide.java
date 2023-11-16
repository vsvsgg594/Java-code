public class SuspendMethide extends Thread {
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            try
            {
                Thread.sleep(1000);

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        SuspendMethide s1=new SuspendMethide();
        SuspendMethide  s2=new SuspendMethide();
        SuspendMethide s3=new SuspendMethide();
        s1.start();
        s2.start();
        s2.suspend();
        s3.start();
    }
    
}
