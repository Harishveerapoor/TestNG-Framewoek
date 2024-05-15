package TestNG.TestNG_test_;

import org.testng.annotations.DataProvider;

public class DataProvider_2 {
	
             // type 2
	
	// its linked with  DataProvider_1
	@DataProvider(name="test")
	public Object[][] data() {
		return new Object[][] {{"harishveerapoor6@gmail.com","harish@6"},{"harikjbdkweb6@gmail.com","266383@6"}};
	}
	

}
