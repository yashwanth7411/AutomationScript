package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_privatewebelement {
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement pwd;
	
	@FindBy(name="login")
	private WebElement login;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement Forgotpwd;
	
	public Facebook_privatewebelement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	
	public void setpwd(String pwd)
	{
		this.pwd.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		this.login.click();
	}
	
	public void forgotpwd()
	{
		this.Forgotpwd.click();
	}

}
