package selenium4.o;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow {
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		// Scripts used for Selenium 4.0 version 
		
			driver.get("https://rahulshettyacademy.com/angularpractice/");

		//Switching Window

		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles=driver.getWindowHandles();

		Iterator<String> it=handles.iterator();
		String parentWindowId = it.next();
		String childWindow =it.next();
		driver.switchTo().window(childWindow);

		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
		.get(1).getText();

		driver.switchTo().window(parentWindowId);

		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);

		//Screenshot

		File file=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));  
		
		
		// To get height and width of the element
	//	driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nametf=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(nametf.getRect().getDimension().getHeight());
		System.out.println(nametf.getRect().getDimension().getWidth());
		
		driver.quit(); 
	}

}
