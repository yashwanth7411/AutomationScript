package testNG_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class P1 {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Suite is Started");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Suite is Ended");
	}
	

	
	@Test
		public void Facebook()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("1234");
			driver.findElement(By.id("pass")).sendKeys("5678");
			driver.findElement(By.name("login")).click();
			driver.close();
	}
}
