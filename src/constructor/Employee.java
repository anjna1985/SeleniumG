package constructor;

public class Employee { 
	
	//Constructor have same name as class name
	//It should not return a value not even void
	//Java Constructors. A constructor in Java is a special method that is used to initialize objects. The constructor is called 
	//when an object of a class is created.
	
	int empId;
	String empName;

	// parameterized constructor with two parameters
	Employee(int id, String name) {
		this.empId = id;
		this.empName = name;
	}

	void info() {
		System.out.println("Id: " + empId + " Name: " + empName);
	}

	public static void main(String args[]) {
		Employee obj1 = new Employee(10245, "Chaitanya");
		Employee obj2 = new Employee(92232, "Negan");
		obj1.info();
		obj2.info();
	}
}
