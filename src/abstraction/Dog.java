package abstraction;

//Dog class extends Animal class
public class Dog extends Animal {

	public void sound() {
		System.out.println("Woof");
	}

	public void walk() {
		System.out.println("running");
	}
	
	public static void main(String args[]) {
		Animal obj = new Dog();
		obj.sound();
		obj.walk();
	}
}

//Lets say we have a class Animal that has a method sound() and the subclasses
//(see inheritance) of it like Dog, Lion, Horse, Cat etc. Since the animal sound 
//differs from one animal to another, there is no point to implement this method 
//in parent class. This is because every child class must override this method to 
//give its own implementation details, like Lion class will say “Roar” in this method 
//and Dog class will say “Woof”.