abstract class Course
{
     String title;
     double baseFee;

     Course(String title, double baseFee)
    {
        this.title = title;
        this.baseFee = baseFee;
    }

    
    public abstract double calculateEnrollmentFee();

    public void displayFee()
    {
        System.out.println(title + "\n Enrollment Fee: " + calculateEnrollmentFee());
        System.out.println("----------------------------");
    }
}


class LiveCourse extends Course
{
     double liveSessionFee;

     LiveCourse(String title, double baseFee, double liveSessionFee) 
    {
        super(title, baseFee);
        this.liveSessionFee = liveSessionFee;
    }

    
    public double calculateEnrollmentFee()
    {
        return baseFee + liveSessionFee; 
    }
}

class RecordedCourse extends Course
{
     double discount;

    RecordedCourse(String title, double baseFee, double discount)
    {
        super(title, baseFee);
        this.discount = discount;
    }

    
     public double calculateEnrollmentFee()
    {
        return baseFee - (baseFee * discount / 100); 
    }
}


class Workshop extends Course
{
	double materialsFee;

     Workshop(String title, double baseFee, double materialsFee)
    {
        super(title, baseFee);
        this.materialsFee = materialsFee;
    }

    
    public double calculateEnrollmentFee() {
        return baseFee + materialsFee; 
    }
}

public class Q4OnlineCourseManagementSystem 
{
	 public static void main(String[] args) {
	        Course[] courses = new Course[3];
	        courses[0] = new LiveCourse("Java Live Training", 200, 50);
	        courses[1] = new RecordedCourse("Python Recorded Course", 150, 10);
	        courses[2] = new Workshop("AI Workshop", 300, 75);

	        for (Course course : courses) {
	            course.displayFee();
	        }
	    }
}
