package SecondWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBrelativepath
 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		Thread.sleep(3000); 	
		//1. finding element using xpath - contains
		driver.findElement(By.xpath("//a[@href='/pages/create/?ref_type=sitefooter']"));
		driver.navigate().back();
		//2. finding element using xpath		
		driver.findElement(By.xpath("//span[contains(text(),'Create a Post')]"));
		//finding element by attribute 
				//driver.findElement(By.xpath("//a[@id='birthday-help']")).click();		
				driver.findElement(By.id("Email")).sendKeys("radhas217@gmail.com");
				driver.findElement(By.id("Pass")).sendKeys("tamil1234");		
				driver.findElement(By.xpath("//*[@id='u_0_1m']")).click();	
				//3. finding element using xpath - contains
				driver.findElement(By.xpath("//span[contains(text(),'Coimbatore HR')]"));
				driver.findElement(By.xpath("//strong[contains(text(),'Apartments & Villas in OMR from 33L')]"));
				driver.quit();
								
	}

}
