package testng;

import org.testng.annotations.Test;

public class GroupDemo {
	
	@Test(groups= {"smoke"})
	public void createUser()
	{
		System.out.println("User created successfully");
	}
	
	@Test(groups= {"tasks","regression"})
	public void editUser()
	{
		System.out.println("User details has been edited successfully");
	}
	
	@Test(groups= {"tasks","regression"})
	public void deleteUser()
	{
		System.out.println("User has been deleted successfully");
	}

	@Test(groups= {"smoke"})
	public void createTask()
	{
		System.out.println("Task created successfully");
	}
	
	@Test(groups= {"smoke"})
	public void logTime()
	{
		System.out.println("Logging timesheet is created");
	}
	
}
