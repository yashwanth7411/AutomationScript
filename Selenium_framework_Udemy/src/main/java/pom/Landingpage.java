package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.abstractcomponent.Abstractcomponent;

public class Landingpage extends Abstractcomponent {
	
	WebDriver driver;
	
	public Landingpage(WebDriver driver) 
	{
		//initialization
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Page
	
	@FindBy(id="userEmail")
	WebElement username;
	
	@FindBy(id="userPassword")
	WebElement pwd;
	
	@FindBy(id="login")
	WebElement login;
	
	public void loginApplication(String email,String password) 
	{
		username.sendKeys(email);
		pwd.sendKeys(password);
		login.click();
	}
	
	
	
	
	

	
	
	
	

}
