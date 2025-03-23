import java.util.ArrayList;
import java.util.Scanner;

public class Library
{
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		LibraryManage a = new LibraryManage();
		ArrayList<Book> al =new ArrayList<>();
		while(true)
		{
			System.out.println("1. add \n 2.Display All Book \n 3.Search \n 4.Borrow \n 5.Return \n 6.Availability Check \n 7.Exit");
			System.out.println("Enter Your Choise : ");
			int ch = s.nextInt();
			switch(ch)
			{
				case 1:
					Book b1=new Book("java","ABC","1011022sd",210,true);
					Book b2=new Book("c","BBB","1011023sd",666,true);
					Book b3=new Book("cpp","ADS","1011024sd",700,false);
					Book b4=new Book("c#","XYZ","1011025sd",800,false);
					Book b5=new Book(".net","PQR","1011026sd",210,true);
					al.add(b1);
					al.add(b2);
					al.add(b3);
					al.add(b4);
					al.add(b5);
					System.out.println("Data Added!!!!!!!");
					break;
				case 2:
					for(Book ele:al)
					{
						ele.display();
					}
					break;
				case 3:
					System.out.println("Enter Title to Search : ");
					String ser=s.next();
					for(int i=0;i<al.size();i++)
					{
						if(al.get(i).title.equals(ser))
						{
							al.get(i).display();
						}
					}
					break;
				case 4:
					System.out.println("Enter Title to Borrow : ");
					String brorow=s.next();
					a. borrowBook(brorow,al);
					break;
				case 5:
					System.out.println("Enter Title to Borrow : ");
					String title=s.next();
					a. returnBook(title,al);
					break;
				case 6:
					System.out.println("Enter Title to Borrow : ");
					String check=s.next();
					 a.isBookAvailable(check,al);
					break;
					
				case 7:
					System.out.println("Exit !!!!");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choise");
				
					
			}
		}
	}
}
