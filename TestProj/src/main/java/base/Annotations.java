package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
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
import org.testng.annotations.DataProvider;
import dataprovider.ExcelDataProvider;

public class Annotations extends WrapperMethods

{
	public static Properties prop;
	public String excelName;

    /**
     * @author RajaRajan
     * This method loads the properties file 
     * @throws FileNotFoundException
     * @throws IOException
     */
	@BeforeSuite
	public void beforesuite() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(new File("./src/main/resources/config.properties")));
		startTest();
	
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
	
	/**
	 * This method is used to launch the URL and login to the application
	 * @throws MalformedURLException 
	 */
	@BeforeMethod
	public void beforeMethod() throws MalformedURLException {
		startTestCase(testName, testDescription, category, author);
		System.out.println("BeforeMethod");
		//invokeApp(prop.getProperty("url"),prop.getProperty("browser"));
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);
		dc.setVersion("59.0");
		if(prop.getProperty("Run").equals("remote")){
			driver=new RemoteWebDriver(new URL(prop.getProperty("slabs")),dc);	
		}else {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		eventDriver =new EventFiringWebDriver(driver);
		OverrideListener handler=new Annotations();
		eventDriver.register(handler);
		eventDriver.get(prop.getProperty("url"));
		eventDriver.manage().window().maximize();
		eventDriver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		Type(locateElement("id", "username"),"DemoSalesManager" );
		Type(locateElement("id", "password"), "crmsfa");
		click(locateElement("xpath", "//input[@class='decorativeSubmit']"));
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
		endTest();
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
		endResult();
	}
	
	/**
	 * This method reads the data from the Excel(excel name passed from the Testcase)
	 * @return the object of data read from the excel 
	 * @throws IOException
	 */
	@DataProvider(name = "dataFeed")
	public Object[][] excelData() throws IOException {

		return ExcelDataProvider.readExcel(excelName);
		//"./data/TC_Delete.xlsx"
	}
}
