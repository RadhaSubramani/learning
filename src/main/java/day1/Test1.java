package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.manage().window().maximize();
		Test2.editclick(driver);
		Thread.sleep(3000);
		Test2.email(driver, "radhascs@gmail.com");
		Test2.appendtext(driver);
		Test2.cleartext(driver);
		Test2.defaulttext(driver);
		Test2.disabled(driver);
	}
}
