import java.util.Scanner;

public class Q9TwoArraysEqual {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array 1 size :- ");
		int n1=s.nextInt();
		int arr1[] = new int[n1];
		System.out.println("Enter array 1 Elements :- ");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=s.nextInt();
		}
		System.out.print("Enter array 2 size :- ");
		int n2=s.nextInt();
		int arr2[] = new int[n2];
		System.out.println("Enter array 2 Elements :- ");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=s.nextInt();
		}
		int flag =0;
		if(n1!=n2)
		{
			flag = 0;
		}
		for(int i=0;i<n2;i++)
		{
			if(arr1[i]==arr2[i])
			{
				flag =1;
			}
			else 
			{
				flag = 0;
				break;
			}
				
		}
		if(flag==1)
		{
			System.out.println("Both array are same");
		}
		else
		{
			System.out.println("Both array is not same");
		}
		
	}
}
