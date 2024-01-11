package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	@Given("I landed on Ecommerce page")
	public void i_land_on_ecommerce_page()
	{
		
	}
	
	@Given("^ Logged in with username (.+) and password (.+)$")
	public void logged_in_username_and_password(String name, String pwd)
	{
		
	}
	  
	@When ("^I add product (.+) to cart$")
	public void add_produc(String productName)
	{
		
	}
	
	@When("^checkout (.+) and submit the order$")
	public void checkout_and_submit()
	{
		
	}
	
	
	@Then ("{string} message is displayed on Confirmation Page")
	public void message_confirmtion(String string)
	{
		
	}
}
