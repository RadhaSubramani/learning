package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class March13 {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		// TODO Auto-generated method stub
		driver.get("www.google.co.in");
		Thread.sleep(3000);
		driver.findElementById("lst-id").sendKeys("inautix");
	}

}
