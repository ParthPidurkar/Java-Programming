package oopslibrarymamagement;

import java.util.Scanner;

public class LibraryMain
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		 AcademicBook a = null;
		 FictionBook  f = null;
		 NonFictionBook nf = null ;
		while(true)
		{
			System.out.println("1.Add \n 2.Display all books \n 3.Borrow \n 4.Return \n 5.Exit");
			System.out.print("Enter Your choise : ");
			int ch =s.nextInt();
			switch(ch)
			{
				case 1:
					  a = new  AcademicBook("c++","abc","A10001",100,true,0,"c++");
					   f = new   FictionBook ("kill","def","A10002",102,false,5,"thriller");
					  nf = new    NonFictionBook ("Abc","def","A10002",102,false,5,"History");
					break;
				case 2:
					a.display();
					f.display();
					nf.display();
					break;
				case 3:
					System.out.println("Enter Academic Book Title : ");
					String ab = s.next();

					if(ab.equals(a.title)&&a.isAvailable==true)
					{
						System.out.println("Book issued ");
						a.isAvailable = false;
					}
					else
					{
						System.out.println("Book Not Availabe ");
					}
					break;
				case 4:
					System.out.println("Enter Fiction Book Title : ");
					String ac = s.next();
					if(ac.equals(a.title))
					{
						System.out.println("Book Returned ");
						a.isAvailable = true;
					}
					else
					{
						System.out.println("Wrong Book");
					}
					break;
				case 5:
					System.out.println("Exit");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choiuse");
			}
		}
	}
}
