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

public class MouseActionResizable {
	@Test
	public void mouseAction1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions builder = new Actions(driver);
		WebElement dd=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		int x1=dd.getLocation().getX();
		int y1=dd.getLocation().getY();
		System.out.println("Before Resizable  :" +x1 +y1);
		builder.clickAndHold(dd).dragAndDropBy(dd, 50, 20).release().build().perform();
		int x=dd.getLocation().getX();
		int y=dd.getLocation().getY();
		System.out.println("After Resizable");
		System.out.println("X coordinate   :" +x);
		System.out.println("Y coordinate   :" +y);
		/*WebElement dd1=driver.findElement(By.xpath("//ul[@id='selectable']/li[3]"));

		int x=dd1.getLocation().getX();
		int y=dd1.getLocation().getY();*/
		
		


		
		
	}
}
		
		
		
		


