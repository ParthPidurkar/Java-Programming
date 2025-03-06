import java.util.Scanner;

public class Q11BillCalc {
	public static float findBill(int unit)
	{
		float price =0;
		if(unit<=100)
		{
			price = unit *1;
		}
		else if(unit>100 && unit<=200)
		{
			int a=unit -100;
			price = ((a*2)+100);
		}
		else if(unit>200 && unit<=300)
		{
			int a= unit - 200;
			int b =unit- a-100;
			price =((a*3)+(b*2)+100);
		}
		return price;
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Units :- ");
		int unit=s.nextInt();
		float bill_Amount = findBill(unit);
		System.out.println("total bill = "+ bill_Amount);
	}
}
