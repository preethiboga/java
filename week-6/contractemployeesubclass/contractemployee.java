class ContractEmployee{
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
class HourlyEmployee extends ContractEmployee
{
    private int hrs;
    private int wages;
    void setHrs(int hrs)
    {
        this.hrs=hrs;
    }
    int getHrs()
    {
        return hrs;
    }
    void setWages(int wage)
    {
        wages=wage;
    }
    int getWages()
    {
        return wages;
    }
    int calcSalary()
    {
        return wages*hrs;
    }
    void  getDesig()
    {
        System.out.println("HourlyEmployee");
    }
    


}
class WeeklyEmployee extends ContractEmployee
{
    private int weeks;
    private int wages;
    void setWeeks(int weeks)
    {
        this.weeks=weeks;
    }
    int getWeeks()
    {
        return weeks;
    }
    void setWages(int wage)
    {
        wages=wage;
    }
    int getWages()
    {
        return wages;
    }
    int calcSalary()
    {
        return wages*weeks;
    }
    void getDesig()
    {
        System.out.println("WeeklyEmployee");
    }

}