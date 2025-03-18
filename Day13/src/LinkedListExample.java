import java.util.LinkedList;

public class LinkedListExample
{

	
	public static void main(String[] args) 
	{
	
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		//display
		
		for(Integer ele :ll)
		{
			System.out.println(ele);
		}
		
		//addfirst
		System.out.println("----------------------------");
		ll.addFirst(5);
		
		for(Integer ele :ll)
		{
			System.out.println(ele);
		}
		
		//addlast
				System.out.println("----------------------------");
				ll.addLast(60);
				
				for(Integer ele :ll)
				{
					System.out.println(ele);
				}
		
		//addin middle
				
				System.out.println("----------------------------");
				ll.add(3, 23);
				for(Integer ele :ll)
				{
					System.out.println(ele);
				}
				
		
		//remove
				
				System.out.println("----------------------------");
				ll.remove(3);
				for(Integer ele :ll)
				{
					System.out.println(ele);
				}
				
				
//update
				
				System.out.println("----------------------------");
				ll.set(5, 65);
				for(Integer ele :ll)
				{
					System.out.println(ele);
				}
					
				
	}
	
}
