import java.util.Scanner;

public class Q4AccountMain {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Account a= new Account();
		System.out.println("Enter Account No  :- ");
		int accno = sc.nextInt();
		System.out.println("Enter Name :- ");
		String name = sc.next();
		System.out.println("Enter amount  :- ");
		float amount = sc.nextFloat();
		
		a.readData(accno,name, amount);
		a.display();
		System.out.println("Enter amount to deposit  :- ");
		float dop = sc.nextFloat();
		a.deposit(dop);
		
		System.out.println("Enter amount to withdraw  :- ");
		float wid = sc.nextFloat();
		a.deposit(wid);
		
		a.interest();
		a.display();
		
	}
}
