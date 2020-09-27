package testng;

import org.testng.annotations.Test;

public class EnableDisableDemo {

	@Test(enabled = true)
	public void createUser()
	{
		System.out.println("User created successfully");
	}
	@Test(enabled = true)
	public void editUser()
	{
		System.out.println("User details has been edited successfully");
	}
	@Test(enabled = false)
	public void deleteUser()
	{
		System.out.println("User has been deleted successfully");
	}
	
}
