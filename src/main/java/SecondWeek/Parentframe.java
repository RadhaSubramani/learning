package SecondWeek;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentframe 
{
	public static void main(String[] args) throws InterruptedException 
	   {
	System.setProperty("webdriver.chrome.driver", "D:\\Radha\\driverssele\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://literacy.kent.edu/Midwest/HTML/findex.htm");
	Thread.sleep(3000); 
	//driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame")));
	driver.switchTo().frame(1);
	//driver.switchTo().frame(1);
	System.out.println("i am in frame ");
	System.out.println(driver.findElement(By.tagName("body")).getAttribute("bgcolor"));
	
	System.out.println("got bgcolor");
	//driver.findElement(By.linkText("home page")).click();
	driver.switchTo().parentFrame();
	System.out.println(driver.findElement(By.tagName("frameset")).getAttribute("cols"));
	System.out.println("Success");
	
	/*driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='body.htm']")));
	//driver.switchTo().frame(driver.findElement(By.tagName("frame").get(0));
	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='table.htm']")));
	 
	driver.findElement(By.xpath("//a[contains(text(),'Mn. SLRC')]")).click();
	 
	driver.switchTo().defaultContent();
	 
	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@attribute='body.htm']")));
	 
	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@attribute='display.htm']")));
	 
	driver.findElement(By.linkText("referring page")).click();
	 
	driver.findElement(By.xpath("/html/body/center/a/img")).click();
	 
	driver.findElement(By.xpath("//a[contains(text(),'Mission ')")).click();
	 
	driver.switchTo().parentFrame();*/
	
	/*driver.switchTo().frame(driver.findElement(By.tagName("frameset")));
	System.out.println("executed 36th line");
	driver.switchTo().frame();
	System.out.println("executed 38th line");
	driver.switchTo().frame(driver.findElement(By.tagName("frameset")));
	System.out.println("executed 40th line");
	driver.switchTo().frame(1);
	System.out.println("executed 42th line");
	driver.switchTo().parentFrame();
	System.out.println("executed 44th line");
	*/

}
}
