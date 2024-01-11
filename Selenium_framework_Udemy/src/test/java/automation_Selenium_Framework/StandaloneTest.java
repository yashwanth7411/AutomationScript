package automation_Selenium_Framework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Landingpage;

public class StandaloneTest {
	public static void main(String args []) throws Throwable
	{
		String productName="ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		
		Landingpage lp=new Landingpage(driver);
		lp.loginApplication("anshika@gmail.com", "Iamking@000");
		Productcatalog pc=new Productcatalog(driver);
		List<WebElement> productList = pc.getProductList();
		pc.addProductToCart(productName);
		

		driver.findElement(By.cssSelector("[routerlink*=cart]")).click();
		
		List<WebElement> cartprods = driver.findElements(By.cssSelector(".cartSection h3"));
		boolean match = cartprods.stream().anyMatch(cartprod-> cartprod.getText().equalsIgnoreCase(productName)); 
		Assert.assertTrue(match);
	}
}
