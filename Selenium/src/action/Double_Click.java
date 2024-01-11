package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/SelPgms/Html/doubleclick.html");
		WebElement text = driver.findElement(By.id("demo"));
		Actions a=new Actions(driver);
		a.doubleClick(text).perform();
		
	}

}
