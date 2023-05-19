import jdk.jshell.ImportSnippet;

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Calculations c=new Calculations();
        System.out.println("enter side of square:");
        Double a=sc.nextDouble();
        System.out.println("enter radius of circle:");
        Double r=sc.nextDouble();
        c.getArea(r,a);
        c.getVolume(r,a);


    }
}