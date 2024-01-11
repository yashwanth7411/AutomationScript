package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pom.Flipkart;

public class Flipkart_script {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Flipkart fk=new Flipkart(driver);
		fk.popup.click();
		fk.login.click();
		fk.username.sendKeys("7411388428");
		fk.pwd.sendKeys("7411388428");
		fk.loginbtn.click();
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		a.moveToElement(fk.profile).perform();
		Thread.sleep(4000);
		fk.logout.click();
	}
}
