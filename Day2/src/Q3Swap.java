import java.util.Scanner;
public class Q3Swap {
	public static void main(String arg[])
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter 1st no :- ");
		a=s.nextInt();
		System.out.print("Enter 2nd no :- ");
		b=s.nextInt();
		System.out.println("Before Swapping\nA = " + a + "\nB = " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping\nA = " + a + "\nB = " + b);
		
	}
}
