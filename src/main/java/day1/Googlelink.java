package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\driverssele\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
			
		/*String linkName=allLinks.get(1).getText();
		System.out.println(linkName);
		String type=allLinks.get(1).getAttribute("href");
		System.out.println(type);
		
		String linkName1=allLinks.get(2).getText();
		System.out.println(linkName1);
		String type1=allLinks.get(2).getAttribute("href");
		System.out.println(type1);
		
		String linkName2=allLinks.get(3).getText();
		System.out.println(linkName2);
		String type2=allLinks.get(3).getAttribute("href");
		System.out.println(type2);
		
		String linkName3=allLinks.get(4).getText();
		System.out.println(linkName3);
		String type3=allLinks.get(4).getAttribute("href");
		System.out.println(type3);
		
		String linkName4=allLinks.get(5).getText();
		System.out.println(linkName4);
		String type4=allLinks.get(5).getAttribute("href");
		System.out.println(type4);
		
		String linkName5=allLinks.get(6).getText();
		System.out.println(linkName5);
		String type5=allLinks.get(6).getAttribute("href");
		System.out.println(type5);
		
		String linkName6=allLinks.get(7).getText();
		System.out.println(linkName6);
		String type6=allLinks.get(7).getAttribute("href");
		System.out.println(type6);*/
	}

}
