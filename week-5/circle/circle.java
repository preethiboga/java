class Circle{
    private double r;
    final double pi=3.14;
    void setR(double r)
    {
        this.r=r;
    }
    double Area()
    {
        return(pi*r*r);
    }
    double perimeter()
    {
        return (2*pi*r);
    }

}