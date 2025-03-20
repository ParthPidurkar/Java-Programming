
import java.util.Scanner;

public class ManageEmp {


	public Employee addEmployee() 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int id = s.nextInt();
		System.out.println("Enter Employee name : ");
		String name = s.next();
		System.out.println("Enter Employee designation : ");
		String designation = s.next();
		System.out.println("Enter Employee salary : ");
		double salary = s.nextDouble();
		System.out.println("Enter Employee experience : ");
		int experience = s.nextInt();
		
		Employee e = new Employee(id,name,designation,salary,experience);
		
		return e;
	}

	

}
