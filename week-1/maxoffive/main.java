import java.util.*;
class Main{
    public static void main(String[] args)
    {
        int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        MaxOfFive M=new MaxOfFive();
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        M.setA(a,b,c,d,e);
        System.out.println(M.maxi());
        System.out.println(M.mini());

    }
}