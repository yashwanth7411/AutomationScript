package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
	//	String source = driver.getPageSource();
	//	System.out.println(source);
	
		
		driver.close();
	}

}
