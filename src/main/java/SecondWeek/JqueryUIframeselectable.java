package SecondWeek;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver; //important

public class JqueryUIframeselectable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "D:\\Radha\\driverssele\\IEDriverServer.exe");
		RemoteWebDriver driver=new InternetExplorerDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElementByTagName("iframe"));

		//System.out.println(driver.findElementByTagName("title").getText());
		List<WebElement> element = driver.findElementsByTagName("li");

		for(WebElement eli : element)
		{
			System.out.println(eli.getText());
			if(eli.getText().contains("Item 3"))
			{
				driver.findElementByXPath("//li[contains(text(),'Item 3')]");
			}
		}



		driver.switchTo().defaultContent();

		System.out.println(driver.getTitle());
		// TODO Auto-generated method stub

	}

}
