package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_timetrack {
	@FindBy(xpath="//a[@class='content users']")
	public WebElement user;
	
	@FindBy(id="logoutLink")
	public WebElement logout;
	
	public Actitime_timetrack(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
