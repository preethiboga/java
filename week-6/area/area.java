class Area{
    final static Double pi=3.14;
    void area(int x)
    {
        System.out.println("area of square="+x*x);
    }
    void area(int x,int y)
    {
        System.out.println("area of rectangle="+x*y);
    }
    void area(double r)
    {
        System.out.println("area of circle="+pi*r*r);
    }

}