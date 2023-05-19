import java.util.*;
class Main{
    public static void main(String[] args)
    {
        StringSort s=new StringSort();
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        s.setN(n);
        String [] str=new String[n+1];
        int i;
        for(i=0;i<n+1;i++){
         str[i]=sc.nextLine();
        }

        s.setS(str);
        s.sorts();
    }
}