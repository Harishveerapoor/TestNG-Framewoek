package TestNG.TestNG_test_;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	// its run in xml
	
	@Test
	@Parameters({"userid","pwd"})
	public void login(String userid,String pwd) {
		System.out.println("this is"+userid);
		System.out.println("this is"+pwd);
	}
}
