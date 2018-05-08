package wrapper1Testcase;

import org.testng.annotations.Test;

public class TC_Duplicatelead extends LoginTestleaf{
	@Test

	public void createlead() throws Exception{
	
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[contains(text(),'Email')]");
		enterByXpath("(//input[@type='text'])[17]","Sarath@testleaf.com");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		
		
		
	
	}
	}
	
	
	
