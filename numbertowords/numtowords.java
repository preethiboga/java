import java.util.*;

import javax.lang.model.util.ElementScanner14;
class NumWords{
    static void words(char num[])
    {
        int len=num.length;
        if(len==0)
        {
            System.out.println("empty");
            return;
        }
        if(len>4)
        {
            System.out.println("out of range");
            return;
        }
        String single_digits[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        String two_digits[]=new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
        String ten_multiples[]=new String[]{"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
        String ten_power[]=new String[]{"hundred","thousand"};
        if(len==1)
        {
            System.out.println(single_digits[num[0]-'0']);
            return;
        }
        int x=0;
        while(x<num.length)
        {
            if(len>=3)
            {
                if(num[x]-'0'!=0)
                {
                    System.out.print(single_digits[num[x]-'0']+" ");
                    System.out.print(ten_power[len-3]+" ");
                }
                --len;
            }
            else
            {
                if(num[x]-'0'==1)
                {
                    int sum=num[x]-'0'+num[x+1]-'0';
                    System.out.println(two_digits[sum]);
                    return;
                }
                else if(num[x]-'0'==2 && num[x+1]-'0'==0)
                {
                    System.out.println("twenty");
                    return;
                }
                else
                {
                    int i=(num[x]-'0');
                    if(i>0)
                    System.out.print(ten_multiples[i]+" ");
                    else
                    System.out.print("");
                    ++x;
                    if(num[x]-'0'!=0)
                    System.out.println(single_digits[num[x]-'0']);
                }
            }
            ++x;
        }


    }
    
}
class Main{
   public static void main(String[] args) 
   {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       NumWords.words(s.toCharArray());
       
   }
}