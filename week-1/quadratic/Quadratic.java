import javax.lang.model.util.ElementScanner14;

public class Quadratic{
    private double a,b,c;
    double root1,root2,imaginary;
    public void setABC(double p,double q,double r)
    {
        this.a=p;
        this.b=q;
        this.c=r;
    }
    void root()
    {
        double d;
        d=(b*b)-(4*a*c);
        if(d==0)
        {
            root1=root2=(-b+Math.sqrt(d))/(2*a);
            System.out.println("two equal roots="+root1+" "+root2);
        }
        else if(d>0)
        {
            root1=(-b+Math.sqrt(d))/(2*a);
            root2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("two distinct real roots="+root1+" "+root2);

        }
        else
        {
            root1=root2=(-b)/(2*a);
            imaginary=Math.sqrt(-d)/(2*a);
            System.out.println("two distinct imaginary roots="+root1+imaginary+" "+root2+imaginary);
        }
    }
    

}