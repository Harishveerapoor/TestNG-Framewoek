package TestNG.TestNG_test_;

import org.testng.annotations.Test;

public class Priorities_1 {

	@Test(priority = 4)
	public void a() {
		System.out.println("its a");
	}
	@Test(priority = 0)
	public void b() {
		System.out.println("its b");
	}

	@Test(priority = 1)
	public void c() {
		System.out.println("its c");
	}

	@Test(priority = 2)
	public void d() {
		System.out.println("its d");
	}

}
