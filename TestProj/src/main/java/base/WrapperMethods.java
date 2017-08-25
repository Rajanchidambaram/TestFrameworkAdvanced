package base;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.OverrideListener;

public class WrapperMethods extends OverrideListener implements WrapperInterface{


	WebDriver driver;
	public  WebElement ele;
	public static EventFiringWebDriver eventDriver;

 /**
 * This method finds the element with the various 8 type of locators
 * *@author RajaRajan
 * @param type - The type of locator to be found
 * @param value - The value for the locator
 * @return - Return the webelement once it is found
 */
	public WebElement locateElement(String type,String locatorValue) {

		switch(type)
		{
		case "id":
			ele=eventDriver.findElement(By.id(locatorValue));

			break;

		case "name":
			ele=eventDriver.findElement(By.name(locatorValue));
			break;

		case "className":
			ele=eventDriver.findElement(By.className(locatorValue));
			break;

		case "linkText":
			ele=eventDriver.findElement(By.linkText(locatorValue));
			break;

		case "partialLinkText":
			ele=eventDriver.findElement(By.partialLinkText(locatorValue));
			break;

		case "xpath":

			ele=eventDriver.findElement(By.xpath(locatorValue));
			break;

		case "tagName":
			ele=eventDriver.findElement(By.tagName(locatorValue));
			break;

		case "value":
			ele=eventDriver.findElement(By.xpath("//*[@value='"+locatorValue+"']"));
			
			break;
			
		case "type":
			ele=eventDriver.findElement(By.xpath("//*[@type='"+locatorValue+"']"));
			break;
			
		default:
			System.out.println("No such locator present as per your locator specified");
		
		}
		return ele;
	}

/**
 * @author RajaRajan
 * This method is used to enter text into textboxes
 * @param typeWord - Text input for the textbox
 * @param el - Webelement found using locateElement
 */

	public void Type(WebElement el,String typeWord)	{
		el.sendKeys(typeWord);
	}

	/**
	 * @author RajaRajan
	 * This method is to click an element
	 * @param el - Webelement found using locateElement
	 */
	public void click(WebElement el)	{
		el.click();

	}

	/**
	 * @author RajaRajan
	 * This method is to select a value in dropdown using visible text to the user
	 * @param  - Webelement found using locateElement
	 * @param Text - to select attribute in dropdown with visible text
	 */
	public void SelectByVisibleText(WebElement el,String Text)	{

		Select ele1=new Select(el);
		ele1.selectByVisibleText(Text);

	}

	/**
	 * @author RajaRajan
	 * This method is to select a value in dropdown using index
	 * @param  - Webelement found using locateElement
	 * @param Text - to select attribute in dropdown with index
	 */
	public void SelectByIndex(WebElement el,String index)	{

		Select ele1=new Select(el);
		ele1.selectByVisibleText(index);

	}

	/**
	 * @author RajaRajan
	 * This method is to select a value in dropdown using the attribute value present in select tag
	 * @param  - Webelement found using locateElement
	 * @param Text - to select attribute in dropdown with value
	 */
	public void SelectByValue(WebElement el,String value)	{

		Select ele1=new Select(el);
		ele1.selectByVisibleText(value);
	}

	/**
	 * @author RajaRajan
	 * This method is used to extract the text form the webelement
	 * @param  - Webelement found using locateElement
	 * @return returning the text of the webelement
	 */
	public String getText(WebElement el) {
		String gText=el.getText();
		return gText;
	}

	/**
	 * @author RajaRajan
	 * This method is to verify the expected text is present or not
	 * @param  - Webelement found using locateElement
	 * @param expText- Asserting the text derived from webelement against the expected text
	 */
	public void verifyText(WebElement el,String expText) {
		String actualText=el.getText();
		Assert.assertEquals(expText,actualText,"Exp not matching with actual");
	}

	/**
	 * @author RajaRajan
	 * This method is used to switch to any of first or last or any intermediate window
	 * @param el
	 * @param index - Choose the parent window or last window or any intermediate window by passing the index
	 */
	public void switchToWindow(WebElement el,int index) {

		Set<String> cWindows=eventDriver.getWindowHandles();
		List<String> allWindows=new ArrayList<>();
		allWindows.addAll(cWindows);
		eventDriver.switchTo().window(allWindows.get(index));
		for(String cWindow:cWindows) {
			eventDriver.switchTo().window(cWindow);
		}
	}	

	/**
	 * @author RajaRajan
	 * This method is used to launch the specified browser and initiating the EventFiringWebdriver 
	 * @param URL - Application URL to launch
	 * @param browser - Browser in which application should run
	 */
	public void invokeApp(String URL,String browser) {

		switch(browser)
		{
			case "chrome":
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			eventDriver =new EventFiringWebDriver(driver);
			OverrideListener handler=new OverrideListener();
			eventDriver.register(handler);
			eventDriver.get(URL);
			eventDriver.manage().window().maximize();
			eventDriver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			break;

			default:

		}
	}	

	/**
	 * @author RajaRajan
	 * Clicking accept on alert
	 */
	public void alertAccept() {
		eventDriver.switchTo().alert().accept();
	}

	
	/**
	 * @author RajaRajan
	 * Clicking dismiss on alert
	 */
	public void alertDismiss() {
		eventDriver.switchTo().alert().dismiss();	
	}

	/**
	 * @author RajaRajan
	 * getting text from alert
	 * @return - Return the string obtained from alert
	 */
	public String getAlertText() {
		String str= eventDriver.switchTo().alert().getText();
		return str;
	}

	/**
	 * @author RajaRajan
	 * @param s - Sending text to alert 
	 */
	public void sendTextToAlert(String s) {
		eventDriver.switchTo().alert().sendKeys(s);
	}

	/**
	 * @author RajaRajan
	 * This method is used to verify the title of the page against the expected title
	 * @param expTitle - Title against which the text obtained from page title is asserted
	 */
	public void verifyTitle(String expTitle) {

		String actualText=eventDriver.getTitle();
		Assert.assertEquals(expTitle,actualText,"Exp not matching with actual");
	}

	/**
	 * @author RajaRajan
	 * This method is used to switch to particular frame
	 * @param el - Element of the frame which contains webelement to be used
	 */
	public void switchToFrame(WebElement el) {
		eventDriver.switchTo().frame(el);
	}

	/**
	 * @author RajaRajan
	 * To close the browser
	 */
	public void closeBrowser() {
		eventDriver.quit();
	}
	
	/**
	 * @author RajaRajan
	 * To close the browser
	 */
	public String getAttribute(WebElement elem, String attribute){
		String actualattributevalue=elem.getAttribute(attribute);
		return actualattributevalue;
	}
	/*
	Type
	Click
	SelectByVisibleText
	SelectByIndex
	SelectByValue
	SwitchToWindow
	AlertAccept
	AlertDismiss
	AlertText
	SwitchFrame
	VerifyTitle
	GetAttribute
	GetText
	VerifyText
	TakeSnap
	InvokeApp
	QuitApp*/



}
