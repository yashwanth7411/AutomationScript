package testNG_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_true {
	@Test
	public void check_selected()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		 WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 checkbox.click();
		 
		
	//	Assert.assertEquals(checkbox.isSelected(),true);
		 Assert.assertTrue(checkbox.isSelected());
		 driver.close();
	}

}
