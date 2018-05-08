package week4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParentAnnotation {
	@BeforeSuite
	public void beforeSuite1()
	{
		System.out.println("Before Suite1");
	}
	@BeforeMethod
	public void beforeMethod1()
	{
		System.out.println("Before method1");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Test1");
	}

	@AfterMethod
	public void afterMethod1()
	{
		System.out.println("AfterMethod1");
	}

}
