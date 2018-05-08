package SecondWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazonxpath {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000); 
		//1.
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("accessories");
		//2. 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//3.//driver.findElement(By.xpath("//*[text()[contains(.'Today's Deals')]]"));==>not worked
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
		Thread.sleep(3000);
		//4.
		driver.findElement(By.xpath("//span[contains(text(),'Departments')]")).click();
		//5
		driver.findElement(By.xpath("//a[contains(text(),'Included with Prime')]")).click();
		//6
		driver.findElement(By.xpath("//*[@id='content']/div[4]/div/div[1]/h2/a")).click();
		//7
		driver.findElement(By.xpath("//img[contains(@alt,'Prime Eligible')]")).click();
		Thread.sleep(1000);
		driver.navigate().to("https://www.amazon.com");
		//8
		driver.findElement(By.xpath("//img[contains(@alt,'Kindle')]")).click();
		//9
		driver.findElement(By.xpath("//span[contains(text(),'Kindle eBooks')]")).click();
		//10
		driver.findElement(By.xpath("//a[contains(text(),'Kindle for Android')]")).click();
		Thread.sleep(3000);
		//11.
		driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']")).click();
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
