package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class HomePage extends ProjectWrappers {

	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Home Page", "FAIL");
		}
	}	

	public LoginPage clickLogOut(){
		clickByClassName(prop.getProperty("Home.Logout.Class"));	
		return new LoginPage(driver, test);
	}
	
	public HomePage verifyWelcomeMsg(String text){
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), text);
		return this;
	}
	
	
	





















}
