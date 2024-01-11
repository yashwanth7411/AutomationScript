package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pom.Vtiger;

public class Vtiger_scripts {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		Vtiger v=new Vtiger(driver);
		Actions a=new Actions(driver);
		a.moveToElement(v.resource).perform();
		v.contact.click();
		System.out.println(v.phone.getText());
	}

}
