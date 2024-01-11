package parallel_Execution;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseTest {
	public WebDriver driver;
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void precondition(String br)
	{
		if(br.equals("chrome"))
			driver=new ChromeDriver();
		else if(br.equals("firefox"))
			driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	
	@AfterMethod(alwaysRun=true)
	public void postCondition()
	{
		driver.close();
	}
	

}
