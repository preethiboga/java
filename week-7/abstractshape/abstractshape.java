abstract class Shape{
    abstract void getArea(Double r,Double a);
    abstract void getVolume(Double r,Double a);
}
class Calculations extends Shape
{
    void getArea(Double r,Double a)
    {
        System.out.println("area of circle="+3.14*r);
        System.out.println("area of square="+a*a);
        System.out.println("area of cube="+6*a*a);
        System.out.println("area of shpere="+4*3.14*r*r);
    }
    void getVolume(Double r,Double a)
    {
        System.out.println("volume of shpere="+(4/3)*3.14*r*r*r);
        System.out.println("volume of cube="+a*a*a);

    }

}