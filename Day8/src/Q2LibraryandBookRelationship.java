class Library
{
	String name;
	String address;
	Book[] book = new Book[10];
	int count=0;
	
	Library(String name,String address)
	{
		this.name = name;
		this.address = address;
	}
	
	
	void addBook(Book book)
	{
		if(count < this.book.length)
		{
			this.book[count] = book;
			count++;
		}
		else
		{
			System.out.println("Library is full Can not add any more books  ");
		}
	}
	void displayBooks()
	{
		System.out.println("Library Details");
		System.out.println("Name = "+name);
		System.out.println("address = "+address);
		System.out.println("\n Books Detais");
		for(int i=0;i<count;i++)
		{
			System.out.println(book[i]);
		}
	}
	void searchBook(String title)
	{
		boolean flag = false;
		for(int i=0;i<count;i++)
		{
//			if(title == book[i].title)
			if(title.equalsIgnoreCase(book[i].title))
			{
				System.out.println("\n Book Found "+book[i].title+" "+book[i].author+" "+book[i].isbn);
				flag = true;
			}
		}
		if(flag == false)
		{
			System.out.println("Book not found !!!");
		}
		
	}
}
	
class Book
{
	public int length;
	String title;
	String author;
	String isbn;
	
	Book(String title,String author,String isbn)
	{
		this.title = title;
		this.author = author;
		this.isbn =isbn;
	}
	public String toString() {
        return "Title: " + title + "\n Author: " + author + "\n ISBN: " + isbn;
    }
}



public class Q2LibraryMain
{
	public static void main(String[] args)
	{
		
		Library l1 = new Library("ppppp","1 lane bhopal");
		Book book1 = new Book("Java", "XYZ", "1100101");
        Book book2 = new Book("C++", "ABC", "1100102");
		l1.addBook(book1);
        l1.addBook(book2);
		l1.displayBooks();
		l1.searchBook("java");
		
	}
	
}
