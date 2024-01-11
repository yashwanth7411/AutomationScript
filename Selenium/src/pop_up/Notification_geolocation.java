package pop_up;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_geolocation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	/*	ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-geolocation");
		WebDriver driver=new ChromeDriver(options);  */

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",
		     Arrays.asList("disable-popup-blocking"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.naukri.com");
	}

}
