class Main{
    public static void main(String[] args)
    {
        CommandLineArguments c=new CommandLineArguments();
        int a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        c.setA(a);
        c.setB(b);
        System.out.println(c.add());

    }
}