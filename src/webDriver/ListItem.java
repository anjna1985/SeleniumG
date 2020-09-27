package webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListItem {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Training_Stuff\\Software\\Driver\\C-83\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        //driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Ahmedabad (AMD)");
        //driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Ajmer (KQH)");
        //driver.findElement(By.xpath("//input[@id='ctl00$mainContent$view_date1']")).click();
        //driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		WebElement listbox = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select osel = new Select(listbox);
        osel.selectByValue("AED");
        List<WebElement> alloptions = osel.getOptions();
        int listSize = alloptions.size();
        System.out.println(listSize);
        driver.close();
	}
}
