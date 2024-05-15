package TestNG.TestNG_test_;

import org.testng.annotations.Test;

public class Dependson {

	@Test()
	public void test1() {
		System.out.println("test1");
		int i=1/0;
	}
	@Test(dependsOnMethods = "test1")
	public  void test2() {
		System.out.println("test2");
	}
	@Test(dependsOnMethods = {"test1","test2"})
	public  void test3() {
		System.out.println("test3");
		
	}
	@Test(dependsOnMethods = {"test1","test2"},alwaysRun = true)
	public  void test4() {
		System.out.println("test4");
	}
}
