import java.util.Scanner;

public class Q15ReverseArray {

	public static void main(String[] args) {
		
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
		System.out.println("Before :- ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		 int j=n-1;
		    for( int i=0;i<j;i++,j--)
		    {   
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		    }
		    System.out.println("\nAfter :- ");
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]+" ");
			} 
		    
	}

}
