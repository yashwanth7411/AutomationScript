package practice;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Four_java {
	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh);
		for(String a:allwh)
		{
			driver.switchTo().window(a);
			String title = driver.getTitle();
			System.out.println(title);
			TakesScreenshot t=(TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshot/"+title+".png");
			FileUtils.copyFile(src, dest);
			if(title.contains("Tracking"))
			{
				break;
			}
		}
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[text()='Start tracking time for free']"));
	    System.out.println(element.getLocation().getX());
		System.out.println(element.getLocation().getY());	
		//Actions a = new Actions(driver);
		//a.moveToElement(element).perform();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(343,3596)");
	}
}
