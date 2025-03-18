
public class Employee 
{

	int empid;
	String name;
	float sal;
	
	public Employee(int empid, String name, float sal) {
		
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	
	void displayEmployee()
	{
		System.out.println(empid+name+sal);
	}
	
}
