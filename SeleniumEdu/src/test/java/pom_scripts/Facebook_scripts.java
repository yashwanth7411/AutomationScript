package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Facebook;

public class Facebook_scripts {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Facebook f=new Facebook(driver);
		f.username.sendKeys("Yashwanth");
		f.pwd.sendKeys("Yash7411");
		f.login.click();
		Thread.sleep(4000);
		f.Forgotpwd.click();
	}

}
