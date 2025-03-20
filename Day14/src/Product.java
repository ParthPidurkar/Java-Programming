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
	void displayProductDetails()
	{
		System.out.println("product Id : "+productId);
		System.out.println("product Name : "+productName);
		System.out.println("price : "+price);
		System.out.println("quantity : "+quantity);
	}
	
}
