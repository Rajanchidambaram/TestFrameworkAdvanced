package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations extends WrapperMethods{

	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("Before Test");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Groups");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		invokeApp("http://leaftaps.com/opentaps","chrome");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
		closeBrowser();	
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("AfterGroups");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	
}
