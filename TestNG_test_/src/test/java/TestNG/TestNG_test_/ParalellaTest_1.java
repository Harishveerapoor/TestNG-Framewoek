package TestNG.TestNG_test_;

import org.testng.annotations.Test;

public class ParalellaTest_1 {
	
	// its run in xml
   @Test
   public void test1() {
	   System.out.println("this is my test case");
	   System.out.println("this is 1st:"+Thread.currentThread().getId());
   }
   @Test
   public void test2() {
	   System.out.println("this is my test case");
	   System.out.println("this is 2nd:"+Thread.currentThread().getId());
   }
   @Test
   public void test3() {
	   System.out.println("this is my test case");
	   System.out.println("this is 3rd:"+Thread.currentThread().getId());
   }
   @Test
   public void test4() {
	   System.out.println("this is my test case");
	   System.out.println("this is 4th:"+Thread.currentThread().getId());
   }
}
