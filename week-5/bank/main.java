
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter balance:");
        double b=sc.nextDouble();
            Bank B=new Bank(b);
        System.out.print("enter name:");
        String s=sc.next();
        B.setName(s);
        System.out.print("enter address:");
        String A=sc.next();
        B.setAddress(A);
        System.out.print("enter acc number:");
        String n=sc.next();
        B.setNumber(n);
        System.out.print("enter amount to credit:");
        Double c=sc.nextDouble();
        B.credit(c);
        System.out.print("enter amount to debit:");
        Double d=sc.nextDouble();
        B.debit(d);
        System.out.print("Balance="+B.getBalance());

    }
}