import java.util.*;
import java.util.Scanner;
class sleeper
{
    static int i;
    static int j=-1;
     static void reserve(int age,String pprof,int sleeparr[])
     {
        sleeparr[++j]=i++;
         Main.totalpass++;
         if(age>=4 && age<=9)
         {
             Main.totalchild++;
             Main.totalfare=Main.totalfare+(300*0.4);
         }
         else
         {
             Main.totalad++;
         }
         if(pprof.equals("student"))
         {
            Main.totalfare=Main.totalfare+(300*0.6);
         }
         else if(pprof.equals("defense"))
         {
            Main.totalfare=Main.totalfare+(300*0.8);
         }
         else{
            Main.totalfare=Main.totalfare+300;

         }
     }
}
class ac
{
    static int k;
    static int p=-1;
    
     static void reserve(int age,String pprof,int acarr[])
     {
         Main.totalpass++;
         acarr[++p]=k++;
         if(age>=4 && age<=9)
         {
             Main.totalchild++;
             Main.totalfare=Main.totalfare+(200*0.4);
         }
         else
         {
             Main.totalad++;
         }
         if(pprof.equals("student"))
         {
            Main.totalfare=Main.totalfare+(200*0.6);
         }
         else if(pprof.equals("defense"))
         {
            Main.totalfare=Main.totalfare+(200*0.8);
         }
         else{
            Main.totalfare=Main.totalfare+200;

         }
     }
}
class general
{
    static int q;
    static int r=-1;
     static void reserve(int age,String pprof,int generalarr[])
     {
         Main.totalpass++;
         generalarr[++r]=q++;
         if(age>=4 && age<=9)
         {
             Main.totalchild++;
             Main.totalfare=Main.totalfare+(100*0.4);
         }
         else
         {
             Main.totalad++;
         }
         if(pprof.equals("student"))
         {
            Main.totalfare=Main.totalfare+(100*0.6);
         }
         else if(pprof.equals("defense"))
         {
            Main.totalfare=Main.totalfare+(100*0.8);
         }
         else{
            Main.totalfare=Main.totalfare+100;

         }
     }
}

public class Main
{
    static double totalfare=0;
    static int totalad=0;
    static int totalchild=0;
    static int totalpass=0;
    static int acarr[]=new int[10];
    static int sleeparr[]=new  int[10];
    static int generalarr[]=new int[10];
    public static void main(String[] args)
    {  
        String s;
        int n;
        String t;
        Scanner sc=new Scanner(System.in);
        String fto[]=new String[8];
        fto[0]="wl-kmt";
        fto[1]="kmt-wl";
        fto[2]="wl-bsx";
        fto[3]="bsx-wl";
        fto[4]="bsx-sc";
        fto[5]="sc-bsx";
        fto[6]="bsx-bza";
        fto[7]="bza-bsx";
        int n1;
    while(true)
    {
        System.out.println("do yo want to enter:");
        s=sc.next();
        int index=-1;
        String trainclass=null;
        boolean x=true;
        switch(s)
        {
            case "yes":
            while(x)
            {
               System.out.println("1.reserve\n2.no");
               n1=sc.nextInt();
               switch(n1)
               {
                case 1:   
                  System.out.println("enter no.of tickets");
                  n=sc.nextInt();
                  System.out.println("enter from and to:");
                  t=sc.next();
                  for(int i=0;i<8;i++)
                  {
                       if(fto[i].equals(t))
                       index=i;
                  }
                  try{
                      if(index==-1)
                      throw new Exception("no destination found");
                      else{
                          String fromto=fto[index];
                          for(int i=0;i<n;i++)
                          {
                              System.out.println("enter name of passenger:");
                              String pname=sc.next();
                              System.out.println("enter age:");
                              int age=sc.nextInt();
                              System.out.println("enter aadhar:");
                              String padhar=sc.next();
                              System.out.println("enter profession:");
                              String pprof=sc.next();
                              System.out.println("enter train class:");
                              trainclass=sc.next();
                              if(trainclass.equals("sleeper"))
                              {
                                  sleeper.reserve(age,pprof,sleeparr);

                              }
                              else if(trainclass.equals("ac"))
                              {
                                  ac.reserve(age,pprof,acarr);

                              }
                              else
                              {
                                 general.reserve(age,pprof,generalarr);

                              }
                          }
                          System.out.println("from-to  "+fromto);
                          System.out.println("total no.of passengers:"+totalpass);
                          System.out.println("total no.of children:"+totalchild);
                          System.out.println("total no.of adult:"+totalad);
                          if(sleeper.j!=-1)
                          {
                            System.out.print("sleeper:");
                            for(int i=0;i<=sleeper.j;i++)
                            {
                                System.out.print("s"+(sleeparr[i]+1)+" ");
                            }
                            System.out.println();
                          }
                          if(ac.p!=-1)
                          {
                            System.out.print("ac:");
                            for(int i=0;i<=ac.p;i++)
                            {
                                System.out.print("ac"+(acarr[i]+1)+" ");
                            }
                            System.out.println();
                          }
                          if(general.r!=-1)
                          {
                            System.out.print("general:");
                            for(int i=0;i<=general.r;i++)
                            {
                                System.out.print("g"+(generalarr[i]+1)+" ");
                            }
                            System.out.println();
                          }

                          System.out.println("total fare:"+totalfare);
                          System.out.println("SHUBH YATRA");
                      }
                  }
                  catch(Exception e)
                  {
                      System.out.println(e);
                  }
                  break;
                 case 2:
                      x=false;
                      break; 
                }
            }
            break;
             case "no":
                        System.exit(0);
         }          

    }

    }
}