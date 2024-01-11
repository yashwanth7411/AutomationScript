package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="pass")
	public WebElement pwd;
	
	@FindBy(name="login")
	public WebElement login;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	public WebElement Forgotpwd;
	
	public Facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
