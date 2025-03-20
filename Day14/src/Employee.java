
public class Employee
{
	int id ;
	String name;
	String designation;
	double  salary;
	int  experience ;
	public Employee(int id, String name, String designation, double salary, int experience) 
	{
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.experience = experience;
	}
	
	void display()
	{
		System.out.println("Employee Id : "+id);
		System.out.println("Employee name : "+name);
		System.out.println("Employee designation : "+designation);
		System.out.println("Employee salary : "+salary);
		System.out.println("experience : "+experience);
		System.out.println("------------------------------");
		
		
	}
	
	
}
