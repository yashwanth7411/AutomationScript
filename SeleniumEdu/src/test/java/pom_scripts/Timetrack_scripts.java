package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Actitime;
import pom.Actitime_timetrack;

public class Timetrack_scripts {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Actitime at=new Actitime(driver);
		at.username.sendKeys("admin");
		at.password.sendKeys("manager");
		at.login.click();
		
		Thread.sleep(2000);
		Actitime_timetrack at1=new Actitime_timetrack(driver);
		at1.user.click();
		at1.logout.click();
	}

}
