public class ThreadCreation extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            try 
            {
                
                Thread.sleep(1000);
            } 
            catch (InterruptedException e)
             {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        
        ThreadCreation t1=new ThreadCreation();
        ThreadCreation t2=new ThreadCreation();
        t1.start();
        t2.start();
    }

}