
package Parametrization;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import readexcel.ReadExcel;
import wrapper1.GenericWrapper1;

public class Dataprovider extends LoginParameterization{
	
	@Test(dataProvider = "fetchdata")
	public void createlead(String CN,String FN) throws Exception {
		// TODO Auto-generated method stub
		
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",CN);
		enterById("createLeadForm_firstName", FN);
		enterById("createLeadForm_lastName", "Surendaran");
		clickById("createLeadForm_dataSourceId");
		selectVisibileTextById("createLeadForm_dataSourceId", "Conference");
		clickByName("marketingCampaignId");
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Automobile");
		enterById("createLeadForm_primaryEmail", "Jhananee@CTS.com");
		enterById("createLeadForm_primaryPhoneNumber", "9046854321");
		clickByName("submitButton");

	}


@DataProvider(name = "fetchdata")
public Object[][] getData() throws IOException{
	ReadExcel el = new ReadExcel();
	return el.readExcel();
	 		
}



}