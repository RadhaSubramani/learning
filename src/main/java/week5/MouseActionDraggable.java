package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionDraggable {
	@Test
	public void mouseAction1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\driverssele\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions builder = new Actions(driver);
		WebElement dd=driver.findElement(By.id("draggable"));
		builder.dragAndDropBy(dd, 500, 200).build().perform();
	}
}
		
		
		
		


