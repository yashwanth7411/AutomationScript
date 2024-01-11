package testNG_pgm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_On_Groups {
	@Test(groups= {"smoke"})
	public void mthd1()
	{
		System.out.println("Method1");
	}
	
	@Test(groups = {"smoke"})
	public void mthd2()
	{
		Assert.fail();
		System.out.println("Method2");
	}
	
	@Test(groups= {"functional"}, dependsOnGroups= {"smoke"})
	public void mthd3()
	{
		System.out.println("Method3");
	}
	
	@Test(groups= {"Integration"}, dependsOnGroups= {"functional"})
	public void mthd4()
	{
		System.out.println("Method4");
	}
	
}
