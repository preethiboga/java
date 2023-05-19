import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Employee e=new Employee();
        Scanner sc=new Scanner(System.in);
        int i,key;
        System.out.println("no.of employees:");
        int n=sc.nextInt();
        int[] id=new int[n];
        String[] emp_name=new String[n];
        int[] emp_age=new int[n];
        String[] emp_gender=new String[n];
        String[] emp_designation=new String[n];
        int[] emp_salary=new int[n];
        String[] emp_address=new String[n];
        System.out.print("enter search id"); 
        key=sc.nextInt();      
        System.out.println("enter employee details:");
        for(i=0;i<n;i++)
        {
            System.out.print("enter id:");
            id[i]=sc.nextInt();
            System.out.print("enter name:");
            emp_name[i]=sc.next();
            System.out.print("enter age:");
            emp_age[i]=sc.nextInt();
            System.out.print("enter gender:");
            emp_gender[i]=sc.next();
            System.out.print("enter designation:");
            emp_designation[i]=sc.next();
            System.out.print("enter salary:");
            emp_salary[i]=sc.nextInt();
            System.out.print("enter address:");
            emp_address[i]=sc.next();

        }
        e.id=id;
        e.emp_name=emp_name;
        e.emp_age=emp_age;
        e.emp_gender=emp_gender;
        e.emp_designation=emp_designation;
        e.emp_salary=emp_salary;
        e.emp_address=emp_address;
        e.search(key,n);

    }
}