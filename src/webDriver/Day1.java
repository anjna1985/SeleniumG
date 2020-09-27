package webDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Day1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium_Training_Stuff\\Software\\Driver\\C-83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Ananya Software Technologies", Keys.ENTER);
//	        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Ananya Software Technologies");
//	        driver.findElement(By.xpath("//div[@class='tfB0Bf']//input[@name='btnK']")).click();
		String expectedtitle = driver.getTitle();
		System.out.println(expectedtitle);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for (WebElement link : alllinks) {
			String text = link.getText();
			if (text != "" || text != null) {
				System.out.println(text);
			}
		}
		System.out.println("Total links: " + alllinks.size());
		// driver.close();
	}
}
