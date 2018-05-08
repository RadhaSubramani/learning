package SecondWeek;

import org.apache.http.HttpResponse;

import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Image 
{
	public static void clickimage(WebDriver driver) throws InterruptedException
    {		
			driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[4]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img")).click();
			driver.navigate().back();
			Thread.sleep(3000);
    }
	public static void brokenimage(WebDriver driver) throws InterruptedException
    {		try
    			{
				WebElement image=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
					if(image !=null)
					{
						verifyactive(image);
					}
    			}
				catch(Exception e)
				{
					e.printStackTrace();	
				}
		
    }
	public static void verifyactive(WebElement image)
	{
	
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(image.getAttribute("src"));
			HttpResponse response = client.execute(request);
			// verifying response code he HttpStatus should be 200 if not,
			if (response.getStatusLine().getStatusCode() != 200)
			{
				System.out.println("Broken Image");
			} 
			}
			catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void keyboardaction(WebDriver driver) throws InterruptedException
	{
	    WebElement element   = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/img"));
      
        Actions action =    new Actions(driver);
        action.moveToElement(element).doubleClick().perform();
        Thread.sleep(2000);
	}
	
	public static void gettitle(WebDriver driver) throws InterruptedException
	{
		System.out.println(driver.getTitle());
      
	}	
}