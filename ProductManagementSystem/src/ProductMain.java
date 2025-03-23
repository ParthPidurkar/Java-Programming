import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileOutputStream fos = new FileOutputStream("products.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		FileInputStream fis = new FileInputStream("products.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Scanner s= new Scanner(System.in);
		ArrayList<Product> al = new ArrayList<>();
		while(true)
		{
			System.out.println(" 1.Add \n 2.Display \n 3.Remove \n 4. calc Inventory Value \n 5.Sort \n 6.Exit");
			System.out.print("Enter your choise : ");
			int ch =s.nextInt();
			switch(ch)
			{
				case 1:
					Product p1= new Product(101,"ABC",1000,5);
					Product p2= new Product(102,"DEF",2010,5);
					Product p3= new Product(103,"PQR",3000,5);
					Product p4= new Product(104,"TUV",430,5);
					Product p5= new Product(105,"XYZ",33,5);
					al.add(p1);
					al.add(p2);
					al.add(p3);
					al.add(p4);
					al.add(p5);
					oos.writeObject(al);
					oos.close();
					fos.close();
					break;
				
				case 2:
					 fis = new FileInputStream("products.txt");
					ois = new ObjectInputStream(fis);
					al = (ArrayList<Product>) ois.readObject();	
					for(Product ele : al)
					{
						ele.display();
					}
					ois.close();
					fis.close();
					break;
				case 3:
					fis = new FileInputStream("products.txt");
					ois = new ObjectInputStream(fis);
					al = (ArrayList<Product>) ois.readObject();	
					System.out.print("Enter product id to remove : ");
					int remove = s.nextInt();
					for(int i=0;i<al.size();i++)
					{
						if(al.get(i).productId==remove)
						{
							System.out.print(al.get(i).productId + "Removed");
						}
					}
					ois.close();
					fis.close();
					fos = new FileOutputStream("products.txt");
					oos = new ObjectOutputStream(fos);
					oos.writeObject(al);
					oos.close();
					fos.close();
					break;
					
				case 4:
					fis = new FileInputStream("products.txt");
					ois = new ObjectInputStream(fis);
					al = (ArrayList<Product>) ois.readObject();	
					double totalPrice=0;
					for(int i=0;i<al.size();i++)
					{
						totalPrice +=al.get(i).price*al.get(i).quantity;
					}
					System.out.println("Total Price "+totalPrice);
					ois.close();
					fis.close();
					break;
				case 5:
					fis = new FileInputStream("products.txt");
					ois = new ObjectInputStream(fis);
					al = (ArrayList<Product>) ois.readObject();
					ois.close();
					fis.close();
					al.sort((m1,m2)->Double.compare(m1.price,m2.price));
					fos = new FileOutputStream("products.txt");
					oos = new ObjectOutputStream(fos);
					oos.writeObject(al);
					oos.close();
					fos.close();
					
					break;
				case 6:
					System.exit(0);
					break;
					default:
						System.out.println("Invalid Choise !!!!");
			}
		}
	}

}
