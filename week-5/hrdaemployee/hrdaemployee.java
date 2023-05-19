import java.util.*;
class Employee{
    int salary;
    int rent;
    int percent;
    double total()
    {
        return(salary+((percent*rent)/100));
    }
}
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         Employee e=new Employee();
         e.salary=sc.nextInt();
         e.rent=sc.nextInt();
         e.percent=sc.nextInt();
         System.out.println("total salary="+e.total());
    }
}