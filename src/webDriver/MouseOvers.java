package webDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOvers {
	public static WebDriver driver;
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training_Stuff\\Software\\Driver\\C-83\\chromedriver.exe");	
	 driver = new ChromeDriver();
	// Launch the URL 
    driver.get("https://www.selenium.dev/");
    driver.getTitle();
    //Maximize browser window
    driver.manage().window().maximize();
    //Adding wait 
    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    //Adding links
    List<WebElement> alllinks = driver.findElements(By.tagName("a"));
    for(WebElement link:alllinks) {
    	String text =link.getText();
    	if(text!=""||text!=null)
    	{
    		System.out.println(text);
    	}
    }
    // Close the main window 
	driver.close();
	
	}
}