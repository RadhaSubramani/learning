package SecondWeek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hyperlink {
	
	public static void gotohome(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[3]/a")).click();
	driver.get("http://testleaf.herokuapp.com");
	Thread.sleep(3000);	
	}
	public static void findwithoutclick(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[3]/a")).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(3000);	
		}
	public static void verifybrokenlink(WebDriver driver) throws InterruptedException{
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/a")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
			if(title=="404 Not Found")
			{
				System.out.println("Link is Broken");
			}
			driver.navigate().back();
		}
	
	public static void verifythislink(WebDriver driver) throws InterruptedException{
		
		String title=driver.getTitle();
			if(title=="404 Not Found")
			{
				System.out.println("Link is Broken");
			}
			else{System.out.println("Link is not broken");}
			
		}
		
	public static void gohome(WebDriver driver) throws InterruptedException{
		driver.get("http://testleaf.herokuapp.com");
		Thread.sleep(3000);	
		driver.navigate().back();
		}
	
	public static void findlinks(WebDriver driver) throws InterruptedException{
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int linkCount=allLinks.size();
		System.out.println("Anchor link counts are"+linkCount);
		driver.navigate().back();
		}
	
	
}
