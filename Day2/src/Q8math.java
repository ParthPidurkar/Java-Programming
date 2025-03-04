import java.util.Scanner;

public class Q8math {
	public static void main(String args[])
	{
		  Scanner s = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        double n = s.nextDouble();
	        double square = Math.pow(n, 2); 
	        double cube = Math.pow(n, 3); 
	        System.out.println("The square of " + n + " is: " + square);
	        System.out.println("The cube of " + n + " is: " + cube);
	}
}
