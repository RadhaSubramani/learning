package Annotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wrapper1.GenericWrapper1;

public class LoginTestleaf extends GenericWrapper1{
	
	@BeforeMethod

	@Parameters({"URL","Username","Password"})
		public  void Login(String URL,String UN,String PW) throws Exception{
	
		invokeApp("chrome", "http://leaftaps.com/control/main");
		enterById("username","DemoSalesManager");		
		enterByName("PASSWORD","crmsfa");
		clickByXpath("//input[@value='Login']");
		clickByLink("CRM/SFA"); // finding linktext
	}


}
