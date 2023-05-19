import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinearSearch array=new LinearSearch();
        int n=sc.nextInt();
        array.setN(n);
        int[] a=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        array.setArray(a);
        int key;
        key=sc.nextInt();
        array.setKey(key);
        System.out.println("index="+array.search());
    
    }

}