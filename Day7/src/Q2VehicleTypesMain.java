import java.util.Scanner;

class vehicle
{
	String maker;
	String model;
	int year;
	vehicle(String maker,String model,int year)
	{
		this.maker =maker;
		this.model =model;
		this.year = year;
	}
	
	public void display()
	{
		System.out.println("Maker Brand :- "+ maker);
		System.out.println("model name :- "+ model);
		System.out.println("model Year :- "+ year);
	}
	
	public double calculateInsurance()
	{
		int currentYear = 2025;
		int age = currentYear - year;
		double base =500;
		return(base+age*20);
	}
}


class car extends vehicle
{
	int numberOfDoors;
	car(String maker,String model,int year,int numberOfDoors)
	{
		super( maker, model, year);
		this.numberOfDoors = numberOfDoors;
		carInsurance();
	}
	public double carInsurance()
	{
		double baseprice= super.calculateInsurance();
		double doorfactor = numberOfDoors*10;
		return (baseprice+doorfactor);
	}
	
	void carDisplay()
	{
		super.display();
		System.out.println("number Of Doors in car = "+numberOfDoors);
		System.out.println(" car Insurance amount is " +this.carInsurance() );
	}
}


class truck extends vehicle
{
	float cargocapacity;
	truck(String maker,String model,int year,float cargocapacity)
	{
		super( maker, model, year);
		this.cargocapacity = cargocapacity;
		truckInsurance();
	}
	public double truckInsurance()
	{
		double baseprice= super.calculateInsurance();
		double doorfactor = cargocapacity*10;
		return (baseprice+doorfactor);
	}
	
	void truckDisplay()
	{
		super.display();
		System.out.println("cargo capacity in truck = "+cargocapacity);
		System.out.println(" truck Insurance amount is " +this.truckInsurance() );
	}
}


public class Q2VehicleTypesMain 
{
 public static void main(String[] args)
 	{
	 Scanner s= new Scanner(System.in);
	 System.out.println("Enter maker brand : ");
	 String make=s.next();
	 System.out.println("Enter model name : ");
	 String model=s.next();
	 System.out.println("Enter year  : ");
	 int year=s.nextInt();
	 
	 System.out.println("\n 1.Car \n 2.Truck\nEnter your choise");
	 int ch = s.nextInt();
	 if(ch==1)
	 {
		 System.out.println("Enter number Of Doors in car : ");
		 int numberOfDoors =s.nextInt(); 
		 car c1 = new car(make,model,year,numberOfDoors);
		 c1.carDisplay(); 
	 }
	 
	 else if(ch==2)
	 {
		 System.out.println("Enter cargo capacity in truck : ");
		 int cargocapacity =s.nextInt(); 
		 truck t1 = new truck(make,model,year,cargocapacity);
		 t1.truckDisplay(); 
	 }
	 else
	 {
		 System.out.println("Invalid choises : ");
	 }
	 
	 
	 
	 
	 	
 	}
}