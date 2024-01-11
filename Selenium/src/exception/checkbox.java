package exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox = driver.findElement(By.name("remember"));
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isSelected());
		checkbox.click();
		Thread.sleep(2000);
		System.out.println(checkbox.isSelected());
	}
}
