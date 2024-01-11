package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("[id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='logout']")).click();
		
	/*	driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("[id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.logout")).click();   */
	}
}