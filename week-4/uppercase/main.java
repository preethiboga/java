import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Uppercase c=new Uppercase();
        String s1=sc.nextLine();
        c.setStr(s1);
        c.upperlower();
    }
}