import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain
{

	public static void main(String[] args) 
	{
		EmployeeManagement e = new EmployeeManagement();
		e.createEmpObject();
		e.displayEmpObject();
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter employee object");
		Employee obj = new Employee(s.nextInt(),s.next(),s.nextFloat());
		
		e.addemployeeobject(obj);
		e.displayEmpObject();
		e.sortbysal();
		
		
		
	}
	
}
