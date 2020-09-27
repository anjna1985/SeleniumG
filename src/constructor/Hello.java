package constructor;

public class Hello {
	   String name;
	   //Constructor
	   Hello(){
	      this.name = "BeginnersBook.com";
	   }
	   public static void main(String[] args) {
	      Hello obj = new Hello();
	      System.out.println(obj.name);
	   }
	}


//There are three types of constructors: Default, No-arg constructor and Parameterized.

