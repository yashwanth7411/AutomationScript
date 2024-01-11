package com.qa.practice;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups= {"smoke"})
	public void mthd1()
	{
		System.out.println("Method 1");
	}
	
	@Test(groups= {"smoke" , "functional"})
	public void mthd2()
	{
		System.out.println("Method 2");
	}
	
	@Test(groups= {"functional"})
	public void mthd3()
	{
		System.out.println("Method 3");
	}
	
	@Test(groups= {"Integration"})
	public void mthd4()
	{
		System.out.println("Method 4");
	}
	

}
