import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StartandEndsWith c=new StartandEndsWith();
        String s1=sc.nextLine();
        c.setStr(s1);
        String s;
        String e;
        int start=sc.nextInt();
        int end=sc.nextInt();
        s=sc.next();
        e=sc.next();
        c.SandE(start,end,s,e);
    }
}