package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC002_LoginNegative extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC002_Login(Negative)";
		testDescription = "Login with wrong data and confirm";
		authors = "Gopi";
		category = "Sanity";
		browserName = "chrome";
		dataSheetName = "TC002";		
	}
	
	@Test(dataProvider="fetchData")
	public void loginLogOut(String uName, String pwd, String error){
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLoginForFailure()
		.verifyErrorMsg(error);
	}
}















