abstract class Employee{
    abstract int GetAmount();
}
class WeeklyEmployee extends Employee{
    private int weeks;
    private int wage;
    public void setWeeks(int w)
    {
        weeks=w;
    }
    public void setWage(int wg)
    {
        wage=wg;
    }
    int GetAmount()
    {
        return(weeks*wage);
    }

}
class HourlyEmployee extends Employee
{
    private int hrs;
    private int wage;
    public void setHrs(int hr)
    {
        hrs=hr;
    }
    public void setWage(int wg)
    {
        wage=wg;
    }
    int GetAmount()
    {
        return(hrs*wage);
    }


}