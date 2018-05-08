package wrapper1testcase;

import wrapper1.GenericWrapper1;

public class LoginTestleaf extends GenericWrapper1{
	
	public void login() throws Exception{
		invokeApp("chrome", "http://leaftaps.com/control/main");
		enterById("username","DemoSalesManager");		
		enterByName("PASSWORD","crmsfa");
		clickByXpath("//input[@value='Login']");
		clickByLink("CRM/SFA"); // finding linktext
	}


}
