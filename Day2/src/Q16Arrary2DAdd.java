import java.util.Scanner;

public class Q16Arrary2DAdd {
public static void main(String[] args) {
		
		int n1,n2;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no of Rows Array :- ");
		n1=s.nextInt();
		System.out.print("Enter no of coloums Array:- ");
		n2=s.nextInt();
		int arr[][] =new int[n1][n2]; 
		System.out.print("Enter Array Elements :- ");
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		int sum =0;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				sum += arr[i][j];
			}
		}	
		System.out.print("Sum of all elements is "+ sum);

	}
}
