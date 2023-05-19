import java.util.*;
class Concat{
    private String s1;
    private String s2;
    public void setStr(String s1,String s2)
    {
        this.s1=s1;
        this.s2=s2;
    }
    String conc()
    {
        return(s1+s2);
    }
}