import java.util.*;
class Duplicate{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]={0,0,0,0,0};
        int i,j,t,s=0,r=0,flag;
        for(i=0;i<5;i++)
        {
            flag=0;
            t=sc.nextInt();
            if(t>=10 && t<=100)
            {
                for(j=0;j<r;j++)
                {
                    if(a[j]==t)
                    {
                        flag=1;
                        System.out.println("entered duplicate");  
                        break; 
                    }    
                }
                if(flag==1)
                {
                    i--;
                    continue;
                }
                else
                {
                    a[i]=t;
                    r++;
                }   
            }
            else
            {
                System.out.println("not in range");
                i--;
                continue;
            }
        }
        for(i=0;i<5;i++)
        System.out.print(a[i]+" ");
    }
}