package SecondWeek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist {
	public static void selectoptionbyindex(WebDriver driver, int index) throws InterruptedException
    {		
			driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[5]/a")).click();
			Thread.sleep(3000);
		   WebElement dropdown=driver.findElement(By.id("dropdown1"));
           Select dd=new Select(dropdown);
           dd.selectByIndex(index);
           Thread.sleep(3000);
    }
   
    public static void selectoptionbytext(WebDriver driver, String word) throws InterruptedException
    {
           WebElement dropdown=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/select"));
           Select dd=new Select(dropdown);
           dd.selectByVisibleText(word);
           Thread.sleep(3000);
    }
   
    public static void selectoptionbyvalue(WebDriver driver, String number) throws InterruptedException
    {
           WebElement dropdown=driver.findElement(By.id("dropdown3"));
           Select dd=new Select(dropdown);
           dd.selectByValue(number);
           Thread.sleep(3000);
    }
   
    public static void printalloptions(WebDriver driver) throws InterruptedException
    {
           List<WebElement> allList=driver.findElements(By.xpath("//*[@id='contentblock']/section/div[4]/select"));
           for(WebElement count:allList)
           {
                  System.out.println("==>" +count.getText());
                  Thread.sleep(3000);
           }
          
    }
    
    public static void sendkeyoption(WebDriver driver) throws InterruptedException
    {
           driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select")).sendKeys("UFT/QTP");
           driver.navigate().back();
           Thread.sleep(3000);
       
    }
  
    /*public static void choosefromlist(WebDriver driver) throws InterruptedException
    {
           driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select/option[1]")).sendKeys("Selenium");
           driver.navigate().to("http://testleaf.herokuapp.com");
           Thread.sleep(3000);      
    }*/

}
