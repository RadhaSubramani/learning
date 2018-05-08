package SecondWeek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findframecount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://docs.oracle.com/javase/7/docs/api/");
		Thread.sleep(3000);
		// find all your frames
		List<WebElement> frame = driver.findElements(By.tagName("frameset"));
		        // print your number of frames
		        System.out.println(frame.size());

		        // you can reach each frame on your site
		     /*for (WebElement child : frameset) {

		            // switch to every frame
		    	 List<WebElement> frame = driver.findElements(By.tagName("frame"));
		    	 System.out.println(frame.size());
		    	 //driver.switchTo().defaultContent();
		         
		       }*/
		// 

	 }
	}


