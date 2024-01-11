package exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidth {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.name("pwd"));
		
		int h1 = un.getSize().getHeight();
		int w1 = un.getSize().getWidth();
		
		int h2 = pwd.getSize().getHeight();
		int w2 = pwd.getSize().getWidth();
		
		if(h1==h2&&w1==w2)
			System.out.println("pass: Same Dimension");
		else
			System.out.println("Fail: Not same Dimension");
	}

}
