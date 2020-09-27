package testng;

import org.testng.annotations.Test;

public class DependsOnDemo {

	@Test
	public void createUser()
	{
		System.out.println("User created successfully");
	}
	@Test(dependsOnMethods = {"createUser"})
	public void editUser()
	{
		System.out.println("User details has been edited successfully");
	}
	@Test(dependsOnMethods = {"editUser"})
	public void deleteUser()
	{
		System.out.println("User has been deleted successfully");
	}
	
}
