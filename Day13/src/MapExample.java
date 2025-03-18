import java.util.HashMap;
import java.util.Map;

public class MapExample
{

	public static void main(String[] args) 
	{
	
		HashMap<Integer, String> hm = new HashMap<>();
		
		
		hm.put(1, "dac cdac Blr");
		hm.put(2, "dbda cdac Blr");
		hm.put(3, "dac cdac hyd");
		hm.put(3, "dac cdac chennai");
		
		System.out.println(hm);
		System.out.println("------------------------------");
		for( Map.Entry<Integer, String> h  :hm.entrySet())
		{
			System.out.println(h.getKey() + " " +h.getValue());
		}
		
		System.out.println("------------------------------");
		String value=hm.get(1);
		System.out.println(value);
		
		System.out.println("------------------------------");
		hm.remove(1);
		
		for( Map.Entry<Integer, String> h  :hm.entrySet())
		{
			System.out.println(h.getKey() + " " +h.getValue());
		}
		
		
		hm.put(2, "cdac pune");
		
		System.out.println("------------------------------");
		for( Map.Entry<Integer, String> h  :hm.entrySet())
		{
			System.out.println(h.getKey() + " " +h.getValue());
		}
	}
	
}
