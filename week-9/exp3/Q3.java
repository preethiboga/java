class Q3
{
    public static void main(String[] args)
    {
         Q3 ob=new Q3();
         try{
             ob.one(0);
         }
         catch(Exception e)
         {
             System.out.println("exception thrown by two catched in main");
         }
         

    }
    void one(int a) throws ArithmeticException
    {
        two(a);
    }
    void two(int a) throws ArithmeticException
    {
       
             int b=10/a;
             System.out.println(b);
    }
}