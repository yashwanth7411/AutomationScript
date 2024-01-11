package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/SelPgms/Html/xpath3.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='sql']")).isDisplayed();
		driver.findElement(By.xpath("//td[text()='java']")).isEnabled();
	}
}
