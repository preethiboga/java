import java.util.*;
class Product{
    int p;
    Double q;
    Double p1=0.0;
    Double p2=0.0;
    Double p3=0.0;
    Double p4=0.0;
    Double p5=0.0;
    void s(int p,Double q)
    {
        int i;
            switch(this.p)
            {
                case 0:
                    System.out.println("product1="+p1+" product2="+p2+" product3="+p3+" product4="+p4+" product5="+p5);
                    System.out.println("total="+(p1+p2+p3+p4+p5));
                    System.exit(0);
                    break;
                case 1:
                     p1=p1+99.90*q;
                     break;
                case 2:
                     p2=p2+20.20*q;
                     break;     
                case 3:
                     p3=p3+6.87*q;
                     break;  
                case 4:
                     p4=p4+45.50*q;
                     break; 
                case 5:
                     p5=p5+40.49*q;
                     break;
                default:
                     System.out.print("Invalid");             
            }
            
    }




}