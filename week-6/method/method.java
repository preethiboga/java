class A{
    int a,b,c;
    A(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    A(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    int add()
    {
        System.out.println("base class\n");
        return this.a+this.b;
    }
    
}
class B extends A{
   
    B(int a,int b,int c)
    {
        super(a,b);
        this.c=c;
    }
    int add()
    {
        System.out.println("child class\n");
        return super.add()+c;

    }

}