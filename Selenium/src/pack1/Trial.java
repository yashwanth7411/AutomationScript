package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.className("SDkEP")).click();
		
	}

}
