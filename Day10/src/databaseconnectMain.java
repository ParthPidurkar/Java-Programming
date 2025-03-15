import java.util.Scanner;

public class databaseconnectMain {
	public static void main(String[] args) {
		databaseconnect d=null;
		Scanner s = new Scanner(System.in);
		System.out.println("1. MySQL \n 2. Mongo  \n 3. Oracle");
		System.out.println("Enter your chooise : ");
		int ch = s.nextInt();	
		switch(ch)
		{
			case 1:
				d = new Mysql() ;
				d.connect();
				break;
			case 2:
				d = new mongo() ;
				d.connect();
				break;
			case 3:
				d = new oracle() ;
				d.connect();
				break;
		}
	}
}
