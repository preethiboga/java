class MaxOfFive{
    private int a,b,c,d,e;
    void setA(int p,int q,int r,int s,int t)
    {
        a=p;
        b=q;
        c=r;
        d=s;
        e=t;
    }
    int maxi()
    {
        int maximum=Math.max(e,Math.max(d,Math.max(c,Math.max(a,b))));
        return maximum;
    }
    int mini()
    {
        int minimum=Math.min(e,Math.min(d,Math.min(c,Math.min(a,b))));
        return minimum;
    }
}