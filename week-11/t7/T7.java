import java.util.*;
class D
{
    static int n;
    synchronized void display(int i)
    {
       if(n>0)
       {
           System.out.println("ticket booked for:"+i);
           n=n-1;
       }
       else
       {
           System.out.println("unavailable");
       }
    }
}
class Mythread extends Thread
{
    D d;
    int n;
    Mythread(int n,D d)
    {
        this.n=n;
        this.d=d;
    }
    public void run()
    {
       for(int i=0;i<n;i++)
       {
           d.display(i);
       }
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.f seats:");
        D.n=sc.nextInt();
        System.out.println("enter no.of persons:");
        int p=sc.nextInt();
        D d=new D();
        Mythread t1=new Mythread(p,d);
        t1.start();
    }
}