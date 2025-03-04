import java.util.*;
public class Q10LeapYear {
	public static void main(String arg[])
	{
		int y;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter year :- ");
		y=s.nextInt();
		if((y%4==0&&y%100!=0)||(y%400==0))
		{
			System.out.print(y+"is leap year");
		}
		else
		{
			System.out.print(y+" is not leap year");
		}
	}
}
