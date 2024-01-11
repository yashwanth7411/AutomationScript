package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p7 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SelPgms/Html/text.html");
		
		//WebElement ele = driver.findElement(By.id("i1"));
		//WebElement ele = driver.findElement(By.name("n1"));
		//WebElement ele = driver.findElement(By.className("c1"));
		//WebElement ele = driver.findElement(By.partialLinkText("lip"));
		WebElement ele = driver.findElement(By.tagName("a"));
		ele.click();
		Thread.sleep(2000);
		driver.close();
	}

}
