package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training_Stuff\\Software\\Driver\\C-83\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert2");
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        String alertMessage= driver.switchTo().alert().getText(); // capture alert message
        System.out.println(alertMessage); // Print Alert Message
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
       // driver.close();
	}

}
