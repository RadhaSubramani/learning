package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class leaftaps {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);;
		//driver.get("https://www.google.co.in");
		//Thread.sleep(3000);			
		
		driver.get("http://leaftaps.com/control/main");
		Thread.sleep(3000);
		//driver.manage().window().maximize();
		driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElementByLinkText("/crmsfa/control/main?externalLoginKey=EL477076157803").click();
		driver.findElement(By.linkText("Create Contact")).click();
		//WebElement URL= driver.findElement(By.tagName("title"));
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();

	}

}
