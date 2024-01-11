package testNG_pgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class P5 {
	@DataProvider
	public String [][] data()
	{
		String [][] d=new String[2][2];
		d[0][0]="admin";
		d[0][1]="manager";
		d[1][0]="trainee";
		d[1][1]="trainee";
		return d;
	}
	
	@Test(dataProvider="data")
	public void actitime(String un,String pwd) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();	
		Thread.sleep(3000);
		driver.close();
	}

}
