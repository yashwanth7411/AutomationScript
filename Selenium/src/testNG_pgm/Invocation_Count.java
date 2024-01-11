package testNG_pgm;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(priority=2,invocationCount=3)
	public void btest()
	{
		System.out.println("Btest");
	}
	@Test
	public void ctest()
	{
		System.out.println("Ctest");
	}
	@Test(invocationCount=5)
	public void atest()
	{
		System.out.println("Atest");
	}

}
