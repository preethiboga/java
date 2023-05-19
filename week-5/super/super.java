class Add2{
    private int a,b;
    public void setAB(int a,int b )
    {
        this.a=a;
        this.b=b;
    }
    int add()
    {
        return a+b;
    }
}
class Add3 extends Add2{
    int c;
    public void setC(int c )
    {
        
        this.c=c;
    }
    int add()
    {
        return super.add()+c;
    }
    

}