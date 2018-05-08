package wrapper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrapper implements Wrapper{
	public RemoteWebDriver driver;
	public int i=1;

	public void invokeApp(String browser, String url) throws Exception {
		// TODO Auto-generated method stub
		
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\geckodriver_32bit.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			Thread.sleep(3000);
			//driver.manage().window().maximize();
		}
		
		
		
	}
	public void invokeAppchrome(String browser1, String url1) throws Exception {
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
		// TODO Auto-generated method stub
		
	}

	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
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
		}finally {
			takeSnap();
		}
		// TODO Auto-generated method stub
		
	}

	public void clickByXpathNoSnap(String xpathVal) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectVisibileTextById(String id, String value) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void selectIndexById(String id, int value) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}
	

}
