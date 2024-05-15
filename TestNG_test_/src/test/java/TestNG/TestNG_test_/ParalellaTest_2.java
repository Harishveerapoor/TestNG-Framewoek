package TestNG.TestNG_test_;

import org.testng.annotations.Test;

public class ParalellaTest_2 {
	
	// its run in xml
	 @Test
	   public void test5() {
		   System.out.println("this is my test case");
		   System.out.println("this is 5th:"+Thread.currentThread().getId());
	   }
	   @Test
	   public void test6() {
		   System.out.println("this is my test case");
		   System.out.println("this is 6th:"+Thread.currentThread().getId());
	   }
}
