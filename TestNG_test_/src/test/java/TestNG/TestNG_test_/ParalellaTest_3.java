package TestNG.TestNG_test_;

import org.testng.annotations.Test;

public class ParalellaTest_3 {
	 @Test(threadPoolSize = 5,invocationCount = 5,timeOut = 1000)
	   public void test5() {
		   System.out.println("this is my test case");
		   System.out.println("this is 5th:"+Thread.currentThread().getId());
	   }

}
