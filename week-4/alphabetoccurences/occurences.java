import java.util.*;
class Occurences{
    private String s1;
    private char ch;
    public void setSC(String s1,char ch)
    {
        this.s1=s1;
        this.ch=ch;
    }
    int occ()
    {
        int i,c=0;;
        for(i=0;i<s1.length();i++)
        {
            char cha=s1.charAt(i);
            if(cha==ch)
            c++;
        }
        return c;

    }
}