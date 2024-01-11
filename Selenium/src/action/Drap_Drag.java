package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drap_Drag {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement b1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement b4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	//	Thread.sleep(4000);
		Actions a=new Actions(driver);
		a.dragAndDrop(b1, b4).release().perform();
	}

}
