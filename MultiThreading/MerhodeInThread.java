public class MerhodeInThread extends Thread{
    public void run()
    {
        for(int i=0;i<=4;i++)
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
        MerhodeInThread m1=new MerhodeInThread();
        MerhodeInThread m2=new MerhodeInThread();
        MerhodeInThread m3=new MerhodeInThread();
        m1.start();
        System.out.println("__________");
        try
        {
            m1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        m2.start();
          try
        {
            m2.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("___________");
        m3.start();
    }
    
}
