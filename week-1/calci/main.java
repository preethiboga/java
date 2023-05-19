import java.util.*;
class Main{
    public static void main(String[] args){
        Calci cc=new Calci();
        Scanner sc=new Scanner(System.in);
        int a,b,ch;
        a=sc.nextInt();
        b=sc.nextInt();
        cc.setAB(a,b);
        do{
            System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.mod\n0.exit\n");
            System.out.println("enter Choice:");
            ch=sc.nextInt();
            System.out.println(cc.calci(ch));
        }while(ch!=0);
    }


}