import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        TwoWheeler T=new TwoWheeler();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter color:");
        String col=sc.next();
        T.getColor(col);
        System.out.println("enter number:");
        int no=sc.nextInt();
        T.getNumber(no);
        System.out.println("enter fuel consumed:");
        int f=sc.nextInt();
        T.getConsumption(f);
        FourWheeler F=new FourWheeler();
        System.out.println("enter color:");
        col=sc.next();
        F.getColor(col);
        System.out.println("enter number:");
        no=sc.nextInt();
        F.getNumber(no);
        System.out.println("enter fuel consumed:");
        f=sc.nextInt();
        F.getConsumption(f);
        
    }
}  