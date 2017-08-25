package tests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.*;
import pagefactory.LoginPage;

public class TC_003_DeleteLead_PF extends Annotations{
	public static WebElement elem;
	
	@Test(dataProvider="fetchData")
	public void createLead() throws IOException  {
		 new LoginPage()
		.enterUserName()
		.enterPassWord()
		.submitForm()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickFindLeadsTab()
		.clickPhoneTab()
		.clickFindLeadsButton()
		.clickFirstLead()
		.clickDeleteButton()
		.clickFindLeadsTab()
		.clickNameAndIDTab()
		.enterLeadID()
		.clickFindLeadsButton()
		.checkErrorMessage();
		}
	
	@DataProvider(name="fetchData")
	public String[][] getData() {
		
		String str[][]=new String[2][2];
		str[0][1]="DemoSalesManager";
		str[0][2]="crmsfa";
		return str;
		
	}
	
	
	
	
}