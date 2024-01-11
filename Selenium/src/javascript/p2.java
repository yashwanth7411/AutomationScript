package javascript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[contains(text(),'acti')]")).click();
		Thread.sleep(2000);
		
		Set<String> allwh = driver.getWindowHandles();
		for(String a:allwh)
		{
			driver.switchTo().window(a);
			String title = driver.getTitle();
			if(title.contains("Tracking"))
			{
				break;
			}
		}
		
		
	}

}
