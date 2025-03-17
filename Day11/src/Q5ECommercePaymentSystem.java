
abstract class Payment 
{
     double amount;

    public Payment(double amount)
    {
        this.amount = amount;
    }

    public abstract void processPayment();
}


class CreditCardPayment extends Payment
{
     String cardNumber;

    public CreditCardPayment(double amount, String cardNumber)
    {
        super(amount);
        this.cardNumber = cardNumber;
    }

    
    public void processPayment()
    {
        System.out.println("Processing credit card payment of " + amount + " Rs using card: " + cardNumber);
        System.out.println("------------------------------------");
    }
}


class PayPalPayment extends Payment 
{
     String email;

    public PayPalPayment(double amount, String email)
    {
        super(amount);
        this.email = email;
    }

    
    public void processPayment() 
    {
        System.out.println("Processing PayPal payment of " + amount + " Rs using email: " + email);
        System.out.println("------------------------------------");
    }
}

class GiftCardPayment extends Payment 
{
     String giftCardCode;

    public GiftCardPayment(double amount, String giftCardCode) {
        super(amount);
        this.giftCardCode = giftCardCode;
    }

    
    public void processPayment() 
    {
        System.out.println("Processing gift card payment of " + amount + " Rs using gift card code: " + giftCardCode);
        System.out.println("------------------------------------");
    }
}


public class Q5ECommercePaymentSystem 
{
    public static void main(String[] args) 
    {
    	 Payment[] payments = new Payment[3];
         payments[0] = new CreditCardPayment(100.0, "1234-5678-9876-5432");
         payments[1] = new PayPalPayment(50.0, "user@example.com");
         payments[2] = new GiftCardPayment(25.0, "GIFT12345");

        for (Payment payment : payments) 
        {
            payment.processPayment();
        }
    }

}
