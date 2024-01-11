package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/SelPgms/Html/sel1.html");
		driver.findElement(By.cssSelector("input[tabindex='1']")).sendKeys("Yash");
		driver.findElement(By.cssSelector("[tabindex='2']")).sendKeys("wanth");
	}

}
