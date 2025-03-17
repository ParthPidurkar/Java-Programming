import java.util.*;


abstract class Animal 
{
    protected String name;

    public Animal(String name) 
    {
        this.name = name;
    }
    public abstract void describeCareRequirements();
}

class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }
    public void describeCareRequirements()
    {
        System.out.println(name + " (Dog): Requires daily walks, a high-protein diet, and regular grooming.");
        System.out.println("---------------------");
    }
}
class Cat extends Animal 
{
    public Cat(String name) 
    {
        super(name);
    }

    
    public void describeCareRequirements()
    {
        System.out.println(name + " (Cat): Needs a clean litter box, scratching posts, and playtime with toys.");
        System.out.println("---------------------");
    }
}


class Bird extends Animal
{
    public Bird(String name) 
    {
        super(name);
    }


    public void describeCareRequirements()
    {
        System.out.println(name + " (Bird): Requires a spacious cage, fresh water, and social interaction.");
        System.out.println("---------------------");
    }
}

public class Q3AnimalRescueCenter 
{
	  public static void main(String[] args) {
		  Animal[] animals = new Animal[3]; 
	        animals[0] = new Dog("Buddy");
	        animals[1] = new Cat("Whiskers");
	        animals[2] = new Bird("Tweety");

	        for (Animal animal : animals) {
	            animal.describeCareRequirements();
	        }
	    }
}
