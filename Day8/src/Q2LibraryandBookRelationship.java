class Library 
{
	String name ;
	String address ;
	Book books ;
	
	Library(String name,String address)
	{
		this.name =name;
		this.address = address;
		
	}
	
	void addBook(Book books)
	{
		this.books = books;
	}
	
}

class Book
{
	String title ;
	String author ;
	String isbn;
	Book(String title,String author, String isbn)
	{
		this.title =title;
		this.author = author;
		this.isbn = isbn;
	}
}




public class Q2LibraryandBookRelationship
{

}
