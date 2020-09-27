package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropnotworking {
	public static WebDriver driver;
	
	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training_Stuff\\Software\\Driver\\C-83\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions actions = new Actions(driver);
        //Drag and drop, Mouse Over Actions
        WebElement b1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
        WebElement b3 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
        actions.dragAndDrop(b1,b3).perform();
        //driver.close();
	}
}
