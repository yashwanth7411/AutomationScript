package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_pop_up {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:D:SelPgms/Html/prompt.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a=driver.switchTo().alert();
		a.sendKeys("Yashwanth");
		a.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		a.sendKeys("Harry");
		a.dismiss();
	}

}
