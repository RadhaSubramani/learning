package week3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetTextMethod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\driverssele\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		System.out.println(driver.findElementByXPath("//div[@class='example']").getText());
		
		
	}

}
