import java.util.*;
class VowelConsonant{
    private String s1;
    public void setStr(String s1)
    {
        this.s1=s1;
    }
    void count()
    {
       int v=0,c=0;
       int i;
       for(i=0;i<s1.length();i++)
       {
          char ch=s1.charAt(i) ;
          if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
          v++;
          else
          c++;
       }
       System.out.println("vowel="+v);
       System.out.println("consonant="+c);
    }
}