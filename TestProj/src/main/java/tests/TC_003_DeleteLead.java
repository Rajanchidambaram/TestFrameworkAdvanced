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

public class TC_003_DeleteLead extends Annotations{
	
	public static WebElement elem;
	
	@Test
	public void deleteLead() throws IOException {
		
		Type(locateElement("id","username"),"DemoSalesManager");
		Type(locateElement("id","password"), "crmsfa");
		click(locateElement("className","decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
		click(locateElement("linkText","Leads"));
		click(locateElement("linkText","Find Leads"));
		click(locateElement("xpath","//span[contains(text(),'Phone')]"));
		click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));
		String s=getText(locateElement("xpath","//*[@class='x-grid3-row-table']//a"));
		click(locateElement("xpath","//*[@class='x-grid3-row-table']//a"));
		click(locateElement("linkText","Delete"));
		click(locateElement("linkText","Find Leads"));
		click(locateElement("xpath","//span[contains(text(),'Name and ID')]"));
		Type(locateElement("xpath", "//input[@name='id']"),s);
		click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));
		verifyText(locateElement("xpath", "//div[contains(text(),'No records to display')]"), "No records to display");
		
		
}
}
