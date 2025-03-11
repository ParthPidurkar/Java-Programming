class Book
{
	String title;
	String author;
	String  isbn;
	Book(String title,String author,String  isbn)
	{
		this.title = title;
		this.author =author;
		this.isbn = isbn;
	}
	void display()
	{
		System.out.println("Title = "+title);
		System.out.println("Author = "+author);
		System.out.println("isbn = "+ isbn);
	}
	
}

class EBook extends Book
{
	double fileSize;
	String downloadLink;
	boolean isAvailable;
	EBook(String title,String author,String  isbn,double fileSize ,String downloadLink,boolean isAvailable)
	{
		super(title, author,isbn);
		this.fileSize = fileSize;
		this.downloadLink = downloadLink;
		this.isAvailable = isAvailable;
	}
	public void displayEbook()
	{
        super.display();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Download Link: " + downloadLink);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
	
}

class PrintedBook extends Book
{
	 private int pageCount;
	    private String shelfLocation;
	    private boolean isCheckedOut; 

	    public PrintedBook(String title, String author, String isbn, int pageCount, String shelfLocation, boolean isCheckedOut)
	    {
	        super(title, author, isbn);
	        this.pageCount = pageCount;
	        this.shelfLocation = shelfLocation;
	        this.isCheckedOut = isCheckedOut;
	    }
	    public void displayPbook()
	    {
	        super.display();
	        System.out.println("Page Count: " + pageCount);
	        System.out.println("Shelf Location: " + shelfLocation);
	        System.out.println("Availability: " + (isCheckedOut ? "Checked Out" : "Available"));
	    }
}



public class Q5LibraryManagementMain {
	public static void main(String[] args)
	{
		 EBook e = new EBook("java", "james gosling", "1111111123", 5.6, "https://abc.com", true);
		 System.out.println("EBook Details:");
	        e.displayEbook();
		 
	        PrintedBook p = new PrintedBook("C++", " Yashavant Kanetkar", "2200201255", 464, " B4", true);
	        System.out.println("\nPrinted Book Details:");
	        p.displayPbook();
	}

}
