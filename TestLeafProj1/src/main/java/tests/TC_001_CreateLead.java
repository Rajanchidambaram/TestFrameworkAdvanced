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
import org.testng.annotations.Test;

import base.*;

public class TC_001_CreateLead extends Annotations{
	
	public static WebElement elem;
	
	@Test
	public void createLead() throws IOException  {
		
		
		click(locateElement("xpath", "//div[@class='crmsfa']"));
		click(locateElement("linkText", "Create Lead"));
		Type(locateElement("id", "createLeadForm_companyName"),"CurrentlyGlobally");
		Type(locateElement("id", "createLeadForm_firstName"),"Sathish");
		Type(locateElement("id", "createLeadForm_lastName"),"Natarajan");
		SelectByVisibleText(locateElement("id", "createLeadForm_dataSourceId"),"Conference");
		SelectByVisibleText(locateElement("id", "createLeadForm_marketingCampaignId"),"Affiliate Sites");
		Type(locateElement("id", "createLeadForm_primaryPhoneNumber"),"1234567890");
		Type(locateElement("id", "createLeadForm_primaryEmail"),"testmail@gmail.com");
		click(locateElement("xpath","//input[@class='smallSubmit']"));
		getText(locateElement("id", "viewLead_companyName_sp"));
	
}
}
