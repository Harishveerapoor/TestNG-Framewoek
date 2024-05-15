package TestNG.TestNG_test_;

import org.testng.annotations.Test;

public class Invocationcount {

	@Test(invocationCount = 2)
	public void invo() {
		System.out.println("PRINT");
	}
//	// type 2
		@Test(enabled = true)
		public void enabled()
	{
		System.out.println("this is true");
	}
		@Test(enabled = false)
		public void enable()
	{
		System.out.println("this is true");
	}
		// type 3
		@Test
		public void exceptionHandle()
	{
		System.out.println("this is haish");
	}
		@Test
		public void exceptionHandle2()
	{
		System.out.println("this is haish 2");
		int i=1/0;
	}
		
	    @Test(expectedExceptions = ArithmeticException.class)
		public void exceptionHandle3()
	{
		System.out.println("this is haish 3");
		int i=1/0;
	}	
		
}
