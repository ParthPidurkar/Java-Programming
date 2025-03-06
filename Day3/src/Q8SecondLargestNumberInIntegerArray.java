import java.util.Scanner;

public class Q8SecondLargestNumberInIntegerArray {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size :- ");
		int n=s.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter array Elements :- ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int large=arr[0] , slarge=arr[0];
		for(int i=1;i<n;i++)
		{
			if(large<arr[i])
			{
				large = arr[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(slarge < arr[i] && arr[i]!=large)
			{
				slarge = arr[i];
			}
		}
		System.out.println(slarge);
	}
}
