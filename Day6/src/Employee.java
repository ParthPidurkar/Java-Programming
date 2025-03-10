
public class Employee {
	int empno;
	String empname;
	String designation;
	String dept;
	float salary;
	
	public void readEmpData(int n, String name, String des, String d,float s)
	{
		empno = n;
		empname =name;
		designation = des;
		dept = d;
		salary =s;
	}
	public void displayEmpData()
	{
		System.out.println("Emp Id = "+empno);
		System.out.println("Name = "+empname);
		System.out.println("Designation = "+designation);
		System.out.println("dept = "+dept);
		System.out.println("Salary = "+salary);
	}
}
