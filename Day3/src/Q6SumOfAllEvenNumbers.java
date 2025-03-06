import java.util.Scanner;

public class Q6SumOfAllEvenNumbers {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number :- ");
		int n=s.nextInt();
		int sum =0;
		for(int i=2;i<=n;i+=2)
		{
			sum += i;
		}
		System.out.println("Sum = "+sum);
	}
}
