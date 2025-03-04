import java.util.Scanner;

public class Q18BubbleSort {
	public static void main(String arg[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Array size :- ");
		n=s.nextInt();
		int arr[] =new int[n]; 
		System.out.print("Enter Array Elements :- ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Before Sorting :- ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\nAfter Sorting :- ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
