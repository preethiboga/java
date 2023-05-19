import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        WeeklyEmployee w=new WeeklyEmployee();
        HourlyEmployee H=new HourlyEmployee();
        System.out.println("enter no.of weeks:");
        int weeks=sc.nextInt();
        System.out.println("wage of weekly employee:");
        int wage=sc.nextInt();
        w.setWeeks(weeks);
        w.setWage(wage);
        System.out.println("enter no.of hrs:");
        int hrs=sc.nextInt();
        System.out.println("wage of hourly employee:");
        int wages=sc.nextInt();
        H.setHrs(hrs);
        H.setWage(wages);
        System.out.println("amount paid to weekly employee:"+w.GetAmount());
        System.out.println("amount paid to hourly employee:"+H.GetAmount());
    


    
    }
}