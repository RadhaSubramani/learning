package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionSortable {
	@Test
	public void mouseAction1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/sortable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions builder = new Actions(driver);
		WebElement dd=driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
		WebElement dd1=driver.findElement(By.xpath("//ul[@id='sortable']/li[3]"));
		WebElement dd2=driver.findElement(By.xpath("//ul[@id='sortable']/li[4]"));
		int y=dd1.getLocation().getY();
		int y1=dd2.getLocation().getY();
		
		
		
		//builder.dragAndDropBy(dd, y, y1).release().build().perform(); ===>This also works
		builder.clickAndHold(dd).moveByOffset(y, y1).release().build().perform();
		
		
	}
}
		
		
		
		


