package Annotations;

import org.testng.annotations.Test;

import wrapper1.GenericWrapper1;

public class TC_Editlead extends LoginTestleaf{
	@Test	
	public void editlead() throws Exception{
		
		//login();
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("(//input[@name='firstName'])[3]","sarath");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpath("(//a[@class='linktext'])[4]");
		//verifyTitle("View Lead | opentaps CRM");
		clickByLink("Edit");
		enterById("updateLeadForm_companyName","Radha");
		clickByXpath("//input[@name='submitButton'])[1]");
		getTextById("viewLead_companyName_sp");
		closeBrowser();
		
		
/*		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","sarath");
		enterById("createLeadForm_firstName","sarath");
		enterById("createLeadForm_lastName", "kumar");
		dropdown("createLeadForm_dataSourceId","Partner");
		dropdown("createLeadForm_marketingCampaignId","Road and Track");
		enterById("createLeadForm_primaryEmail", "Sarath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "1234567890");
		clickByClassName("smallSubmit");
		getTextById("viewLead_companyName_sp");
		closeBrowser();*/
		
/*		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField","Apple");
		enterById("lastNameField","Phone");
		clickByName("submitButton");*/
		// TODO Auto-generated method stub
	}
}


