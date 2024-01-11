package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class users_list1 {
	@FindBy(xpath="//div[text()='New User']")
	private WebElement newuser;
	
	@FindBy(xpath="(//input[@name='firstName'])[2]")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@name='lastName'])[2]")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//div[text()='Save & Send Invitation']")
	private WebElement clickinv;
	
	public users_list1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setnewuser()
	{
		this.newuser.click();
	}
	public void setfirstname(String fn)
	{
		this.firstname.sendKeys(fn);
	}
	public void setlastname(String ln)
	{
		this.lastname.sendKeys(ln);
	}
	public void setemail(String eid)
	{
		this.email.sendKeys(eid);
	}
	public void clicksave()
	{
		this.clickinv.click();
	}

}
