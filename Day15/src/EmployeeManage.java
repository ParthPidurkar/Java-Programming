import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EmployeeManage
{

	public ArrayList<Employee> addemp()
	{
		ArrayList<Employee> al = new ArrayList<>();
		Employee e1 = new Employee(101,"yash","software tester",2000,5);
		Employee e2 = new Employee(102,"Parth","software developer",4000,6);
		Employee e3 = new Employee(103,"abhi","Intern",3000,4);
		Employee e4 = new Employee(104,"anil","software developer",5000,3);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		return al;
	}

	public ArrayList<Employee> readFile() throws IOException, ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream("demo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Employee> al = (ArrayList<Employee>) ois.readObject();
		ois.close();
		fis.close();
		return al;
	}

	public void writeFile(ArrayList<Employee> al) throws IOException  
	{
		FileOutputStream fos = new FileOutputStream("demo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		fos.close();
		
	}
	
}
