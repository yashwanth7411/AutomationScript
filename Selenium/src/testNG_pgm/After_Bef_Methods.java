package testNG_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class After_Bef_Methods {
	public WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void acti()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}


@AfterMethod
public void postCondition()
{
	driver.close();
}

@Test
public void FB()
{
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("1234");
	driver.findElement(By.id("pass")).sendKeys("5678");
	driver.findElement(By.name("login")).click();
}
}
