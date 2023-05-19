interface Vehicle{
    void getColor(String s);
    void getNumber(int n);
    void getConsumption(int l);
}
class TwoWheeler implements Vehicle
{
    public void getColor(String s)
    {
        System.out.println("twowheeler color:"+s);
    }
    public void getNumber(int n)
    {
        System.out.println("twowheeler number:"+n);
    }
    public void getConsumption(int l)
    {
        System.out.println("twowheeler fuel consumption="+l);
    }
}
class FourWheeler implements Vehicle
{
    public void getColor(String s)
    {
        System.out.println("fourwheeler color:"+s);
    }
    public void getNumber(int n)
    {
        System.out.println("fourwheeler number:"+n);
    }
    public void getConsumption(int l)
    {
        System.out.println("fourwheeler fuel consumption="+l);
    }
    
}