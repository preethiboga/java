import calci.Add;
import calci.Sub;
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean x=true;
      while(x)
      {
          System.out.println("1.add\n2.sub\n3.exit\n");
          int n;
          n=sc.nextInt();
          switch(n)
          {
              case 1:
                 Add a1=new Add();
                 a1.add();
                 break;
              case 2:
                 Sub b1=new Sub(); 
                 b1.sub();
                 break;
              case 3:
                x=false;
                System.exit(0);

          }
      }
    }
}