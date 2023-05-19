import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        Calculation c=new Calculation();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary of employee:");
        int sal=sc.nextInt();
        System.out.println("enter invoice payment:");
        int invoice=sc.nextInt();
        c.setInvoice(invoice);
        c.setSal(sal);
        c.getAmount();
    }
}  