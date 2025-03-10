
public class ElectricityBill {
	int customerId;
	String customername;
	int unit;
	
	public void readData(int custId, String name, int u)
	{
		customerId = custId;
		customername = name;
		unit = u;
		
	}
	
	public void showData()
	{
		System.out.println("customer Id = "+customerId);
		System.out.println("customer Name = "+customername);
		System.out.println("units = "+unit);
		
	}
	public void computeBill()
	{
		 
		if(unit<=100)
		{
			float total;
			total = (float) (1.20*unit);
			System.out.println("Amout to pay = "+total);
		}
		else if(unit>100 && unit<=200)
		{
			float total;
			int a= unit-100;
			total = (float) (1.20*100)+(2*a);
			System.out.println("Amout to pay = "+total);
		}
		else if(unit>200 && unit<=300)
		{
			float total;
			int a= unit-200;
			int b= unit-a-100;
			total = (float) (1.20*100)+(2*b)+(3*a);
			System.out.println("Amout to pay = "+total);
		}
		else
		{
				float total;
				int a= unit-300;
				int b= unit-a-200;
				int c = unit-a-b-100;
				total = (float) (1.20*100)+(2*c)+(3*b)+(5*a);
				System.out.println("Amout to pay = "+total);
		}
	}
}
