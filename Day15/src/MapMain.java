import java.util.ArrayList;
import java.util.Scanner;

public class MapMain
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Employee> al = new ArrayList<>();
		Employee e1 = new Employee(101,"aa","software dev",20000,2);
		Employee e2 = new Employee(102,"bb","software tester",10000,5);
		Employee e3 = new Employee(103,"cc","manager",30000,10);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for(Employee obj : al)
		{
			obj.diaplay();
		}
		
		
		System.out.println("Enter id to update : ");
		int update = s.nextInt();
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).id == update)
			{
				al.get(i).salary = 5000;
			}
		}
		
		
		System.out.println("Enter id to delete : ");
		int del = s.nextInt();
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).id == del)
			{
				al.remove(i);
			}
		}
		
		
		System.out.println("Enter id to delete : ");
		int ser = s.nextInt();
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).id == ser)
			{
				al.get(i).diaplay();
			}
		}
		
		for(Employee obj : al)
		{
			obj.diaplay();
		}
		
		
		
	}
}
