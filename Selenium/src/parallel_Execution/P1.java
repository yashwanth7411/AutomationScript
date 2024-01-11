package parallel_Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class P1 extends BaseTest{
	@Test
	public void actilogin()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

}
