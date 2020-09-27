package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginToApp {
	public WebDriver driver = null;

	@BeforeMethod
	public void PreCondition() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium_Training_Stuff\\Software\\Driver\\C-83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/indecomm/login.do");
	}

	@Parameters({"uname","pass"})
	@Test
	public void login(String uname, String pass) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname, Keys.TAB);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass, Keys.TAB);
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
	}

}
