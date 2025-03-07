import java.util.Scanner;

public class Q5CalculatorMain {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while(true)
		        {
		        	System.out.println("Choose operation: \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus \n 6.Exit");
			        int ch = sc.nextInt();
			        System.out.println("Enter first number: ");
			        int num1 = sc.nextInt();
			        
			        System.out.println("Enter second number: ");
			        int num2 = sc.nextInt();
			        
			        
			        Q5Calculator.calculator(num1,num2,ch);
		        }
	        
	    }

}
