import java.util.*;
class Gcd
{
    int a;
    int b;
    void gcd()
    {
        int r=0;
        while(a%b!=0)
        {
            r=a%b;
            a=b;
            b=r;  
        }
        System.out.println("gcd="+r);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Gcd g=new Gcd();
        g.a=sc.nextInt();
        g.b=sc.nextInt();
        g.gcd();
    }
}