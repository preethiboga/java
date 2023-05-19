import java.util.*;
class StringSort{
    private String[] s;
    private int n;
    public void setN(int n)
    {
        this.n=n;
    }
    public void setS(String[] s)
    {
        this.s=s;

    }
    void sorts()
    {
        Arrays.sort(s);
        int i;
        for(i=0;i<n+1;i++)
        System.out.print(s[i]+" ");
    }

}