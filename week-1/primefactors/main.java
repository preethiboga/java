import java.util.*;
class Main{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Primefactors p=new Primefactors();
        p.setN(n);
       p.prime();
    }
}