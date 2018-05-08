package Annotations;

import org.testng.annotations.Test;

import wrapper1.GenericWrapper1;

public class TC_Deletelead extends LoginTestleaf{
	@Test	
	public void editlead() throws Exception{
		
		//login();
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByLink("Phone");
		//clickByXpath("//*[@id='ext-gen919']");//clicking phone tab
		enterByName("phoneCountryCode","91");		
		enterByName("phoneAreaCode","044");
		enterByName("phoneNumber","123456");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		getTextByXpath("(//a[@class='linktext'])[4]");
		clickByXpath("(//a[@class='linktext'])[4]");
		
		clickByClassName("subMenuButtonDangerous");
		clickById("Find Leads");
		enterByXpath("//*[@id='ext-gen247']","1234");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		getTextByXpath("//*[@id='ext-gen437']");
		closeBrowser();
		
		
	/*	clickByLink("Edit");
		enterById("updateLeadForm_companyName","Radha");
		clickByXpath("//input[@name='submitButton'])[1]");
		getTextById("viewLead_companyName_sp");
		closeBrowser();*/
		
		
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


