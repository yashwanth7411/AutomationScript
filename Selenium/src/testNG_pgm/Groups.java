package testNG_pgm;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups= {"smoke"})
		public void m1()
		{
			System.out.println("Method 1");
		}
		@Test(groups= {"smoke","functional"})
		public void m2()
		{
			System.out.println("Method 2 ");
		}
		
		@Test(groups= {"functional"})
		public void m3()
		{
			System.out.println("Method 3");
	}
		
		@Test(groups= {"Integration"})
		public void m4()
		{
			System.out.println("Method 4");
		}

}
