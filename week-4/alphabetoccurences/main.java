import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Occurences c=new Occurences();
        String s1=sc.nextLine();
        char ch=sc.next().charAt(0);
        c.setSC(s1,ch);
        System.out.println(c.occ());

    }
}