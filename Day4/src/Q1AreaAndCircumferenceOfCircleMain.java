import java.util.Scanner;

public class Q1AreaAndCircumferenceOfCircleMain {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter Radius of Circle :- ");
	float r=s.nextFloat();
	float a =Q1AreaAndCircumferenceOfCircle.area(r);
	float c =Q1AreaAndCircumferenceOfCircle.Circumference(r);
	System.out.println("Area = "+ a);
	System.out.println("Circumference = "+c);
	
	}
}
