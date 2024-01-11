package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class users_list {
	@FindBy(xpath="//div[text()='New User']")
	public WebElement newuser;
	
	@FindBy(xpath="(//input[@name='firstName'])[2]")
	public WebElement firstname;
	
	@FindBy(xpath="(//input[@name='lastName'])[2]")
	public WebElement lastname;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	public WebElement email;
	
	@FindBy(xpath="//div[text()='Save & Send Invitation']")
	public WebElement clickinv;
	
	public users_list(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
