import java.util.Scanner;

public class Q7ReversesInteger {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number :- ");
		int n=s.nextInt();
		int rem;
		int rev = 0;
		while(n>0)
		{
			rem = n%10;
			rev = (rev+rem)*10;
			n=n/10;
		}
		rev = rev/10;
		System.out.print("Reverses number :- " + rev);
	}
}
