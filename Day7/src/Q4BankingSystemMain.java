class Account
{
	int accountNumber;
	String accountHolderName;
	static float balance;
	
	Account(int accountNumber,String accountHolderName,float balance)
	{
		this.accountNumber =accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	 public void displayDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Balance: " + balance);
	    }
}

class savingAccount extends Account
{
	float interestRate;
	savingAccount(int accountNumber,String accountHolderName,float balance,float interestRate)
	{
		super(accountNumber, accountHolderName, balance);
		this.interestRate=interestRate;
	}
	
	void deposit(float amount)
	{
		if(amount>0)
		{
			balance +=amount;
			System.out.println("Deposited: " + amount);
		}
		else
		{
			System.out.println("Invalid Amount !!!");
		}
	}
	
	
	void withdraw(float amount)
	{
		if(amount>0 && amount <= balance)
		{
			balance -=amount;
			System.out.println("Withdraw: " + amount);
		}
		else
		{
			System.out.println("Balance is low !!!");
		}
	}
	
	void calculateInterest()
	{
		double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest);
	}
	
	void displayDeposit()
	{
		super.displayDetails();
		System.out.println("Interest Rate = "+interestRate + "%");
		System.out.println("----------------------------------------");
	}
	
}


class CurrentAccount extends Account
{
	float overdraftLimit;
	CurrentAccount(int accountNumber,String accountHolderName,float balance,float overdraftLimit)
	{
		super( accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
	}
	void withdraw(float amount)
	{
		if(amount>0 && amount < (balance+overdraftLimit))
		{
			balance -=amount;
			System.out.println("Withdraw: " + amount);
		}
		else
		{
			System.out.println("Exceeds overdraft limit or invalid amount. !!!");
		}
		
	}
	 void displaycurrent() 
	 {
        super.displayDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("----------------------------------------");
    }
	
}

public class Q4BankingSystemMain {
	public static void main(String[] args)
	{
		System.out.println("Saving Account !!!!\n");
		savingAccount s  = new savingAccount(1000101,"ABC",2000,5);
		s.deposit(500);
		s.withdraw(100);
		s.calculateInterest();
		s.displayDeposit();
		
		System.out.println("\nCurrent Account !!!!\n");
		CurrentAccount c1 =new CurrentAccount(1101,"XYZ",10000,5000);
		c1. withdraw(12000);
		c1.displaycurrent();
		
	}
}
