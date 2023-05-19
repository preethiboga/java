import java.util.*;
class ConsumerThread extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(10000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("not over:"+i);
        }
        System.out.println("over");
    }
}
class T2
{
    public static void main(String[] args)
    {
        ConsumerThread t1=new ConsumerThread();
        t1.start();
    }
}