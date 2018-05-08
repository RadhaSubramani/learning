package SecondWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Button {
	
		public static void buttonclick(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[2]/a")).click();
			Thread.sleep(3000);			
		}
		public static void travel(WebDriver driver) throws InterruptedException
		{
			driver.findElement(By.id("home")).click();
			//driver.navigate().to("http://testleaf.herokuapp.com");
			driver.navigate().back();
			Thread.sleep(3000);
			
		}
		public static void coordinate(WebDriver driver) throws InterruptedException
		{
			WebElement element=driver.findElement(By.id("position"));
			Point point=element.getLocation();
			System.out.println("X coordinate**" +point.getX());
			System.out.println("Y coordinate**" +point.getY());//this code will get the position of X and Y
		}
		public static void findcolor(WebDriver driver) throws InterruptedException
		{
			String color=driver.findElement(By.id("color")).getCssValue("background-color");	//find the background color		
			System.out.println("Color is" +color);
		}
		public static void findheightwidth(WebDriver driver) throws InterruptedException
		{
			System.out.println("Height is " +driver.findElement(By.xpath("//*[@id='size']")).getSize().getHeight());//find the height
			System.out.println("Width is "+driver.findElement(By.xpath("//*[@id='size']")).getSize().getWidth());//find the width
			driver.navigate().back();
		}
		public static void getlabelname(WebDriver driver) throws InterruptedException
		{
			System.out.println("Label Name***"+driver.findElement(By.xpath("//*[@id='size']")).getText());

		}

}

