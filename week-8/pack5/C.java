import oops.A;
import oops.B;
class C implements B
{
    public void m1()
    {
        System.out.println("method m1");
    }
    public static void main(String[] args)
    {
        A a=new A();
        C c=new C();
        a.display();
        c.m1();
    }
}