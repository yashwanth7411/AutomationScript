package pack1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh);
		
		driver.quit();
	
}
}

