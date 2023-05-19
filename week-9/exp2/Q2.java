import java.io.*;
import java.util.*;
class Q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int ans=a/b;
            System.out.println(ans);

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage()+"enter valid number");
        }
        catch(ArithmeticException e)
        {
            System.out.println("denominater cant be 0");
        }
        finally{
            System.out.println("Iam finally");
        }
    }
}