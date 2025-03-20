import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1FileWrite
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		ManageProduct mp = new ManageProduct(); 
		Scanner s = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("products1.txt",true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		
		System.out.println("1. Add Product \n 2.View All Products \n 3. Calculate Total Inventory Value ");
		int ch = s.nextInt();
		ArrayList<Product> al = new ArrayList<>();
		
			switch(ch)
			{
				case 1:
					al = mp.addProduct();
					oos.writeObject(al);
					fos.close();
					oos.close();
					break;
				case 2:
					FileInputStream fis = new FileInputStream("products1.txt");
					ObjectInputStream ois = new ObjectInputStream(fis);
					ArrayList<Product> bl;
					bl = (ArrayList<Product>) ois.readObject();
					ois.close();
					for(Product obj: bl)
					{
						obj.displayProductDetails();
					}
					fis.close();
					
					break;
				case 3:
					FileInputStream fis1 = new FileInputStream("products1.txt");
					ObjectInputStream ois1 = new ObjectInputStream(fis1);
					ArrayList<Product> cl;
					cl = (ArrayList<Product>) ois1.readObject();
					ois1.close();
					double totalPrice = 0;
					for(Product obj: cl)
					{
						totalPrice += (obj.price*obj.quantity);
					}
					fis1.close();
					System.out.println("Total Inventory Value is "+totalPrice);
					break;
							
			}
		
	}
}
