package pom.abstractcomponent;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstractcomponent {
	WebDriver driver;
	
	public Abstractcomponent(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void waitForEleToAppear(By findBy)
	{
	WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(3));	
	w.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForEleDisappear(WebElement ele) throws Throwable
	{
		Thread.sleep(1000);
	//	WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(3));
	//	w.until(ExpectedConditions.invisibilityOf(ele));
	}
}
