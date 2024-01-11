package pack1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh);
		for(String a:allwh)
		{
		driver.switchTo().window(a);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(!title.contains("Naukri"))
		{
			Thread.sleep(2000);
			driver.close();
		}
		}
	}
}