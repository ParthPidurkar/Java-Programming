import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		ArrayList<Employee> al = new ArrayList<>();
		ManageEmp me =new ManageEmp();
		
		
		while(true)
		{
			System.out.println("1.Add Employee \n 2.Update Employee \n 3.Delete Employee \n 4.Search Employee \n 5.Display All Employees \n 6.Exit ");
			System.out.println("Enter you choise : ");
			int ch = s.nextInt();
			switch(ch)
			{
				case 1:
					Employee e = me.addEmployee();
					al.add(e);
					System.out.println("Employee added");
					break;
				case 2:
					System.out.println("Enter index to update : ");
					int index = s.nextInt();
					System.out.println("Enter update value : ");
					Employee value = me.addEmployee();
					al.set(index,value);
					System.out.println("Employee Update");
					break;
				case 3:
					System.out.println("Enter index to remove : ");
					int i = s.nextInt();
					al.remove(i);
					System.out.println("Employee Deleted");
					break;
				case 4:
					System.out.println("Enter index to Find : ");
					int ind = s.nextInt();
					al.get(ind).display();
					break;
				case 5:
					for(Employee ele : al )
					{
						ele.display();
					}
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choise");
					
					
			}
		}
		
	}

	
}
