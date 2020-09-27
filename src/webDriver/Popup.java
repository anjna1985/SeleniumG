package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
public static WebDriver driver;
	
public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training_Stuff\\Software\\Driver\\C-83\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://popuptest.com/");
	driver.findElement(By.linkText("Multi-PopUp Test")).click();
	
	Set<String> allWindowHandles = driver.getWindowHandles();
	String lastWindowHandle = "";
	for(String handle : allWindowHandles)
	{
	System.out.println("Switching to window - > " +handle);
	driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
	String url=driver.getCurrentUrl();
	System.out.println(url);
	if(handle.equals(allWindowHandles))
	{
		continue;
	}
	else
	{
	driver.close();
	}
	
	}
	 
  }

}
