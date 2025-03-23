import java.util.ArrayList;

public class LibraryManage 
{

	public void borrowBook(String brorow,ArrayList<Book> al) 
	{
		
		int f=0;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).title.equals(brorow)&&al.get(i).isAvailable==true)
			{
				al.get(i).display();
				al.get(i).isAvailable= false;
				System.out.println("Book Issued!!!!");
				f=1;
			}
		}
		if(f==0)
		{
			System.out.println("Book is not Available");
		}
	}

	public void returnBook(String title, ArrayList<Book> al) 
	{
		int f=0;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).title.equals(title)&&al.get(i).isAvailable==false)
			{
				al.get(i).display();
				al.get(i).isAvailable= true;
				System.out.println("Book Is return!!!!");
				f=1;
			}
		}
		if(f==0)
		{
			System.out.println("Book is Wrong !!!");
		}
		
	}

	public void isBookAvailable(String check, ArrayList<Book> al)
	{
		int f=0;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).title.equals(check)&&al.get(i).isAvailable==true)
			{
				System.out.println("Book Is Available!!!!");
				f=1;
			}
		}
		if(f==0)
		{
			System.out.println("Book Is Not Available!!!!");
		}
		
	}	
		
}


