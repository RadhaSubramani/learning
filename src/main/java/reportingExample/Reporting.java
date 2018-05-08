package reportingExample;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reporting {

	public WebDriver driver=null;
	@BeforeMethod
	
		public void load() throws InterruptedException
		{
			//System.setProperty("webdriver.geckodriver.driver","D:\\Radha\\driverssele\\geckodriver-v0.19.1-win32\\geckodriver.exe");
			
					
					//FirefoxOptions options = new FirefoxOptions();
					//options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); 
					//This is the location where you have installed Firefox on your machine
		            System.setProperty("webdriver.ie.driver","D:\\Radha\\driverssele\\IEDriverServer.exe");

		            driver = new InternetExplorerDriver();
		            driver.get("https://www.google.co.in");
		            Thread.sleep(1000);
		            Alert myAlert=driver.switchTo().alert();
		           /* WebDriverWait wait = new WebDriverWait(driver, 40);
		            Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());*/
		            myAlert.accept();
		            
		            
			
		}
	@Test
	
		public void run()
		{
			String title="Google";
			if(driver.getTitle().equalsIgnoreCase(title))
			{
				System.out.println("Webpage Loaded");
			}
			else
			{
				System.out.println("Webpage not Loaded");
				//takeSnap();
			}
		}
		
	
	
	/*public void takeSnap() {
		int i = 0;
		File srcFile1 = ((FirefoxDriver) driver).getScreenshotAs(OutputType.FILE);
		
		File destFile1 = new File("./snaps/snap"+i+".jpeg");
		
		
		try {
			FileUtils.copyFile(srcFile1, destFile1);
		} catch (IOException e) {

			System.err.println("There was IO Exception while taking the SnapShot");
		}
		i++;

	}*/

}