package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class March14 {

	public static void main(String[] args) throws InterruptedException {
		/*FirefoxDriver driver=new FirefoxDriver();
	
*/	System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);;
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in"));
		driver.findElement(By.id("Email")).sendKeys("radhascs@gmail.com");
		//driver.findElement(By.id("Emails")).sendKeys("radhascs@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("Ramya2017");
				
	}
	
}
