package testNG_pgm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Base_1 extends Base_test{
	@Test
	public void actilogin()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();	
	}

}
