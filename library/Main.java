import java.util.*;
class Book
{
    Scanner sc=new Scanner(System.in);
    String book_title;
    String Author_book;
    String book_isbn;
    String branch_name;
    int count;
    Book(){}
    Book(String t,String a,String isbn,String name,int c)
    {
        book_title=t;
        Author_book=a;
        book_isbn=isbn;
        branch_name=name;
        count=c;
    }
    void dis(Book arr[])
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(arr[i].book_title+" "+arr[i].count);
        }
    }
    
    void borrow(Student std,Book arr[])
    {
        System.out.println("enter no.of books");
        int n=sc.nextInt();
        int index=-1,ind1=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("enter book name:");
            String s=sc.next();
            System.out.println("enter brancname:");
            String b=sc.next();
            for(int j=0;j<5;j++)
            {
                if(arr[j].book_title.equals(s) && arr[j].branch_name.equals(b))
                {
                    index=j;
                    break;
                }
            }
            for(int k=0;k<std.z;k++)
            {
                if(std.bookname[k].equals(s))
                {
                    ind1=-1;
                }
            }
            try
            {
                if(ind1==-1)
                throw new Exception("copy available");
                if(std.z+1>3)
                  throw new Exception ("more than 3");

                else{

                    std.bookname[std.z++]=s;
                    arr[index].count--;
            
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
        std.display();
        dis(arr);
    }
    void Return(Student std,Book arr[])
    {
        System.out.println("enter no.of books");
        int n=sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++)
        {
            System.out.println("enter book name:");
            String s=sc.next();
            System.out.println("enter brancname:");
            String b=sc.next();
            for(int j=0;j<5;j++)
            {
                if(arr[j].book_title.equals(s) && arr[j].branch_name.equals(b))
                {
                    index=j;
                    break;
                }
                
            }
            int p=0;
            for(int l=0;l<std.z;l++)
            {
                if(std.bookname[l].equals(s))
                  continue;
                else
                {
                    std.bookname[p++]=std.bookname[l];
                }
            }
            
            std.z=p;
            System.out.println(std.z);
            std.r++;   
            arr[index].count++;
        }
        
        std.display();
        dis(arr);
    }
 }
class Student
{
    String st_id;
    String st_name;
    String username;
    String password;
    String bookname[]=new String[3];
    int z;
    int r;
    Student(String id,String name,String us,String pass)
    {
        st_id=id;
        st_name=name;
        username=us;

        password=pass;
        z=0;
        r=0;
    }
    void display()
    {
        System.out.println("stnmae:"+st_name);
        System.out.println("borrowed books:");
        for(int i=0;i<z;i++)
        {
            System.out.println(bookname[i]+" ");

        }
        System.out.println("no of books borrowed:"+z);
        System.out.println("no.of books returned:"+r);
    }
    
}
class Library
{

    public static void main(String args[])
    {
        String s;
        String use;
        String pass;
        int i;
        int n;
        int no;
        Scanner sc=new Scanner(System.in);
        Student sarr[]=new Student[5];
    sarr[0]=new Student("b181356","preethi","preethi","a");
    sarr[1]=new Student("b181045","haritha","haritha","b");
    sarr[2]=new Student("b181043","siri","siri","c");
    sarr[3]=new Student("b181402","anju","anju","d");
    sarr[4]=new Student("b181443","latha","latha","e");
    Book B=new Book();
    Book arr[]=new Book[5];
    arr[0]=new Book("os","sarika","os","cse",1);
    arr[1]=new Book("flat","geetha","flat","it",2);
    arr[2]=new Book("Ai","venkat","ai","mech",3);
    arr[3]=new Book("ss","gaya","ss","ece",4);
    arr[4]=new Book("sos","sravan","sos","human",5);
        while(true)
        {
            System.out.println("do you want to enter to library:");
            System.out.println("enter yes or no:");
            s=sc.next();
            switch(s)
            {
            case "yes":
                System.out.println("enter credentials:");
                use=sc.next();
                pass=sc.next();
                int index=-1;
                for(i=0;i<5;i++)
                {
                    if(sarr[i].username.equals(use) && sarr[i].password.equals(pass))
                    {
                        index=i;
                        break;
                    }

                }
                try{
                    if(index==-1)
                    throw new Exception("creditianls mismatch");
                    else
                    {  boolean x=true;
                        while(x)
                        {
                           System.out.println("1.Borrow\n2.Return\n");
                            n=sc.nextInt();
                            
                            switch(n)
                            {
                                case 1:
                                  B.borrow(sarr[index],arr);
                                  break;
                                case 2:
                                   B.Return(sarr[index],arr);
                                   break;
                                case 3:x=false;
                                     
                            }
                        }
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                break;
            case "no":
                 System.exit(0);
            }
        }        

    }
}