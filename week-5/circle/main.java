import java.util.*;
class Main{
    public static void main(String[] args)
    {
        double r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextDouble();
        Circle c=new Circle();
        c.setR(r);
        System.out.println("area="+c.Area());
        System.out.println("perimeter="+c.perimeter());
    } 
}