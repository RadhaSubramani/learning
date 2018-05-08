package Annotations;


import java.util.Set;

import org.junit.Test;

import wrapper1.GenericWrapper1;


public class TC_MergeLead extends LoginTestleaf{
@Test	
	public void mergelead() throws Exception
	{
		//login();
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])");
		Thread.sleep(3000);
		switchToLastWindow();
		enterByXpath("//*[@id='ext-gen25']","10085");
		clickByXpath("//*[@id='ext-gen114']");
		clickByXpath("(//a[@class='linktext'])[1]");
		Thread.sleep(1000);
		switchToParentWindow();
		clickByXpathNoSnap("(//img[@alt='Lookup'])[2]");
		Thread.sleep(1000);
		switchToLastWindow();
		enterByXpath("(//input[@type='text'])","10083");
		clickByXpath("//button[@class='x-btn-text']");
		clickByXpathNoSnap("//a[@class='linktext']");
		Thread.sleep(1000);
		switchToParentWindow();
		clickByClassName("buttonDangerous");
		acceptAlert();
		clickByLink("Find Leads");
		enterByXpath("(//input[@name='id'])","10088");
		clickByXpath("//button[@class='x-btn-text']");
		getTextByXpath("//div[@class='x-paging-info']");
		closeBrowser();
		
		} 
	

}

