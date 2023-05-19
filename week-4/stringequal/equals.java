import java.util.*;
class Equals{
    private String s1;
    private String s2;
    public void setStr(String s1,String s2)
    {
        this.s1=s1;
        this.s2=s2;
    }
    void eq()
    {
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

    }
}