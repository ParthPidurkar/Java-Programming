import java.util.Scanner;

public class Q13MultiplicationTable {
	public static void main(String arg[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no :- ");
		n=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + " * " + i + " = "+(n*i));
		}
	}

}
