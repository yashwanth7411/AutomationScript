package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseoverDemo {
	
	@Test
	public void mouseover()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement e3 = driver.findElement(By.id("nav-link-accountList"));
		
		Actions a=new Actions(driver);
		a.moveToElement(e3).perform();
		
	}

}
