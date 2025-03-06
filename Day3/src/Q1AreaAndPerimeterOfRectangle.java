import java.util.Scanner;

public class Q1AreaAndPerimeterOfRectangle {
	public static double area(int l,int b)
	{
		return 2*(l+b);
	}
	public static int perimetre(int l,int b)
	{
		return (l*b);
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of Rectangle :");
		int l = s.nextInt();
		System.out.println("Enter length of Rectangle :");
		int b = s.nextInt();
		double a = area(l,b);
		int p = perimetre(l,b);
		System.out.println("Area = "+a);
		System.out.println("Perimeter = "+p);
		}
}
