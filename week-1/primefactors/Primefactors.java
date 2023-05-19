class Primefactors{
    private int n;
    public void setN(int a)
    {
        n=a;
    }
    void prime()
    {
        int c=2;
        while(n>1)
        {
            if(n%c==0)
            {
                System.out.println(c);
                n=n/c;
            }
            else
            c++;
        }
        
    }
}