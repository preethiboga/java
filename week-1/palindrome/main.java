import java.util.Scanner;
class main
{
	public static void main(String[] args)
	{
		Palindrome p=new Palindrome();
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		p.setN(n);
		System.out.println(p.getN());
		if(p.pal())
                   System.out.println("palindrome");
            else
                    System.out.println("not palindrome");
                       
	}
}