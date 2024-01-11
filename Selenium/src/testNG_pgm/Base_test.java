package testNG_pgm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test {
	public WebDriver driver;
	
	@BeforeMethod
	public void PreCond()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterMethod
	public void PostCond()
	{
		driver.close();
	}

}
