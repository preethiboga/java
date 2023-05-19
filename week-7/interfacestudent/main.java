import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Hostler H=new Hostler();
        NonHostler N=new NonHostler();
        System.out.println("enter hostler fee:");
        int hf=sc.nextInt();
        System.out.println("enter hostler firstname:");
        String hfname=sc.next();
        System.out.println("enter hostler lastname:");
        String hlname=sc.next();
        System.out.println("enter hostler contact:");
        Double hc=sc.nextDouble();
        System.out.println("enter hostler address:");
        String ha=sc.next();
        System.out.println("enter nonhostler fee:");
        int nhf=sc.nextInt();
        System.out.println("enter nonhostler firstname:");
        String nhfname=sc.next();
        System.out.println("enter nonhostler lastname:");
        String nhlname=sc.next();
        System.out.println("enter nonhostler contact:");
        Double nhc=sc.nextDouble();
        System.out.println("enter hostler address:");
        String nha=sc.next();
        System.out.println("hostler info:");
        H.getAmount(hf);
        H.getFirstName(hfname);
        H.getLastName(hlname);
        H.getAddress(ha);
        H.getContact(hc);
        System.out.println("nonhostler info:");
        N.getAmount(nhf);
        N.getFirstName(nhfname);
        N.getLastName(nhlname);
        N.getAddress(nha);
        N.getContact(nhc);
    }

        
}