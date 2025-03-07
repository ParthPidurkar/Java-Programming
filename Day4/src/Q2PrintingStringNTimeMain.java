import java.util.Scanner;

public class Q2PrintingStringNTimeMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter String :- ");
		String str=s.next();
		System.out.print("Enter how many time to print :- ");
		int n=s.nextInt();
		Q2PrintingStringNTime.display(str,n);
	}
}
