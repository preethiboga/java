import java.util.*;
class CallByValue
{
  
    public static void main(String args[])
    {
        CallByValue c=new CallByValue();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swapping a="+a+"b="+b);
        swap(a,b);
       
        
    }
    public static void swap(int a,int b)
  {
      int c=a;
      a=b;
      b=c;
      System.out.println("after swapping a="+a+"b="+b);
  }

}