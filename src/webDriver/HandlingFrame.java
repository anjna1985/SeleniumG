package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training_Stuff\\Software\\Driver\\C-83\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
       // driver.switchTo().frame(0);
        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bharat");
        WebElement frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("HelloFrame");
        driver.close();
	}

	}


