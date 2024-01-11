package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Facebook_privatewebelement;

public class Facebook_privatewebelementscripts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Facebook_privatewebelement f=new Facebook_privatewebelement(driver);		
		f.setusername("Yash");
		f.setpwd("7411");
		f.clicklogin();
		Thread.sleep(4000);
		f.forgotpwd();
		driver.close();
		
	}
}
