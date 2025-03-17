abstract class Employee
{
     String name;
     double salary;

    public Employee(String name, double salary) 
    {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();

    public void displayInfo()
    {
        System.out.println("Employee name: " + name + "\n Salary: " + salary + "\n Bonus: " + calculateBonus());
    }
}


class Manager extends Employee
{
    public Manager(String name, double salary)
    {
        super(name, salary);
    }
    public double calculateBonus() 
    {
        return (salary /100)*10;
    }
}

class Engineer extends Employee
{
    public Engineer(String name, double salary)
    {
        super(name, salary);
    }
    public double calculateBonus() 
    {
        return (salary /100)*20;
    }
}


class Intern extends Employee
{
    public Intern(String name, double salary)
    {
        super(name, salary);
    }
    public double calculateBonus() 
    {
        return (salary /100)*5;
    }
}

public class Q2EmployeeManagementSystem 
{
	 public static void main(String[] args)
	 {
	        Employee[] employees = {
	            new Manager("Yash", 80000),
	            new Engineer("parth", 60000),
	            new Intern("vishal", 30000)
	        };

	        for (Employee emp : employees) {
	            emp.displayInfo();
	        }
	 }
}
