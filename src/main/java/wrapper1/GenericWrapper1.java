package wrapper1;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper1 implements Wrapper{
	public RemoteWebDriver driver;
	public int i=1;

	public void invokeApp(String browser1, String url1) throws Exception {
		// TODO Auto-generated method stub
		if(browser1.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url1);
			Thread.sleep(3000);
			//driver.manage().window().maximize();
		}
	}

public void enterById(String idValue, String data) throws Exception {
		try {
			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);	
			System.out.println("The data: "+data+" entered successfully in field :"+idValue);
		} catch (Exception e) {
			System.err.println("The data: "+data+" could not be entered in the field :"+idValue);
		}
		
		// TODO Auto-generated method stub
		
	}

public void dropdown(String value, String data)
{
	try{
	Select ss= new Select(driver.findElementById(value));
	ss.selectByVisibleText(data);
	System.out.println("Value is choosen==" +data);
	}
	catch(Exception e)
	{
		System.out.println("Value is NOT choosen==" +data);
	}	
	
}
	

	public void enterByName(String nameValue, String data) throws Exception {
		
		try {
			driver.findElementByName(nameValue).clear();
			driver.findElementByName(nameValue).sendKeys(data);	
			System.out.println("The data: "+data+" entered successfully in field :"+nameValue);
		} catch (Exception e) {
			System.err.println("The data: "+data+" could not be entered in the field :"+nameValue);
		}
		
		// TODO Auto-generated method stub
		

		
	}

	public void enterByXpath(String xpathValue, String data) throws Exception {
		try
		{
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The value is entered : "+data );
		}
		catch(Exception e)
		{
			System.out.println("NOT Entered");
			// TODO Auto-generated method stub
		}
		
	}

	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		String pagetitle = driver.getTitle();
		System.out.println("Title");
		try
		{
			if(pagetitle==title)
			{
			System.out.println("Title displayed :" +title);
			}
		}
		catch(Exception e)
		{
			System.out.println("Title not displayed");
		}
		
		return true;
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	}

	public void clickById(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void clickByClassName(String classVal) throws Exception {
		// TODO Auto-generated method stub
		try{
		driver.findElementByClassName(classVal).click();
		System.out.println("The button is clicked  :" +classVal);
		}
		catch(Exception e)
		{
			System.out.println("Throws an exception");
		}
		finally
		{
			System.out.println(driver.getTitle());
		}
		}


	public void clickByName(String name) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void clickByLink(String name) throws Exception {
		// TODO Auto-generated method stub
		driver.findElementByLinkText(name).click();
		System.out.println("Link is clicked successfully==>" +name  );
		
	}

	public void clickByLinkNoSnap(String name) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void clickByXpath(String xpathVal) throws Exception {
		try{
			
		driver.findElementByXPath(xpathVal).click();
		
		System.out.println("The element : "+xpathVal+" is clicked.");
		} catch (Exception e) {
			System.err.println("The element with xpath: "+xpathVal+" could not be clicked.");
		}/*finally {
			takeSnap();
		}*/
		// TODO Auto-generated method stub
		
	}
	


	public void clickByXpathNoSnap(String xpathVal) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public String getTextById(String idVal) {
		String val = null;
		String expected="Radha";
		try{
		// TODO Auto-generated method stub
		val=driver.findElementById(idVal).getText();
		System.out.println("The value is :" +val);
		if(val.contains("Radha"))
		{
			System.out.println("Text is VERIFIED" +val);
		}
		else
		{
			System.out.println("Throw Error");
		}
				
		}
		catch(Exception e)
		{
			System.out.println("The value is NOT fetched ");
		}

		return val;
		}
		

	public String getTextByXpath(String clickByXpath) throws Exception {
		
		// ODO Auto-generated method stub
		
		System.out.println(driver.findElementByXPath(clickByXpath).getText());
		Thread.sleep(1000);
		return clickByXpath;
	}

	public void selectVisibileTextById(String id, String value) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void selectIndexById(String id, int value) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void switchToParentWindow() {
		try{
			Set<String> wHandles = driver.getWindowHandles();
			for (String wHandle : wHandles) {
				driver.switchTo().window(wHandle);
				break;
			}
		}catch (Exception e) {

		}
		
	}

	public void switchToLastWindow() {
		
		try {
			Set<String> wHandles = driver.getWindowHandles();
			for (String wHandle : wHandles) {
				driver.switchTo().window(wHandle);				
			}
		} catch (Exception e) {

		}
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();	
			Thread.sleep(1000);
			System.out.println("Alert is clicked");
		} catch (Exception e) {

		}
		
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void takeSnap() {
		File srcFile1 = driver.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./snaps/snap"+i+".jpeg");

		
		try {
			FileUtils.copyFile(srcFile1, destFile1);
		} catch (IOException e) {

			System.err.println("There was IO Exception while taking the SnapShot");
		}
		i++;

	}

	public void closeBrowser() {
		try{
			driver.close();
			System.out.println("Browser is closed");
		}
		catch(Exception e)
		{
			System.out.println("Browser is not closed");
		}
	
		// TODO Auto-generated method stub
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}
	

}
