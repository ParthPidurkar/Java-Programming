import java.io.Serializable;

public class Product implements Serializable
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
		System.out.println("--------------------------------------");
		System.out.println("product Id : "+productId);
		System.out.println("product Name : "+productName);
		System.out.println("product price : "+price);
		System.out.println("product quantity : "+quantity);
		System.out.println("--------------------------------------");
	}
	
	
}
