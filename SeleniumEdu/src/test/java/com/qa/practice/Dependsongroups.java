package com.qa.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsongroups {
	@Test(groups= {"smoke"})
	public void mthd1()
	{
		System.out.println("Method 1");
	}
	
	@Test(groups= {"smoke"})
	public void mthd2()
	{
		Assert.fail();
		System.out.println("Method 2");
	}
	
	@Test(groups= {"functional"}, dependsOnGroups= {"smoke"})
	public void mthd3()
	{
		System.out.println("Method 3");
	}
	
	@Test(groups= {"Integartion"}, dependsOnGroups= {"smoke", "functional"})
	public void mthd4()
	{
		System.out.println("Method 4");
	}

}
