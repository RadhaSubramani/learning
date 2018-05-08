package week4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChildAnnotation extends ParentAnnotation{

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	@Test
	public void Test()
	{
		System.out.println("Test");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite");
	}

}
	
	

