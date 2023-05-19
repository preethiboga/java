class Trafficlight extends Thread
{
    
    public void run()
    {
        while(true)
        {
    
        System.out.println("redlight glows");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("redlight off");
        System.out.println("yellowlight glows");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("yellowlight off");
        System.out.println("greenlight glows");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("greenlight off");
       }
        
     }

  
}

class T3
{
    public static void main(String[] args)
    {
        Trafficlight t1= new Trafficlight();
       
        t1.start();
      
       
    }
}