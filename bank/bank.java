import java.util.*;
class Account
{
    String bankname;
    String branchname;
    String acc_name;
    String acc_no;
    int acc_bal;
    String acc_add;
    Account( String bn,String brn,String accn,String accc_no,int acc_b,String acc_ad)
    {
        bankname=bn;
        branchname=brn;
        acc_name=accn;
        acc_no=accc_no;
        acc_bal=acc_b;
        acc_add=acc_ad;
    }
    void credit(int n)
    {
        acc_bal+=n;

    }
    void debit(int n) //throws Exception;
    {
        try {
            if(n>acc_bal)
                throw new Exception ("insufficient balnace");
            else
                acc_bal=acc_bal-n;
           
        }
         catch (Exception e) {
             System.out.println(e);
        }
            //TODO: handle exception

    }
    void getbalance()
    {
        System.out.println("balance:"+acc_bal);

    }
}
class Main
{
    
    public static void main(String[] args) // throws Exception;
    {
       
        int n=0;
        String s;
        int c=0;
        Scanner sc=new Scanner(System.in);
        Account[] arr= new Account[4];
        arr[0]=new Account("SBI","basar","preethi","1",2000,"knr");
        arr[1]=new Account("SBI","basar","Haritha","2",3000,"ootur");
        arr[2]=new Account("SBI","nizambad","anjani","3",4000,"ngl");
        arr[3]=new Account("SBI","nizambad","uma","4",5000,"hyd");
        while(true)
         {
            System.out.println("do you want to enter:enter yes\n do you want exit:enter no\n");
            s=sc.nextLine();
           switch(s)
           {
               case "yes":
           
                    String username;
                    String password;
                    boolean x=true;
                    int flag=-1;
                    System.out.print("enter username:");
                    username=sc.nextLine();
                    System.out.println("enter password:");
                    password=sc.nextLine();
                    int i;
                    for(i=0;i<4;i++)
                    {
                        if((username.equals(arr[i].branchname) && (password.equals(arr[i].acc_no))))
                        {
                            flag=i;
                            break;
                        }

                    }
                try {
                      if(flag==-1)
                       {
                        throw new Exception("mismatch");
                       }
                    else
                    {    while(x)
                        {
                         System.out.println("1.credit\n2.debit\n3.getbalance\n4.exit\n");
                         System.out.println("enter any option:");
                         n=sc.nextInt();
                         switch(n)
                        {
                            case 1:
                               System.out.println("enter amount to credit:");
                               c=sc.nextInt();
                                arr[flag].credit(c);
                                break;
                            case 2:
                            System.out.println("enter amount to debit:");
                            c=sc.nextInt();
                                arr[flag].debit(c);
                                break;
                            case 3:
                                arr[flag].getbalance();
                                break;
                            case 4:x=false;
                                   break;


                        }
                    }
                    }   
                    
                
                }
                catch (Exception e) {
                    System.out.println(e);
                    //TODO: handle exception
                }
                break;
                case "no":System.exit(0);

            }
           
        } 
            
    }

}