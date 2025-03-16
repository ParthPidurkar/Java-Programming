class Book
{
	void displayBorrowingRules()
	{
		System.out.println("Super class ");
		System.out.println("1. rule fisrt");
		System.out.println("2. rule Second");
	}
}

class Fiction extends Book
{
	void displayBorrowingRules()
	{
		super.displayBorrowingRules();
		System.out.println(" Fiction class ");
		System.out.println("3. rule third");
		System.out.println("4. rule fourth");
	}
}
class NonFiction extends Book
{
	void displayBorrowingRules()
	{
		super.displayBorrowingRules();
		System.out.println("Non Fiction class ");
		System.out.println("3. rule third");
		System.out.println("4. rule fourth");
	}
}

class Reference extends Book
{
	void displayBorrowingRules()
	{
		super.displayBorrowingRules();
		System.out.println("Reference class ");
		System.out.println("3. rule third");
		System.out.println("4. rule fourth");
	}
}


public class Q1LibraryManagementSystem 
{
	public static void main(String[] args) 
	{
		Fiction f = new Fiction();
		f.displayBorrowingRules();
		
		NonFiction nf = new NonFiction();
		nf.displayBorrowingRules();
		
		Reference r = new Reference();
		r.displayBorrowingRules();
		
		
	}
}
