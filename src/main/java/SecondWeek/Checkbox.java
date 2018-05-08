package SecondWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
	public static void selectbox(WebDriver driver) throws InterruptedException
    {
           driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[1]")).click();    
     }
	
	public static void confirmselectedbox(WebDriver driver) throws InterruptedException
    {
           Boolean a = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/input")).isSelected();
           System.out.println("Selected----"+a);
           if(a==true){
               System.out.println("Default Selected - True");
           }
           else
           {
               System.out.println("False");
           }
       
    }
	public static void deselectedbox(WebDriver driver) throws InterruptedException
    {
		 driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/input[2]")).click();
         
    }
	
	public static void selectallbox(WebDriver driver) throws InterruptedException
    {
		 driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/input")).click();//Important to add input tab in xpath
         
    }
	
	
}
