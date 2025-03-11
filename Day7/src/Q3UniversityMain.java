class course
{
	int courseCode;
	String courseName;
	float credits;
	
	course(int courseCode, String courseName,float credits)
	{
		this.courseCode=courseCode;
		this.courseName = courseName;
		this.credits = credits;
	}
	
	void display()
	{
		System.out.println("Course Code :- "+courseCode);
		System.out.println("Course Name :- "+courseName);
		System.out.println("Course credits :- "+credits);
	}
}


class onlinecourse extends course
{
	String platform;
	onlinecourse(int courseCode, String courseName,float credits,String platform)
	{
		super(courseCode,courseName,credits);
		this.platform =platform;
	}
	void onlinecourseDisplay()
	{
		super.display();
		System.out.println("Mode = onlinecourse ");
		System.out.println("platform : "+platform);
	}
}

class onCampusCourse extends course
{
	String classRoomNo;
	onCampusCourse(int courseCode, String courseName,float credits,String classRoomNo)
	{
		super(courseCode,courseName,credits);
		this.classRoomNo =classRoomNo;
	}
	void offlinecourseDisplay()
	{
		super.display();
		System.out.println("Mode = offlinecourse ");
		System.out.println("classRoomNo : "+classRoomNo);
	}
}




public class Q3UniversityMain 
{
	public static void main(String[] args)
	{
		onlinecourse n1=new onlinecourse(1112, "java" ,30,"Zoom");
		n1.onlinecourseDisplay();
		
		onCampusCourse o1 = new onCampusCourse(11001,"c++",20,"BF01");
		o1.offlinecourseDisplay();
	}
}