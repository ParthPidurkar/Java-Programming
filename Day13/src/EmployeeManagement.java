import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement 
{
	 ArrayList<Employee> al;
	  
	
	
	
	public void createEmpObject()
	{
		Employee e1 = new Employee(1001,"shan",80000);
		Employee e2 = new Employee(1002,"raj",20000);
		Employee e3 = new Employee(1003,"nathan",30000);
		al = new ArrayList<>();
			
		al.add(e1);
		al.add(e2);
		al.add(e3);
			
		System.out.println("object created");
		
		
		
	}
	

	public void displayEmpObject()
	{
		System.out.println("object displayed");
		for(Employee obj :al)
		{
			obj.displayEmployee();
		}
		
		
		
	}


	public void addemployeeobject(Employee obj) 
	{
		
		al.add(obj);
		System.out.println("new object is added");
	}


	public void sortbysal() 
	{
	
		
		
		
	}
	
	
}
