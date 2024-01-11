package exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	WebElement link = driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]"));
	String tagname = link.getTagName();
	if(tagname.equals("a"))
		System.out.println("Pass: It's link");
	else
		System.out.println("Fail: It's not a link");
	}
}
