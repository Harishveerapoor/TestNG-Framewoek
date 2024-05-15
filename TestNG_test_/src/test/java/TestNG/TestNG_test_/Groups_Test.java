package TestNG.TestNG_test_;

import org.testng.annotations.Test;

public class Groups_Test {

	// its run in xml
	@Test(groups = "sanity")
	public void sanity() {
		System.out.println("1st ");
	}
	@Test(groups = "Regressiom")
	public void Regressiom() {
		System.out.println(" 2nd ");
	}
	@Test(groups = "sanity")      // it will run under( "" ) double qote 
	public void sanity2() {
		System.out.println("3rd ");
	}
	@Test(groups = "e2e")
	public void e2e() {
		System.out.println("4th ");
	}
}
