
public class Student {
	int id;
	String name;
	int mark;
	String result;
	
	public void readData(int Sid, String sname, int mar)
	{
		id = Sid;
		name = sname;
		mark = mar;
		
	}
	public void Result()
	{
		if(mark>=90)
		{
			result = "A";
		}
		else if(mark<90 && mark>=75 )
		{
			result = "B";
		}
		else if(mark<75 && mark>=65 )
		{
			result = "C";
		}
		else if(mark<65 && mark>=55 )
		{
			result = "D";
		}
		else
		{
			result = "F";
		}
	}
	public void display()
	{
		System.out.println("Student Id = "+id);
		System.out.println("Student Name = "+name);
		System.out.println("Marks = "+mark);
		System.out.println("result = "+result);
		
		
	}
}
