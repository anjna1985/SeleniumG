package encapsulation;

public class Bank {
	
	public int annountNo=123456;
	public int pinNo=1234;
	public int balanceAmount=5000;

	public void withdrawAmount (int accNo, int pin, int amount)
	{
	if(accNo==annountNo && pin==pinNo)	{
		if (amount<=balanceAmount) {
			
		balanceAmount = balanceAmount-amount;
		System.out.println("Amount withdrwal:" + amount);
		}
		else
		{
		System.out.println("Insufficient Balanace");
		}
	}
	}

	public void updatePin (int accNo, int oldPin, int newPin)
	{
	if (accNo==annountNo && oldPin==pinNo) {
		pinNo=newPin;
	//	System.out.println("Pin changed");
	}
	else
	{
	System.out.println("Invalid pin");
	}
		
	}
	
	}
	