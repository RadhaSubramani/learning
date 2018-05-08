package week3;

import wrapper.GenericWrapper; //imported genericwrapper class where method is defined

public class TestcaseCreateleadchrome {

	public static void main(String[] args) throws Exception {
		
		GenericWrapper gnw = new GenericWrapper();
		gnw.invokeAppchrome("chrome", "http://leaftaps.com/control/main");
		gnw.enterById("username","DemoSalesManager");		
		gnw.enterByName("PASSWORD","crmsfa");
		gnw.clickByXpath("//input[@value='Login']");
		gnw.clickByLink("CRM/SFA"); // finding linktext
		gnw.clickByLink("Leads");
		gnw.clickByLink("Create Lead");
		gnw.enterById("createLeadForm_companyName","sarath");
		gnw.enterById("createLeadForm_firstName","sarath");
		gnw.enterById("createLeadForm_lastName", "kumar");
		gnw.enterById("createLeadForm_primaryEmail", "Sarath@testleaf.com");
		gnw.enterById("createLeadForm_primaryPhoneNumber", "1234567890");
		gnw.clickByClassName("smallSubmit");
		gnw.clickByLink("Create Contact");
		gnw.enterById("firstNameField","Apple");
		gnw.enterById("lastNameField","Phone");
		gnw.clickByName("submitButton");
		// TODO Auto-generated method stub
	}
}
