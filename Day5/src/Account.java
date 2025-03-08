
public class Account {
	int accno;
	String accname;
	float amount;
	float intr;
	
	public void readData(int ano,String name, float a)
	{
		accno =ano;
		accname = name;
		amount = a;
		
	}
	public void deposit(float dAmt)
	{
		amount+=dAmt;
		System.out.println("Deposit Amount = "+dAmt);
		System.out.println("Account Balance = "+amount);
	}
	public void interest()
	{
		intr =  ((amount/100)*7);
		amount += ((amount/100)*7);
	}
	
	public void withdraw(float wAmt)
	{
		amount -= wAmt;
		System.out.println("Withdraw Amount = "+wAmt);
		System.out.println("Account Balance = "+amount);
	}
	public void display()
	{
		System.out.println("Account No = "+accno);
		System.out.println("Name = "+accname);
		System.out.println("Account Balance = "+amount);
		System.out.println("2% interest on Amount = "+intr);
		
	}
}
