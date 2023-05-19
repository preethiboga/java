import java.util.*;
class Uppercase{
    private String s1;
    public void setStr(String s1)
    {
        this.s1=s1;
    }
    void upperlower()
    {
        String s2=s1.toLowerCase();
        System.out.println(s2);
        String s3=s1.toUpperCase();
        System.out.println(s3);
   
    }
}