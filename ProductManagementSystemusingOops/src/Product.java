interface Discount
{
	void calculateDiscount();
}
public class Product
{
	int productId;
	String productName;
	double price;
	int quantity;
	public Product(int productId, String productName, double price, int quantity) 
	{
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	void display()
	{
		System.out.println("--------------------------");
		System.out.println("product Id : "+productId);
		System.out.println("product Name : "+productName);
		System.out.println("product price : "+price);
		System.out.println("product quantity : "+quantity);
	}
	
	
}

class Electronics extends Product implements Discount
{
	String warrantyPeriod;

	public Electronics(int productId, String productName, double price, int quantity, String warrantyPeriod) 
	{
		super(productId, productName, price, quantity);
		this.warrantyPeriod = warrantyPeriod;
	}
	public void calculateDiscount() 
	{
		price = price-(price*0.10);
	}
	void display()
	{
		calculateDiscount();
		super.display();
		System.out.println("product warranty Period : "+warrantyPeriod);
	}
	
}

class Groceries extends Product implements Discount
{
	String expiryDate;

	public Groceries(int productId, String productName, double price, int quantity, String expiryDate) 
	{
		super(productId, productName, price, quantity);
		this.expiryDate = expiryDate;
	}
	public void calculateDiscount() 
	{
		price = price-(price*0.05);
	}
	void display()
	{
		calculateDiscount() ;
		super.display();
		System.out.println("product expiry Date : "+expiryDate);
	}
	
}

class Furniture extends Product implements Discount
{
	String material;

	public Furniture(int productId, String productName, double price, int quantity, String material) 
	{
		super(productId, productName, price, quantity);
		this.material = material;
	}
	public void calculateDiscount() 
	{
		price = price-(price*0.15);
	}
	void display()
	{
		calculateDiscount() ;
		super.display();
		System.out.println("product expiry Date : "+material);
	}
	
}
