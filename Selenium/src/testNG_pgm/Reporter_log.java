package testNG_pgm;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_log {
	

	@Test
	public void m1()
	{
		System.out.println("Method1");
	}
	
	@Test
	public void m2()
	{
		Reporter.log("Method2", false);
	}
	
	@Test
	public void m3()
	{
		Reporter.log("Method3",true);
	}

}
