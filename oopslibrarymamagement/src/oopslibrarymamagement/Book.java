package oopslibrarymamagement;

interface LateReturn
{
	public void calculation();
}

public class Book
{
	String title;
	String author;
	String ISBN;
	int  numberOfPages;
	boolean  isAvailable;
	int days;
	public Book(String title, String author, String iSBN, int numberOfPages, boolean isAvailable,int days) 
	{
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.numberOfPages = numberOfPages;
		this.isAvailable = isAvailable;
		this.days = days;
	}
	void display()
	{
		System.out.println("----------------------------------");
		System.out.println("Title : "+title);
		System.out.println("author : "+author);
		System.out.println("number Of Pages : "+numberOfPages);
		System.out.println("ISBN : "+ISBN);
		System.out.println("is Available : "+isAvailable);
		
	}
	
	boolean  Available()
	{
		return isAvailable;
	}
	
}

class AcademicBook extends Book implements LateReturn
{
	String subject;

	public AcademicBook(String title, String author, String iSBN, int numberOfPages, boolean isAvailable, int days,String subject)
	{
		super(title, author, iSBN, numberOfPages, isAvailable, days);
		this.subject = subject;
	}
	public void calculation()
	{
		double rent = days*5;
		System.out.println("fine : "+rent);
	}
	void display()
	{
		calculation();
		super.display();
		System.out.println("Subject : "+subject);
	}
	
	
}

class FictionBook extends Book implements LateReturn
{
	String FictionBook;

	public FictionBook(String title, String author, String iSBN, int numberOfPages, boolean isAvailable, int days,String FictionBook)
	{
		super(title, author, iSBN, numberOfPages, isAvailable, days);
		this.FictionBook = FictionBook;
	}
	public void calculation()
	{
		double rent = days*3;
		System.out.println("fine : "+rent);
	}
	void display()
	{
		calculation();
		super.display();
		System.out.println("Fiction Book : "+FictionBook);
	}
	
	
}

class NonFictionBook extends Book implements LateReturn
{
	String  topic;

	public NonFictionBook(String title, String author, String iSBN, int numberOfPages, boolean isAvailable, int days,String  topic)
	{
		super(title, author, iSBN, numberOfPages, isAvailable, days);
		this. topic =  topic;
	}
	public void calculation()
	{
		double rent = days*4;
		System.out.println("fine : "+rent);
	}
	void display()
	{
		calculation();
		super.display();
		System.out.println("topic : "+ topic);
	}
	
	
}

