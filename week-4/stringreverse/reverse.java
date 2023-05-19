import java.util.*;
class Reverse{
    private String s1;
    public void setStr(String s1)
    {
        this.s1=s1;
    }
    void rev()
    {
        int n=s1.length();
        char[] rev=new char[n];
        int i;
        for(i=n-1;i>=0;i--)
        {
            char r=s1.charAt(i);
            System.out.print(r);
        }
       

    }
}