import java.util.Scanner;

public class Q6PrimeNo {
	public static void prime(int no)
	{
		if(no ==1)
		{
			System.out.println("Not A prime number");
		}
		for (int i = 2; i * i <= no; i++)
		{
            if (no % i == 0) 
            {
    			System.out.println("Not A prime number");
            }
            
        }
		System.out.println("Is a prime number");
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int no = s.nextInt();
		prime(no);
	}
}
