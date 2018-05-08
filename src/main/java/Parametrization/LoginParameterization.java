package Parametrization;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wrapper1.GenericWrapper1;

public class LoginParameterization extends GenericWrapper1 {
		
	@BeforeMethod

	@Parameters({"URL","Username","Password"})
		public  void Login(String URL,String UN,String PW) throws Exception{
			// TODO Auto-generated method stub
				
			invokeApp( "chrome" ,URL);
		    enterByXpath("//*[@id='username']",UN );	
			enterByXpath("//*[@id='password']",PW);
			clickById("password");
			clickByClassName("decorativeSubmit");

		}
		
		@AfterMethod
		public  void Close() throws Exception{
			// TODO Auto-generated method stub
				
			closeBrowser();
		}

		
	//String URL,String UN,String PW
	}


