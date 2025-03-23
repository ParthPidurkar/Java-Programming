import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		EmployeeManage em = new EmployeeManage();
		Scanner s= new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("demo.txt",true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		FileInputStream fis = new FileInputStream("demo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<Employee> al = new ArrayList<>();
		while(true)
		{
			System.out.println(" 1.Add Employee \n 2.Update Employee \n 3.Delete Employee \n 4.Search Employee \n 5.Display all Employee \n 6.get Promotion Eligible Employees \n 7.Exit");
			System.out.print("Enter your choise : ");
			int ch = s.nextInt();
			switch(ch)
			{
				case 1:
					al = em.addemp();
					oos.writeObject(al);
					oos.close();
					fos.close();
					break;
				case 2:
					al= em.readFile();
					System.out.print("Enter Empid where to update : ");
					int update=s.nextInt();
					for(Employee ele : al)
					{
						if(ele.id == update)
						{
							System.out.println("Enter Update Salary amount ");
							double sal =s.nextDouble();
							ele.salary=sal;
						}
					}
					em.writeFile(al);
					break;
				case 3:
					al= em.readFile();
					System.out.print("Enter Empid to delete : ");
					int del=s.nextInt();
					for(int i=0;i<al.size();i++)
					{
						if(al.get(i).id == del)
						{
							al.remove(i);
						}
					}
					em.writeFile(al);
					break;
				case 4:
					al= em.readFile();
					System.out.print("Enter Empid where to Search : ");
					int se=s.nextInt();
					for(int i=0;i<al.size();i++)
					{
						if(al.get(i).id == se)
						{
							al.get(i).diaplay();;
						}
					}
					em.writeFile(al);
					break;
				case 5:
					al = (ArrayList<Employee>) ois.readObject();
					for(Employee ele : al)
					{
						ele.diaplay();
					}
					ois.close();
					fis.close();
					break;
				case 6:
					al= em.readFile();
					for(int i=0;i<al.size();i++)
					{
						if(al.get(i).salary>=50000)
						{
							al.get(i).diaplay();;
						}
					}
					em.writeFile(al);
					break;
				case 7:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choise !!!");
						
					
					
			}
		}
		
		
	}
}
