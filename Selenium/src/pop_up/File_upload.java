package pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_upload {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("__disable-notifications");
		option.addArguments("__disable-geolocation");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com");
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./cv/pop.exe");
		
		
	}

}
