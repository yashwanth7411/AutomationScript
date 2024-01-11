package testNG_pgm;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Dependency {
	@Test
	public void login()
	{
		System.out.println("login script");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout()
	{
		System.out.println("logout script");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void user()
	{
		Assert.fail();
		System.out.println("user script");
	
	}
	@Test(dependsOnMethods= {"login","user"})
	public void adduser()
	{
		System.out.println("Add User Script");
		
	}
	

}
