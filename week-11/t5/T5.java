class MyThread 
{ 
    int n=2;
    synchronized void display(int i)
    {
        if(n>0)
        {
        System.out.println("available no.of seats:"+n);
        System.out.println("ticket booked for person:"+i);
        n=n-1;
        System.out.println("available no.of seats:"+n);
        }
        else
        {
            System.out.println("unavailable to book for:"+i);
        }
    }

}
class thread1 extends Thread{
    MyThread my;
    thread1(MyThread m)
    {
        my=m;
    }
    public void run()
    {
        my.display(1);
    }
}
class thread2 extends Thread{
    MyThread my;
    thread2(MyThread m)
    {
        my=m;
    }
    public void run()
    {
        my.display(2);
    }
}
class thread3 extends Thread{
    MyThread my;
    thread3(MyThread m)
    {
        my=m;
    }
    public void run()
    {
        my.display(3);
    }
}
class T5
{
    public static void main(String[] args)
    {
        MyThread my=new MyThread();
        thread1 t1=new thread1(my);
        thread2 t2=new thread2(my);
        thread3 t3=new thread3(my);
        t1.start();
        t2.start();
        t3.start();
    }
}