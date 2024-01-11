package exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		String attvalue = un.getAttribute("class");
		System.out.println(attvalue);
		
		if(attvalue.contains("text"))
			System.out.println("pass:It's Text Field");
		else
			System.out.println("Fail: It's Not Text Field");
		
	}
}
