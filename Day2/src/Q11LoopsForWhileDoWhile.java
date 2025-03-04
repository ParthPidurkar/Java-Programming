
public class Q11LoopsForWhileDoWhile {
	public static void main(String arg[])
	{
//		for loop
		int n=1;
		System.out.println("\nFor loop\n");
		for(int i=1;i<=100;i++)
		{
			System.out.print(i);
		}
//		while
		System.out.println("\nWhile loop\n");
		while(n<=100)
		{
			System.out.print(n);
			n++;
		}
//		do while
		n=1;
		System.out.println("\nDo-While loop\n");
		do
		{
			System.out.print(n);
			n++;
		}while(n<=100);
	}

}
