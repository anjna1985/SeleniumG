package EncapsulationInJavaLoginToAppPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActitime {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium_Training_Stuff\\Software\\Driver\\C-83\\chromedriver.exe");

	System.out.println(System.getProperty("user.dir"));
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://online.actitime.com/indecomm/login.do");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement username = driver.findElement(By.id("username"));
	WebElement password = driver.findElement(By.name("pwd"));
	WebElement loginBtn = driver.findElement(By.xpath("//a[@id='loginButton']"));
		
	username.sendKeys("anjna1985@yahoo.com");
	password.sendKeys("India123@");
	loginBtn.click();
	
	String errorMessage = driver.findElement(By.xpath("//span[contains(text(),'invalid')]")).getText();
	System.out.println(errorMessage);
	
	username.sendKeys("anjna85@yahoo.com");
	password.sendKeys("India123@");
	loginBtn.click();
}
	
	

}