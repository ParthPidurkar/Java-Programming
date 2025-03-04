
public class Q4variables {
	static int count =0;
	String m;
	Q4variables(String m){
		this.m = m;
	}
	
	 public static void Counter() {
	        count++; 
	        System.out.println("Static Variable: " + count);
	    }
	 public void display() {
	        System.out.println("Instance Variable: " + m);
	    }
	public static void main(String args[])
	{
		Q4variables obj = new Q4variables("Demo of h instance and static variables");
		obj.display();
		for(int i =0;i<5;i++)
		{
			Counter();
		}
		
		
		
	}
}
