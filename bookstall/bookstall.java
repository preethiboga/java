import java.util.*;
class BookStall
{
    String bookName;
    String authorName;
    int count;
    BookStall(String bookName,String authorName,int count)
    {
        this.count=count;
        this.bookName=bookName;
        this.authorName=authorName;
    }

}
class Main{
    public static void main(String[] args)
    {
       int n,ch;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no.of types of books:");
       n=sc.nextInt();
       BookStall[] B=new BookStall[n];
       int i=0;
       for(i=0;i<n;i++)
       {
           System.out.println("enter name of the book:");
           String bookName=sc.next();
           System.out.println("enter author name:");
           String authorName=sc.next();
           System.out.println("enter count:");
           int c=sc.nextInt();
           B[i]=new BookStall(bookName,authorName,c);  
       }
      // System.out.println("bookname"+" "+"authorname"+" "+"count\n");
       for(i=0;i<n;i++)
       {
           System.out.println(B[i].bookName+" "B[i].authorName+" "B[i].count);
       }
       do{  
            System.out.println("1.buy\n2.no\n");
            System.out.println("enter choice:");
             ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                   System.out.println("enter customer info:");
                   System.out.println("enter customer id:");
                   int cid=sc.nextInt();
                   System.out.println("enter customer name:");
                   String cname=sc.next();
                   System.out.println("enter customer address:");
                   String caddress=sc.next();
                   System.out.println("enter which book do you want to buy:");
                   String book=sc.next();
                   for(i=0;i<n;i++)
                   {
                       if((B[i].bookName.compareTo(book))==0)
                       {
                           if(B[i].count>0)
                           {
                               B[i].count--;
                               System.out.println("your purchase successfull\n");
                               System.out.println("remaining stock="+B[i].count);
                               break;
                           }
                       }
                       else
                       {
                           System.out.println("out of stock");

                       }
                   }
                   if(i==n)
                   System.out.println("not found");
                   break;
                 case 2:
                     System.exit(0);
                     break;
                 default:
                    System.out.println("invalid");      


            }
       }while(ch!=2);

    }
}