package testNG_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_true1 {
	@Test
	public void link()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		
	//	Assert.assertTrue(link.isDisplayed());
		Assert.assertFalse(link.isDisplayed());
		
		driver.close();
	}

}
