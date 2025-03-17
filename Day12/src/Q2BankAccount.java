class InsufficientFundsException extends Exception 
{
    public InsufficientFundsException(String message)
    {
        super(message);
    }
}

class CheckingAccount 
{
     double balance;

    public CheckingAccount(double balance)
    {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException
    {
        if (amount > balance)
        {
            throw new InsufficientFundsException("Insufficient funds! Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
    }

    public double getBalance()
    {
        return balance;
    }
}

public class Q2BankAccount
{
	 public static void main(String[] args) 
	 {
	        CheckingAccount account = new CheckingAccount(500.0);

	        System.out.println("Current balance: $" + account.getBalance());

	        try {
	            account.withdraw(600.0);
	        } 
	        catch (InsufficientFundsException e)
	        {
	            System.out.println("Exception: " + e.getMessage());
	        }

	        System.out.println("Final balance: $" + account.getBalance());
	    }
}
