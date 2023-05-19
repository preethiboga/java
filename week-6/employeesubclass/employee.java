
class Employee{
    private String first_name;
    private String Last_name;
    String getFirstName()
    {
        return first_name;
    }
    String getLastName()
    {
        return Last_name;
    }
    void setFirstName(String Fname)
    {
        first_name=Fname;
    }
    void setLastName(String Lname)
    {
        Last_name=Lname;
    }

}
class ContractEmployee extends Employee{
    String department;
    String designation;
    double salary;
    void displayFullName()
    {
        System.out.println("fullname:"+getFirstName()+getLastName());
    }
    String getDepartment()
    {
        return department;
    }
    String getDesig()
    {
        return designation;
    }
    void setDepartment(String d)
    {
        department=d;
    }
    void setDesig(String des){
        designation=des;
    }
    void setSalary(double salary)
    {
        this.salary=salary;
    }
    double getSalary()
    {
        return salary;
    }


}
class RegularEmployee extends Employee{
    String department;
    String designation;
    double salary;
    void displayFullName()
    {
        System.out.println("fullname:"+getFirstName()+getLastName());
    }
    String getDepartment()
    {
        return department;
    }
    String getDesig()
    {
        return designation;
    }
    void setDepartment(String d)
    {
        department=d;
    }
    void setDesig(String des){
        designation=des;
    }
    void setSalary(double salary)
    {
        this.salary=salary;
    }
    double getSalary()
    {
        return salary;
    }
    
}