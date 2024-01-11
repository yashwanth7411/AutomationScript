package testNG_pgm;

import org.testng.annotations.Test;

public class Priority_1 {
	@Test(priority=-1)  // Neagtive priority will execute first
	public void btest()
	{
		System.out.println("B test");
	}
	@Test(priority=7)
	public void atest()
	{
		System.out.println("A test");
	}
	@Test()
	public void ctest()
	{
		System.out.println("C test");
	}

}
