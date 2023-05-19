class ExampleStatic{
    private int a,b;
    static int c;
    public static void setC(int c)
    {
        ExampleStatic.c=c;
    }
    public ExampleStatic(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void add()
    {
        System.out.println(a+b+c);
    }
    
}