public class Palindrome
{
	private int n;
      public int getN()
      {
		return n;
	}
	public void setN(int m)
	{
         n=m;
	}
	boolean pal()
	{
		int r,s=0,t=n;
		while(n!=0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
			
		}
		if(s==t)
                return true;
            else
               return false;
	}
	

}