package day1;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test2 {
	public static void editclick(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
	}
	public static void email(WebDriver driver,String Email) throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys(Email);
		//driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		
	}
	public static void appendtext(WebDriver driver) throws InterruptedException
	{
		WebElement element=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		element.sendKeys(Keys.chord("Join",Keys.TAB));  //this code will append a text and enter tab key
	}
	public static void cleartext(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input")).clear();	//clear the text value		
	}
	public static void defaulttext(WebDriver driver) throws InterruptedException
	{
		System.out.println(driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input")).getAttribute("value"));		
	}
	public static void disabled(WebDriver driver) throws InterruptedException
	{
		String link = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input")).getAttribute("disabled");
		if (link=="true")
		{
		   System.out.println("View link: Disabled");
		}
		else
		{
			System.out.println("View link: Enabled");
		}
		
		}
	}
