package devtools;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v112.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevtoolsPgm {
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		DevTools devTools=driver.getDevTools();
		
		devTools.createSession();
	//	devTools.send(Emulation.setDeviceMetricsOverride(600, 783, 50,true, Optional.empty(), Optional.empty(),Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Emulation.setDeviceMetricsOverride(600, 783, 50,true, Optional.empty(), Optional.empty(),Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), null));
//		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
//		driver.findElement(By.className("navbar-toggler-icon")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//a[text()='Library']")).click();
//		
		
		
	}

}
