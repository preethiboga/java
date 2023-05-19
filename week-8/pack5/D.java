import oops.JAVA.C1;
import oops.JAVA.C2;
class D implements C2
{
    public void m()
    {
        System.out.println("m interface");
    }
    public static void main(String[] args)
    {
        C1 c=new C1();
        c.a(3);
        D d=new D();
        d.m();
    }
}