package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime {
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(name="pwd")
	public WebElement password;
	
	@FindBy(id="loginButton")
	public WebElement login;
	
	public Actitime(WebDriver driver)
	{
		// Initialize the Webelement
		PageFactory.initElements(driver, this);
	}
}
