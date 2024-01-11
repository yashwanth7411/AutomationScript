package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().to("https://www.flipkart.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	

}
