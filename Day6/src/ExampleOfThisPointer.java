
public class ExampleOfThisPointer
{
	int stuid;
	String studname;
	int mark;
	
	ExampleOfThisPointer()
	{
		this.stuid = 1002;
		this.studname ="pqr";
		this.mark =90;
	}
	
	ExampleOfThisPointer(int stuid,String studname,int mark)
	{
		this.stuid = stuid;
		this.studname =studname;
		this.mark =mark;
		this.display();
	}
	
	 void display()
	 {
		 System.out.println("Student id = "+stuid);
		 System.out.println("Student Name = "+studname);
		 System.out.println("marks = "+mark);
		 System.out.println("-----------------------------------");
	 }
	 
	 public void change(int id, String name, int m)
	 {
		  stuid = id ;
		  studname= name;
		  mark=m;
	 }
	 
	 public static void main(String[] args) 
	 {
		 
		 ExampleOfThisPointer e1 = new ExampleOfThisPointer(1001,"Abc",95);
		
		 ExampleOfThisPointer e2 = new ExampleOfThisPointer();
		 e2.display();
		 
		 ExampleOfThisPointer e3 = new ExampleOfThisPointer();
		 e3.change(1003,"xyz", 80);
		 e3.display();
		 
	 }
}
