import java.util.*;

class Electricity{
    private int n;
    int minCharge=100;
    void SetUnits(int n)
    {
        this.n=n;
    }
    int bill()
    {
        int ans=minCharge;
        if(n<=25)
        ans=ans+(n*10)+minCharge;
        else if(n>=26 && n<=50)
        ans=ans+(n*20)+minCharge;
        else if(75>=n && n>=51)
        ans=ans+minCharge+(n*30);
        else if(100>=n && n>=76)
        ans=ans+minCharge+(n*40);
        else
        ans=ans+minCharge+(n*50);
        return ans;
    }

}
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of units:");
        int n=sc.nextInt();
        Electricity e=new Electricity();
        e.SetUnits(n);
        System.out.println("total bill="+e.bill());
    }
}