import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        int a;
        Double b;
        Scanner sc=new Scanner(System.in);
        Product pro=new Product();
        do{
            System.out.println("product-1:$99.90");
            System.out.println("product-2:$20.20");
            System.out.println("product-3:$6.78");
            System.out.println("product-4:$45.50");
            System.out.println("product-5:$40.49");
            System.out.println("exit-0");
            System.out.print("enter product number:");
            a=sc.nextInt();
            pro.p=a;
            System.out.print("enter quantity:");
            b=sc.nextDouble();
            if(a>0)
            {
              pro.q=b;
            }
            else
            {
                pro.q=0.0;
            }
            pro.s(a,b);
            
            
        }while(a!=0);

    }
}