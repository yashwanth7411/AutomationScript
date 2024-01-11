package testNG_pgm;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Base_2 extends Base_test{
	@Test
	public void FB()
	{
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("1234");
		driver.findElement(By.id("pass")).sendKeys("5678");
		driver.findElement(By.name("login")).click();
	}


}
