class Q1
{
    Q1(String msg)
    {
        System.out.println("entered string"+msg);
    }
    public static void main(String[] args)throws Exception
    {
        try{
            throw new Exception("errors in main()");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("iam finally");
        }
    }
}