import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Add3 ad=new Add3();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        ad.setAB(a,b);
        ad.setC(c);
        System.out.println(ad.add());
    }
}