import java.util.Stack;

public class StackExample 
{

	public static void main(String[] args) 
	{
		Integer ele;
		
		Stack<Integer> s = new Stack<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		
		for(Integer obj :s)
		{
			System.out.println(obj);
		}
		
		s.push(60);
		System.out.println("----------------------------");
		for(Integer obj :s)
		{
			System.out.println(obj);
		}
		
		System.out.println("----------------------------");
		 ele=s.pop();
		System.out.println(ele);
		System.out.println("----------------------------");
		
		System.out.println("----------------------------");
		for(Integer obj :s)
		{
			System.out.println(obj);
		}
		
		
		System.out.println("----------------------------");
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		
		System.out.println(s.empty());
		
		for(Integer e :s)
		{
			System.out.println(e);
		}
	}
	
	
}
