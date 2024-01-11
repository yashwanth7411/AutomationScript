package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	public WebElement popup;
	
	@FindBy(xpath="//a[text()='Login']")
	public WebElement login;
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	public WebElement username;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	public WebElement pwd;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement loginbtn;
	
	@FindBy(xpath="(//div[@class='_28p97w'])[1]")
	public WebElement profile;
	
	
	@FindBy(xpath="(//a[@class='_2kxeIr'])[10]")
	public WebElement logout;
	
	public Flipkart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
