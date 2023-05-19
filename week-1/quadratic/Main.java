import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        Quadratic q=new Quadratic();
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        q.setABC(a,b,c);
        q.root();
        

    }
}