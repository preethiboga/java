import java.util.*;
class StartandEndsWith{
    private String s1;
    public void setStr(String s1)
    {
        this.s1=s1;
    }
    void SandE(int start,int end,String s,String e)
    {
        String s2=s1.substring(start,end);
        System.out.println(s2);
        System.out.print("starts with check:");
        System.out.println(s2.startsWith(s));
        System.out.print("ends with check:");
        System.out.println(s2.endsWith(e));
   
    }
}