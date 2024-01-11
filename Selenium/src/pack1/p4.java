package pack1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh);
		for(String a:allwh)
		{
		driver.switchTo().window(a);
		driver.close();
		Thread.sleep(2000);
	}
	}
}
