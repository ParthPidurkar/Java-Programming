import java.util.Scanner;

public class Q2ElectricityBillMain {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		ElectricityBill e = new ElectricityBill();
		System.out.println("Enter customer Id  :- ");
		int cid = s.nextInt();
		System.out.println("Enter Name :- ");
		String name = s.next();
		System.out.println("Enter unit  :- ");
		int u = s.nextInt();
		e.readData(cid, name,u);
		e.showData();
		e.computeBill();
		
	}

}
