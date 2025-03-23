import java.util.ArrayList;

public class productmain
{
	static void  calculateTotalInventoryValueWithDiscount(ArrayList<Product>al)
	{
		double totalPrice = 0;
		for(Product ele :al )
		{
			totalPrice += ele.price*ele.quantity;
		}
		System.out.println("Total price : "+totalPrice);
	}
	public static void main(String[] args)
	{
		Electronics e1 = new Electronics(101,"laptop",50000,2,"2 year");
		e1.display();
		Groceries g1 = new Groceries(201,"milk",50000,2,"25/03/2025");
		g1.display();
		Furniture f1 = new Furniture(301,"bed",50000,2,"Wood");
		f1.display();
		
		ArrayList<Product> al = new ArrayList<>();
		al.add(e1);
		al.add(g1);
		al.add(f1);
		System.out.println("--------------------");
		calculateTotalInventoryValueWithDiscount(al);
		
	}
}
