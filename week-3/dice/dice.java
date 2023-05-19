import java.util.*;

class Dice{
    int count()
    {
        //Random rand=new Random();
        int c=0,i;
        for(i=0;i<10;i++)
        {
            int k=(int) Math.ceil(Math.random()*6);
            int l=(int)Math.ceil(Math.random()*6);
            System.out.println("k="+k+" "+"l="+l);
            if(k==l)
            c++;
        }
        return c;
    }
    
}
class Main{
    public static void main(String[] args)
    {
        Dice d=new Dice();
        System.out.println("no.of success="+d.count());
    }
}