package testNG_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	public void linkisdisplayed()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		SoftAssert s=new SoftAssert();
		s.assertFalse(link.isDisplayed());
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		s.assertAll();
		driver.close();
	}

}
