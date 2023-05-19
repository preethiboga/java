 import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Bus b=new Bus();
        Train t=new Train();
        System.out.println("enter distance:");
        int dist=sc.nextInt();
        System.out.println("enter bus charge:");
        int bc=sc.nextInt();
        System.out.println("enter train charge:");
        int tc=sc.nextInt();
        System.out.println("amount paid to bus:"+b.getAmount(dist,bc));
        System.out.println("amount paid to train:"+t.getAmount(dist, tc));
        


    }
}