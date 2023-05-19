import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Sorted array=new Sorted();
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        array.setN(n);
        int[] a=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        array.setArray(a);
        array.sorting();

    }
}