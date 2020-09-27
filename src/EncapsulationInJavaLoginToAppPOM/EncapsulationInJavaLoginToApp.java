package EncapsulationInJavaLoginToAppPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncapsulationInJavaLoginToApp {

	public static WebDriver driver = null;

	private WebElement username = null;
	private WebElement password = null;
	private WebElement loginBtn = null;

	public void setUname(String un) {
		username = driver.findElement(By.id("username"));
		username.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		password = driver.findElement(By.name("pwd"));
		password.sendKeys(pw);
	}

	public void clickLogin() {
		loginBtn = driver.findElement(By.xpath("//a[@id='loginButton']"));
		loginBtn.click();
	}
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium_Training_Stuff\\Software\\Driver\\C-83\\chromedriver.exe");

		System.out.println(System.getProperty("user.dir"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/indecomm/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		EncapsulationInJavaLoginToApp l = new EncapsulationInJavaLoginToApp();
		l.setUname("anjna1985@yahoo.com");
		l.setPassword("India123@");
		l.clickLogin();
		
		String errorMessage = driver.findElement(By.xpath("//span[contains(text(),'invalid')]")).getText();
		System.out.println(errorMessage);
		
		l.setUname("anjna85@yahoo.com");
		l.setPassword("India123@");
		l.clickLogin();
		
	}
}
