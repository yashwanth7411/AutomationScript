package data_driven_apache;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(data.getdata("sheet1",0,0));
		driver.findElement(By.name("pwd")).sendKeys(data.getdata("sheet1",1,0));
		driver.findElement(By.id("loginButton")).click();	
	}
}
