import java.io.Serializable;

public class Employee implements Serializable 
{
	int id;
	String name;
	String designation;
	double salary; 
	int experience;
	public Employee(int id, String name, String designation, double salary, int experience) 
	{
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.experience = experience;
	}
	void diaplay()
	{
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("designation : "+designation);
		System.out.println("salary : "+salary);
		System.out.println("experience : "+experience);
		System.out.println("------------------------------------");
		
	}
	
	
}
