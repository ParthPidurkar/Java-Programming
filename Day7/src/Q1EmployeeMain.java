class Employee
{
	int employeeId;
	String name;
	String department;
	
	Employee(int employeeId, String name,String department )
	{
		this.employeeId =employeeId;
		this.name = name;
		this.department =department;
	}
	
	public void display()
	{
		System.out.println("employee Id :- " + employeeId);
		System.out.println("employee name :- " + name);
		System.out.println("Department :- " + department);
		
	}
	
}
class FullTimeEmployee extends  Employee
{
	float salary;
	
	FullTimeEmployee(int employeeId, String name,String department, float salary)
	{
		super( employeeId,  name, department);
		this.salary =salary;
	}
	
	public void displayFullTime()
	{
		super.display();
		System.out.println("Full time Employee employee salary :- " + salary);
		System.out.println(" -------------------------- " );
	}
}

class PartTimeEmployee extends  Employee
{
	float hourlyRate;
	
	PartTimeEmployee(int employeeId, String name,String department, float hourlyRate)
	{
		super( employeeId,  name, department);
		this.hourlyRate =hourlyRate;
		this.cal ();
	}
	public void cal ()
	{
		hourlyRate = hourlyRate*30;
	}
	
	public void displayPartTime()
	{
		super.display();
		System.out.println("Part time Employee employee salary  :- " + hourlyRate);
		System.out.println(" -------------------------- " );
	}
}


public class Q1EmployeeMain {
	public static void main(String args[])
	{
		FullTimeEmployee f1 =new FullTimeEmployee(1001,"ABC","Software Engineer",800000);
		f1.displayFullTime();
		PartTimeEmployee p1 =new PartTimeEmployee(1002,"Xyz","Android Engineer",500);
		p1.displayPartTime();
	}
}