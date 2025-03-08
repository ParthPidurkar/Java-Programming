
public class Q5playerMain {
	 public static void main(String[] args) {
	        Player p1 = new Player("Virat Kohli", 35, "India", 12000);
	        Player p2 = new Player("Steve Smith", 34, "Australia", 7800);
	        Player p3 = new Player("Kane Williamson", 33, "New Zealand", 8900);
	        Player p4 = new Player("Rohit Shrma", 36, "India", 5400);
	        Player p5 = new Player("David Warner", 36, "Australia", 4800);
	        System.out.println("Players with more than 5000 runs:");
	        p1.displayIfAbove5000();
	        p2.displayIfAbove5000();
	        p3.displayIfAbove5000();
	        p4.displayIfAbove5000();
	        p5.displayIfAbove5000();
	        
	 }
}
