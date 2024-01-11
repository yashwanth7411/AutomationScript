package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Actitime;

public class Actitime_scripts {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Actitime at=new Actitime(driver);
		at.username.sendKeys("admin");
		at.password.sendKeys("manager");
		at.login.click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

}
