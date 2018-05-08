package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxlink {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\geckodriver_32bit.exe");
			WebDriver driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);;
			driver.get("https://www.google.co.in");
			Thread.sleep(3000);
			List<WebElement> allLinks=driver.findElements(By.tagName("a"));
			int linkCount=allLinks.size();
			System.out.println(linkCount);
			for(int i=0;i<linkCount;i++)
			{
				String linkName=allLinks.get(i).getText();
				System.out.println(linkName);
				String type=allLinks.get(i).getAttribute("href");
				System.out.println(type);
			}
				
		}

	}


	
