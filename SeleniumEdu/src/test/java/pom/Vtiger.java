package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vtiger {
	@FindBy(xpath="(//a[@class='nav-link dropdown-toggle text-dark'])[16]")
	public WebElement resource;
	
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	public WebElement contact;
	
	@FindBy(xpath="(//div[@class='text-reset text-decoration-none'])[1]")
	public WebElement phone;
	
	public Vtiger(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
