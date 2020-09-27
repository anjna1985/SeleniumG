package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {

	//Declaration 
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginBtn;
	
	//Initialization 
	public LoginPagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUname(String un) {
		username.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		password.sendKeys(pw);
	}

	public void clickLogin() {
		loginBtn.click();
	}
	
}
