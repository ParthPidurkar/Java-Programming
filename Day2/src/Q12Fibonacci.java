import java.util.Scanner;

public class Q12Fibonacci {
	public static void main(String arg[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number :- ");
		n=s.nextInt();
		int a=0,b=1;
		for(int i=0;i<n;i++)
		{
			System.out.println(a);
			int next =a+b;
			a=b;
			b=next;
		}
		
	}

}
