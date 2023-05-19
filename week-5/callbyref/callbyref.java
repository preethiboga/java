import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        IntWrapper i1=new IntWrapper(a);
        IntWrapper i2=new IntWrapper(b);
        System.out.println("before swapping a="+i1.a+"b="+i2.a);
        swap(i1,i2);
        System.out.println("after swapping a="+i1.a+"b="+i2.a);

    }
    public static void swap(IntWrapper a,IntWrapper b)
    {
        IntWrapper c=  new IntWrapper(a.a);
        a.a=b.a;
        b.a=c.a;
        System.out.println("a="+a.a+"b="+b.a);
    }
}
class IntWrapper
{
    int a;
    public IntWrapper(int a)
    {
        this.a=a;

    }
}