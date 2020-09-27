package testng;

import org.testng.annotations.Test;

public class ActiTest {
	
	@Test(priority=1)
	public void createUser()
	{
		System.out.println("User created successfully");
	}
	@Test(priority=2)
	public void editUser()
	{
		System.out.println("User details has been edited successfully");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("User has been deleted successfully");
	}
}
