package com.qa.practice;

import org.testng.annotations.Test;

public class Dependensonmthd {
	@Test
	public void login()
	{
		System.out.println("Login Script");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout()
	{
		System.out.println("Logout Script");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void users()
	{
		System.out.println("Users Script");
	}
	
	@Test(dependsOnMethods= {"login", "users"})
	public void adduser()
	{
		System.out.println("Add User");
	}

}
