import java.util.Scanner;

public class Q3StudentMain {
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter Student Id  :- ");
		int Sid = s.nextInt();
		System.out.println("Enter Name :- ");
		String sname = s.next();
		System.out.println("Enter Marks  :- ");
		int mar = s.nextInt();
		s1.readData( Sid,  sname,  mar);
		s1.Result();
		s1.display();
		}
}
