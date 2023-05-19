import java.lang.*;
class Calci{
    int c;
    private int a,b;
    public void setAB(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int calci(int ch)
    {
        switch(ch)
        {
            case 1:
               c=a+b;
               break;
            case 2:
                c=a-b;
                break;
            case 3:
                c=a*b;
                break;
            case 4:
               c=a/b;
               break;
            case 5:
                c=a%b;
                break;
            case 0:
                System.exit(0);
                break;  
            default:
                System.out.println("invalid");              
                
        }
        return c;
    }
    
}