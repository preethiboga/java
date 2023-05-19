class BookStall{
    int types;
    private String[] bookname=new String[types];
    private String[] bookauthor=new String[types];
    private int[] count=new int[types];
    void setBookname(String[] a)
    {
        bookname=a;
    }
    void setBookauthor(String[] auth)
    {
        bookauthor=auth;
    }
    void setCount(int[] c)
    {
        count=c;
    }
    String[] getBookname()
    {
        return bookname;
    }
    String[] getBookauthor()
    {
        return bookauthor;
    }
    int[] getCount()
    {
        return count;
    }
    void buy(String book,int cid,String cname,String cadress)
    {
        System.out.println("Customer info:");
        System.out.println("customer_id="+cid);
        System.out.println("Customer_name="+cname);
        System.out.println("Customer_Address="+cadress);
        System.out.println("bookname="+book);
        int i;
        for(i=0;i<types;i++)
        {
            if((book.compareTo(bookname[i]))==0)
            {
                if(count[i]>0)
                {
                    count[i]--;
                    System.out.println("remaining stock="+count[i]);
                    break;
                }
                else{
                    System.out.println("out of stock");
                }
            }
        }
        if(i==types)
        System.out.println("not found");
    }

}
class Main{
    public static void main(String[] args)
    {
        BookStall B=new BookStall();
        String[] bookname={"dbms","novels","coa","daa","thriller"};
        String[] bookauthor={"korth","chetanbaghat","willson","DAA","Preethi"};
        int[] count={10,4,6,7,5};
        B.setBookname(bookname);
        B.setBookauthor(bookauthor);
        B.setCount(count);
        B.types=5;
        B.buy("novels",1356,"vikas","knr");
        
    }
}