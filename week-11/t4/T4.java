import java.util.*;
class mythread
{
    synchronized void display(int i)
    {
        System.out.println(i+"got ticket");
        System.out.println(i+"shown");
        System.out.println(i+"entered");
    }

}
class Theatre1 extends Thread
{
    mythread my;
    Theatre1(mythread m)
    {
        my=m;
    }
    public void run()
    {  
      my.display(1);
    }
    
}
class Theatre2 extends Thread
{
    mythread my;
    Theatre2(mythread m)
    {
        my=m;
    }
    public void run()
    {  
      my.display(2);
    }
    
}
class Theatre3 extends Thread
{
    mythread my;
    Theatre3(mythread m)
    {
        my=m;
    }
    public void run()
    {  
      my.display(3);
    }
    
}
class T4
{
    public static void main(String[] args)
    {
    
        mythread m=new mythread();
        Theatre1 t1=new Theatre1(m);
        Theatre2 t2=new Theatre2(m);
        Theatre3 t3=new Theatre3(m);
        t1.start();
        t2.start();
        t3.start();
    }
}