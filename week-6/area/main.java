import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        double r=sc.nextDouble();
        Area obj=new Area();
        obj.area(x);
        obj.area(x,y);
        obj.area(r);
    }
}