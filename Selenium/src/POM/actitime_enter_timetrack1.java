package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitime_enter_timetrack1 {
	@FindBy(xpath="//a[@class='content users']")
	private WebElement users;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public actitime_enter_timetrack1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickusers()
	{
		this.users.click();
	}
	public void clicklogout()
	{
		this.logout.click();
	}

	
}
