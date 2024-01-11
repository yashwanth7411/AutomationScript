package automation_Selenium_Framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.abstractcomponent.Abstractcomponent;

public class Productcatalog extends Abstractcomponent{
	
	WebDriver driver;
	
	public Productcatalog(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css=".ng-animating")
	WebElement Refresh;
	
	By prodBy= By.cssSelector(".mb-3");
	By addToCart = By.xpath("(//button[@class='btn w-10 rounded'])[1]");
	By toastMsg = By.id("toast-container");
	By cart = By.cssSelector("[routerlink*=cart]");
	
	
	public List<WebElement> getProductList()
	{
		waitForEleToAppear(prodBy);
		return products;
	}
	
	public WebElement getProductByName(String productName)
	{
		WebElement prod = getProductList().stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productName)).findFirst().orElse(null);
		return prod;
	}
	
	
	public void addProductToCart(String productName) throws Throwable
	{
		WebElement prod = getProductByName(productName);
		prod.findElement(addToCart).click();
		waitForEleToAppear(toastMsg);
		waitForEleDisappear(Refresh);
	}
	
	
	
	
	
	
}
