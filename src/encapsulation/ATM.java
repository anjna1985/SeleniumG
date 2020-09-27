package encapsulation;

public class ATM {
	
	public static void main(String[] args) {
				
		Bank obj = new Bank();
		//obj.pinNo=2222;
		obj.updatePin(123456, 1234, 5555);
		obj.withdrawAmount(123456, 5555, 2000);
		
	}

}
