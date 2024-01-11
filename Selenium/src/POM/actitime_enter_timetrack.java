package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitime_enter_timetrack {
	@FindBy(xpath="//a[@class='content users']")
	public WebElement users;
	
	@FindBy(id="logoutLink")
	public WebElement logout;
	
	public actitime_enter_timetrack(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
