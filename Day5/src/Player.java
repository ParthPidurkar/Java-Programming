
public class Player {
	String name;
	int age;
	String  countryName;
	int totalRun;
	
	 public Player(String name, int age, String countryName, int totalRun) {
	        this.name = name;
	        this.age = age;
	        this.countryName = countryName;
	        this.totalRun = totalRun;
	    }
	 public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Country: " + countryName);
	        System.out.println("Total Runs: " + totalRun);
	        System.out.println("----------------------");
	 }
	     
	public void displayIfAbove5000() {
		if (totalRun > 5000) {
            display();
        }
		
	}
}
