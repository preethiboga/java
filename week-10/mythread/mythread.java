class MyThread extends Thread{
 public void run()
    {
        int i;
       for(i=1;i<=10;i++)
       System.out.println(i);
    }
}
class Main{
    public static void main(String[] args)
    {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.start();
        t2.start();
    }
}