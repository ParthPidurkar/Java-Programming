
public class Q5Calculator {
	public static void calculator(int num1,int num2,int ch)
	{
		switch (ch) {
        case 1:
            System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
            break;
        case 2:
            System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
            break;
        case 3:
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
            break;
        case 4:
            if (num2 != 0) 
            {
                System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
            }
            else
            {
                System.out.println("Division by zero is not allowed");
            }
            break;
        case 5:
            if (num2 != 0) 
            {
                System.out.println("Modulus of " + num1 + " and " + num2 + " is " + (num1 % num2));
            } 
            else
            {
                System.out.println("Modulus by zero is not allowed");
            }
            break;
        case 6:
            System.exit(0);
            break;
        default:
            System.out.println("Invalid choice");
    }
	}

}
