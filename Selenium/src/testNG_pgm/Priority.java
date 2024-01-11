package testNG_pgm;

import org.testng.annotations.Test;

public class Priority {
	@Test
	public void btest()
	{
		System.out.println("B test");
	}
	@Test
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
