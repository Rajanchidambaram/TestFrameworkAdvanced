package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class LoginPage extends ProjectWrappers {

	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM")){
			reportStep("This is not Login Page", "FAIL");
		}
	}

	public LoginPage typeUserName(String data){
		enterById(prop.getProperty("Login.UserName.Id"), data);
		return this;
	}

	public LoginPage typePassword(String data){
		enterById(prop.getProperty("Login.Password.Id"), data);
		return this;
	}

	public HomePage clickLogin(){
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return new HomePage(driver,test);
	}
	
	
	public LoginPage clickLoginForFailure(){
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return this;
	}
	
	public LoginPage verifyErrorMsg(String text){
		verifyTextContainsById(prop.getProperty("Login.Error.Id"), text);
		return this;
	}





















}
