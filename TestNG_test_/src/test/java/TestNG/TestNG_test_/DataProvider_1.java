package TestNG.TestNG_test_;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1 {
	// type 1
	@Test(dataProvider = "test",dataProviderClass =  DataProvider_2.class)
	public void dataprovider(String userid,String pwd) {
		System.out.println("  userid:  "+userid);
		System.out.println("this pwd:  "+pwd);
	}
//	
//	@DataProvider(name="test")
//	public Object[][] data() {
//		return new Object[][] {{"harishveerapoor6@gmail.com","harish@6"},{"harikjbdkweb6@gmail.com","266383@6"}};
//	}
//	

}
