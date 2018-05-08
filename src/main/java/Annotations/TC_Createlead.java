package Annotations;


import org.testng.annotations.Test;
import wrapper1.GenericWrapper1 ; //imported genericwrapper1 class where method is defined

public class TC_Createlead extends LoginTestleaf{
@Test	
	public void createlead() throws Exception{
		
		//login();
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName","sarath");
		enterById("createLeadForm_firstName","sarath");
		enterById("createLeadForm_lastName", "kumar");
		dropdown("createLeadForm_dataSourceId","Partner");
		dropdown("createLeadForm_marketingCampaignId","Road and Track");
		enterById("createLeadForm_primaryEmail", "Sarath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "1234567890");
		clickByClassName("smallSubmit");
		getTextById("viewLead_companyName_sp");
		closeBrowser();
		
/*		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField","Apple");
		enterById("lastNameField","Phone");
		clickByName("submitButton");*/
		// TODO Auto-generated method stub
	}
}
