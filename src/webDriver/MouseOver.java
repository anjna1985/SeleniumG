package webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training_Stuff\\Software\\Driver\\C-83\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.walmart.com/");	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='g_a ap_c g_c']")).click();
		driver.findElement(By.id("vh-store-button")).click();
		WebElement menu = driver.findElement(By.id("vh-store-button"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).build().perform();
		driver.findElement(By.xpath("//span[text()='Store Finder')]")).click();
		
		String Expectedtitle = "Get Walmart hours, driving directions and check out weekly specials at your Edison Store, 2220 State Route 27, Edison, NJ 08817 - Walmart.com";
		String Actualtitle = driver.getTitle();
		if (Expectedtitle.equals(Actualtitle)) {
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}
	
}



//Mouse interface
//
//click(): Clicks on the element.
//doubleClick (): Double clicks on the element.
//contextClick() : Performs a context-click (right-click) on the element.
//clickAndHold(): Clicks at the present mouse location without releasing.
//dragAndDrop(source, target): Clicks at the source location and moves to the location of the target element before releasing the mouse. source (element to grab, target – element to release).
//dragAndDropBy(source, xOffset, yOffset): Performs click-and-hold at the source location, shifts by a given offset value, then frees the mouse. (X offset – to shift horizontally, Y Offset – to shift vertically).
//moveByOffset(x-offset, y-offset): Shifts the mouse from its current position (or 0,0) by the given offset. x-offset – Sets the horizontal offset (negative value – shifting the mouse to the left), y-offset – Sets the vertical offset (negative value – shifting the mouse to the up).
//moveToElement(toElement): It shifts the mouse to the center of the element.
//release(): Releases the pressed left mouse button at the existing mouse location.