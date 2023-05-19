import java.util.*;
class MyException extends Exception
{
    String msg;
    MyException(String Msg)
    {
        msg=Msg;
    }
    void print()
    {
        System.out.println(msg);
    }
}
class Q6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try{
            if(a==0)
            throw new MyException("zero");
            System.out.println("a="+a);
        }
       catch (MyException e) {
            e.print();
        }
    }
}
