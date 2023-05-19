import java.util.*;
class Employee{
    int id[];
    String emp_name[];
    int emp_age[];
    String emp_gender[];
    String emp_designation[];
    int emp_salary[];
    String emp_address[];
    void search(int searchid,int n)
    {
        int i,s;
        for(i=0;i<n;i++)
        {
            if(id[i]==searchid)
            {
                System.out.print(" id="+id[i]+" emp_name="+emp_name[i]+" emp_age="+emp_age[i]+" emp_gender="+emp_gender[i]+" emp_designation="+emp_designation[i]+" emp_salary="+emp_salary[i]+" emp_address="+emp_address[i]);
                break;

            }

        }
        if(i==n)
    System.out.println("not found");
    }


}