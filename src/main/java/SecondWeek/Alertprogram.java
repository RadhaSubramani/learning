package SecondWeek;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprogram {
	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://t4t5.github.io/sweetalert/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/div[1]/button")).click();
		Alert task =driver.switchTo().alert();
		task.accept();
		

	}

}
