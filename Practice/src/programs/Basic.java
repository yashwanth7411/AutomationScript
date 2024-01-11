package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	    driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='selenium']")).click();
		
	}
}
