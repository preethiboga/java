import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Concat c=new Concat();
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        c.setStr(s1,s2);
        System.out.println(c.conc());

    }
}