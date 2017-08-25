package tests;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.*;

public class TC_002_EditLead extends Annotations{
	
	public static WebElement elem;
	
	@Test
	public void editLead() throws IOException  {
		
		
		Type(locateElement( "id", "username"),"DemoSalesManager");
		
		Type(locateElement( "id", "password"),"crmsfa");
		
		click(locateElement( "xpath", "//input[@class='decorativeSubmit']"));
		
		click(locateElement( "linktext", "CRM/SFA"));
		click(locateElement( "xpath", "//a[text()='Leads']"));
		click(locateElement( "linktext", "Find Leads"));
		Type(locateElement( "xpath", "(//label[text()='First name:'])[3]//following::input[1]"),"lakshmi");
		click(locateElement( "xpath", "//button[text()='Find Leads']"));
		click(locateElement( "xpath", "(//div[@class='x-grid3-body']//tr//td[1]//a)[1]"));
		verifyTitle("View Lead | opentaps CRM");
		click(locateElement( "xpath", "//a[text()='Edit']"));
		String r=RandomStringUtils.randomAlphabetic(8);
		Type(locateElement( "xpath", "(//span[text()='Company Name']//following::input)[1]"),r);
		String companynameupdate=getAttribute(locateElement( "xpath", "(//span[text()='Company Name']//following::input)[1]"), "value");
		click(locateElement( "xpath", "(//span[text()='Important Note']//following::input[@class='smallSubmit'])[1]"));
		String updatedname=getText(locateElement( "id", "viewLead_companyName_sp"));
		String only_int=updatedname.replaceAll("[0-9( )]", "");
		if(companynameupdate.equals(only_int)){
			System.out.println("updated value is reflected");
		}
	
}
}
