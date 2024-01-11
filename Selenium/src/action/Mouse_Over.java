package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com");
		WebElement ele = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();

		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		WebElement phone = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/..//p[2]"));
		System.out.println(phone.getText());
		
	}

}
