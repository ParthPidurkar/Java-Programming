class car
{
	String brand;
	String model;
	Engine engine;
	
	car(String brand,String model,Engine engine)
	{
		this.brand = brand;
		this.model = model;
		this.engine = engine;
	}
	void startCar()
	{
		engine.startEngine();
;		System.out.println("car Started !!!!!");
	}
	
}

class Engine
{
	int horsePower;
	String engineType ;
	Engine(int horsePower, String engineType )
	{
		this.horsePower = horsePower;
		this.engineType = engineType;
	}
	void startEngine()
	{
		System.out.println("horse Power = "+horsePower);
		System.out.println("engine Type = "+engineType);
		System.out.println("Engine started");
	}
}


public class Q1CarandEngineRelationship
{
	public static void main(String[] args) 
	{
		Engine engine =new Engine(100,"1.5petrol");
		car c1 = new car("Tata","punch",engine);
		c1.startCar();
	}
}
