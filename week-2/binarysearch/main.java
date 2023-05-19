import java.util.*;
class Main{
    public static void main(String[] args)
    {
        BinarySearch array=new BinarySearch();
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
        int key;
        key=sc.nextInt();
        array.setKey(key);
        array.setArray(a);
        array.search();

    }
}