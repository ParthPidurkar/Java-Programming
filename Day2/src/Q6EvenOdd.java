import java.util.Scanner;

public class Q6EvenOdd {
	public static void main(String arg[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no :- ");
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" is Even ");
		}
		else
		{
			System.out.println(n+" is Odd ");
		}
	}
}
