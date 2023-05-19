import java.util.*;

import javax.lang.model.util.ElementScanner14;
class ScoreCard{
   private int os;
   private int oops;
   private int ai;
   private int pom;
   private int ss;
   String sub[]={"os","oops","ai","pom","ss"};
   void setSub(int os,int oops,int ai,int pom,int ss)
   {
       this.os=os;
       this.oops=oops;
       this.ai=ai;
       this.pom=pom;
       this.ss=ss;
   }
   void grade()
   {
    /*if(os<30)
    {
        System.out.println("failed in os");
    }
    if(oops<30)
    {
        System.out.println("failed in oops");
    }
    if(ai<30)
    {
        System.out.println("failed in ai");
    }
    if(pom<30)
    {
        System.out.println("failed in pom");
    }
    if(ss<30)
    {
        System.out.println("failed in ss");
    }*/
       SubGrade("os",os);
       SubGrade("oops",oops);
       SubGrade("ai",ai);
       SubGrade("pom",pom);
       SubGrade("ss",ss);
       int t=(os+oops+ai+pom+ss);
       if(t>=450)
       System.out.println("overall grade=excellent");
       else if(t<450 && t>=400)
       System.out.println("overall grade=A");
       else if(t<400 && t>=300)
       System.out.println("overall grade=B");
       else if(t<300 && t>=200)
       System.out.println("overall grade=C");
       else if(t<200 && t>=100)
       System.out.println("overall grade=D");
       else
       System.out.println("overall grade=Fail");
   }
   void SubGrade(String s,int n)
   {
       if(n>=90)
       System.out.println(s+"=excellent");
       else if(n<90 && n>=80)
       System.out.println(s+"=A");
       else if(n<80 && n>=70)
       System.out.println(s+"=B");
       else if(n<70 && n>=60)
       System.out.println(s+"=c");
       else if(n<60 && n>=50)
       System.out.println(s+"=D");
       else if(n<50 && n>=40)
       System.out.println(s+"=P");
       else
       System.out.println(s+"=R");
   }
}
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ScoreCard s=new ScoreCard();
        System.out.print("enter os marks:");
        int os=sc.nextInt();
        System.out.print("enter oops marks:");
        int oops=sc.nextInt();
        System.out.print("enter ai marks:");
        int ai=sc.nextInt();
        System.out.print("enter pom marks:");
        int pom=sc.nextInt();
        System.out.print("enter ss marks:");
        int ss=sc.nextInt();
        s.setSub(os,oops,ai,pom,ss);
        s.grade();

    }
}