import java.util.ArrayList;
import java.util.Scanner;

public class ManageProduct 
{

//	public ArrayList<Product> addProduct()
//	{
//		ArrayList<Product> al = new ArrayList<>();
//		Product p1 =new Product(101,"ABC",100.0,2);
//		Product p2 =new Product(102,"PQR",200.0,1);
//		Product p3 =new Product(103,"XYZ",300.0,3);
//		al.add(p1);
//		al.add(p2);
//		al.add(p3);
//		return al;
//	}
	public ArrayList<Product> addProduct()
	{
		ArrayList<Product> al = new ArrayList<Product>();
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter No of product : ");
		int no = s.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter Product id ");
			int id = s.nextInt();
			System.out.println("Enter Product name ");
			String str = s.next();
			System.out.println("Enter Product price ");
			double price = s.nextInt();
			System.out.println("Enter Product quantity ");
			int quantity = s.nextInt();
			Product p =new Product(id,str,price,quantity);
			al.add(p);
		}
		return al;
	}
}
