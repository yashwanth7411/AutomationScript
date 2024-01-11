package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		WebElement element = driver.findElement(By.xpath("(//a[text()='Start Using actiTIME'])[2]"));
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(200"+","+y+")");
	}

	}
