import java.util.Scanner;

public class Q3ArithmeticOperations {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a :");
		int a = s.nextInt();
		System.out.println("Enter value of b :");
		int b = s.nextInt();
		System.out.println("A + B  = " + (a+b));
		System.out.println("A - B  = " + (a-b));
		System.out.println("A * B  = " + (a*b));
		System.out.println("A / B  = " + (a/b));
		System.out.println("A % B  = " + (a%b));
}
}
