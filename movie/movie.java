import java.util.*;
class  Movie
{
    int i,j;
    String title;
    int screen_no;
    int no_of_tickets;
    String[][] seat_no;
    int fare;
    String message;
    Movie(String t,int sc_no)
    {
        title=t;
        screen_no=sc_no;
        no_of_tickets=10;
        seat_no=new String[2][5];
        for(i=0;i<2;i++)
        {
            for(j=0;j<5;j++)
            {
                seat_no[i][j]="nb";
            }
        }
        fare=200;
        message="Enjoy the movie";

    }
    void display()
    {
        for(i=0;i<2;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print(seat_no[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enjoy the movie");

    }

}
class Main
{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Movie[] arr=new Movie[4];
        arr[0]=new Movie("a",1);
        arr[1]=new Movie("b",2);
        arr[2]=new Movie("c",3);
        arr[3]=new Movie("d",4);
        int i,j;
        int s,n,r,c,p=0;
        int ch;
        while(true)
       {
            System.out.println("1.watch:\n2.exit");
            System.out.println("enter option:");
            ch=sc.nextInt();
            switch(ch)
            {  
               case 1: 
                  System.out.println("enter screen no:");
                  s=sc.nextInt(); 
                  switch(s)
                  {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                       do
                        {
                              System.out.println("enter no.of seats:");
                              n=sc.nextInt();
                           try{
                                 if(n>arr[s].no_of_tickets)
                                 {
                                    throw new Exception("no seats");
                                 }
                               else
                                {
                                    arr[s].display();
                                    for(i=0;i<n;i++)
                                    {
                                    System.out.println("enter row:");
                                    r=sc.nextInt();
                                    System.out.println("enter col:");
                                    c=sc.nextInt();
                                    arr[s].seat_no[r-1][c-1]="B";
                                    }
                                    arr[s].no_of_tickets-=n;
                                    arr[s].display();
                                    System.out.println("1.you want to book more tickets\n2.no\n");
                                    System.out.println("enter your choice:");
                                    p=sc.nextInt();

                               }
                            }
                             catch(Exception e)
                              {
                               System.out.println(e);
                               }
                        }while(p!=2);
                    } 
                    break;  
            case 2:
               System.exit(0);        

            } 
        }

    }
    
}