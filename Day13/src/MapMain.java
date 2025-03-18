import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapMain 
{

	public static void main(String[] args) 
	{		
	
		HashMap<Integer , Book> hm = new HashMap<>();
		
		Book b1 = new Book(1001,"C++",400);
		Book b2 = new Book(1002,"Java",500);
		Book b3 = new Book(1003,"Python",600);
		Book b4 = new Book(1004,"Dbt",700);
		
		
		hm.put(b1.bid, b1);
		hm.put(b2.bid, b2);
		hm.put(b3.bid, b3);
		hm.put(b4.bid, b4);
		
		
		for( Map.Entry<Integer, Book> h  :hm.entrySet())
		{
			System.out.print(h.getKey() + " " );
			Book obj =h.getValue();
			obj.bookDetails();
		}
		
		System.out.println("----------------------");
		
		//remove
		
		System.out.println("enter the book id to delete");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		hm.remove(id);
		for( Map.Entry<Integer, Book> h  :hm.entrySet())
		{
			System.out.print(h.getKey() + " " );
			Book obj =h.getValue();
			obj.bookDetails();
		}
		
		//update
		
		System.out.println("enter the book id to delete");
		
		id = s.nextInt();
		
		Book b=hm.get(id);
		b.price=800;
		
		for( Map.Entry<Integer, Book> h  :hm.entrySet())
		{
			System.out.print(h.getKey() + " " );
			Book obj =h.getValue();
			obj.bookDetails();
		}
		
	}
	
}
