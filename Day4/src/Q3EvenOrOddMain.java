import java.util.Scanner;

public class Q3EvenOrOddMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number :- ");
		int n=s.nextInt();
		int res = Q3EvenOrOdd.evenOdd(n);
		System.out.println(res);
	}
}
