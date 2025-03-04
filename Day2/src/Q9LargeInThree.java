import java.util.Scanner;

public class Q9LargeInThree {
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 1st no :- ");
		a=s.nextInt();
		System.out.print("Enter 2nd no :- ");
		b=s.nextInt();
		System.out.print("Enter 3nd no :- ");
		c=s.nextInt();
		if((a>b) && (a>c))
		{
			System.out.print(a+" is Biggest ");
		}
		else if((a<b) && (b>c))
		{
			System.out.print(b+" is Biggest ");
		}
		else if((a<c) && (b<c))
		{
			System.out.print(c+" is Biggest ");
		}
		else
		{
			System.out.print(a+", "+b+" and "+ c +" is same Number ");
		}
	}

}
