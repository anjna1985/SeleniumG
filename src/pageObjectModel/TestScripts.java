package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScripts {

	public WebDriver driver = null;
	
	@Test
	public void login (){
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium_Training_Stuff\\Software\\Driver\\chromedriver.exe");

		System.out.println(System.getProperty("user.dir"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/indecomm/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPagePOM lp = new LoginPagePOM(driver);
		lp.setUname("anjna1985@yahoo.com");
		lp.setPassword("India123@");
		lp.clickLogin();
		
		String errorMessage = driver.findElement(By.xpath("//span[contains(text(),'invalid')]")).getText();
		System.out.println(errorMessage);
		
		lp.setUname("anjna85@yahoo.com");
		lp.setPassword("India123@");
		lp.clickLogin();
		//driver.quit();
	}
	
}
