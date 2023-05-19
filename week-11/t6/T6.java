import java.util.*;
class Tm
{
    synchronized void display(int i)
    {
        System.out.println("person:"+i+"shown and entered");
    }
}
class Mythread extends Thread
{
    Tm t;
    int n;
    Mythread(Tm t,int n)
    {
        this.t=t;
        this.n=n;
    }
    public void run()
    {
            for(int i=0;i<n;i++)
          {
            t.display(i);
          }
    }
}

class Main
{
    public static void main(String[] args)
    {
        int n;
        Tm t=new Tm();
        System.out.println("enter no.of persons:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Mythread t1=new Mythread(t,n);
        t1.start();

    }
}