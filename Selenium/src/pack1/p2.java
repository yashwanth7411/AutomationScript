package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		driver.close();
	}
}
