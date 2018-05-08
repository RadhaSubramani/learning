package SecondWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Radiobutton 
{
	public static void radiooption1(WebDriver driver) throws InterruptedException
    {
           driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[6]/a")).click();
           Thread.sleep(3000);
           
           driver.findElement(By.xpath("//*[@id='yes']")).click();
    }
	
	public static void isselected(WebDriver driver) throws InterruptedException
    {
		
		//System.out.println(driver.findElement(By.id("//*[@id='contentblock']/section/div[2]/div/div/input[1]")).isSelected());
	   Boolean b=driver.findElement(By.id("//*[@id='contentblock']/section/div[2]/div/div/input[2]")).isSelected();
	    System.out.println("Button 2 Enabled" +b);
	    if(b==true)
	    {
	    	System.out.println("Default Selected");
	    }
	    else
	    {
	    	System.out.println("Default not Selected");
	    }
	}
	        
}
		

	/*public static void buttoncount(WebDriver driver) throws Interruptedexception
	{
	 List<WebElement>radioButton = driver.findElements(By.tagName("input"));
	    System.out.println(radioButton.size());

}*/
	