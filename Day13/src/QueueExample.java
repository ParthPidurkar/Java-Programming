import java.util.PriorityQueue;

public class QueueExample
{

	public static void main(String[] args) 
	{
	
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		System.out.println("------------------");
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		
		for(Integer obj :q)
		{
			System.out.println(obj);
		}
		
		System.out.println("------------------");
		
		Integer ele=q.poll();
		System.out.println(ele);
		
	     q.remove(2);
	     
	     for(Integer obj :q)
			{
				System.out.println(obj);
			}
	     
	     
	     
	} 
	
	
}
