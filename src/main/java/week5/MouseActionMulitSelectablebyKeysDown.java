package week5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionMulitSelectablebyKeysDown {
	@Test
	public void mouseAction1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions builder = new Actions(driver);
		WebElement dd=driver.findElement(By.xpath("//ol[@id='selectable']/li[1]"));
		WebElement dd1=driver.findElement(By.xpath("//ol[@id='selectable']/li[3]"));
		WebElement dd2=driver.findElement(By.xpath("//ol[@id='selectable']/li[5]"));
		builder.keyDown(Keys.CONTROL).click(dd).click(dd1).click(dd2).release().build().perform();
		//builder.keyDown(Keys.CONTROL).click(dd).click(dd1).click(dd2).keyUp(Keys.CONTROL).build().perform();
		
		
	}
}
		
		
		
		


