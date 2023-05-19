import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        VowelConsonant c=new VowelConsonant();
        String s1=sc.nextLine();
        c.setStr(s1);
        c.count();

    }
}