
public class Book 
{
	String title;
	String author;
	String ISBN;
	int  numberOfPages;
	boolean  isAvailable;
	public Book(String title, String author, String iSBN, int numberOfPages, boolean isAvailable) 
	{
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.numberOfPages = numberOfPages;
		this.isAvailable = isAvailable;
	}
	
	void display()
	{
		System.out.println("---------------------");
		System.out.println("Title : "+title);
		System.out.println("author : "+author);
		System.out.println("ISBN : "+ISBN);
		System.out.println("number Of Pages : "+numberOfPages);
		System.out.println("isAvailable : "+isAvailable);
		System.out.println("---------------------");
	}
}
