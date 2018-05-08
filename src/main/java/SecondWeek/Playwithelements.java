package SecondWeek;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Playwithelements {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Radha\\Testleaf\\Testleaf Selenium Library\\Softwares and Videos\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.manage().window().maximize();
		
		//Methods for EditElement class
		/*Editelement.editclick(driver);
		Thread.sleep(3000);
		Editelement.email(driver, "radhascs@gmail.com");
		Editelement.appendtext(driver);
		Editelement.cleartext(driver);
		Editelement.defaulttext(driver);
		Editelement.disabled(driver);
		
		//Methods for Button class
		Button.buttonclick(driver);
		Button.travel(driver);
		Button.coordinate(driver);
		Button.findcolor(driver);
		Button.findheightwidth(driver);
		
		//Mehtods for Hyperlink class
		Hyperlink.gotohome(driver);
		Hyperlink.findwithoutclick(driver);
		Hyperlink.verifybrokenlink(driver);
		Hyperlink.verifythislink(driver);
		Hyperlink.gohome(driver);
		Hyperlink.findlinks(driver);*/
		
		//Methods for Dropdownlist class
		/*Dropdownlist.selectoptionbyindex(driver, 1);
		Dropdownlist.selectoptionbytext(driver, "Appium");
		//Dropdownlist.selectoptionbyvalue(driver,0);
		Dropdownlist.alloptions(driver);
		Dropdownlist.sendkeyoption(driver);
		//Dropdownlist.choosefromlist(driver);
*/		
		/*Image.clickimage(driver);
		Image.keyboardaction(driver);*/
		
		//Radiobutton.radiooption1(driver);
		//Radiobutton.isselected(driver);
		/*
		Checkbox.selectbox(driver);
		Checkbox.confirmselectedbox(driver);
		Checkbox.deselectedbox(driver);*/
		
		Image.brokenimage(driver);
		Image.clickimage(driver);
		Image.keyboardaction(driver);
		
		Image.gettitle(driver);
		
		
	}
}
