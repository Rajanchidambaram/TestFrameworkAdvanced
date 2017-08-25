package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public interface WrapperInterface {
	
	public WebElement locateElement(String type,String value);
	public void Type(WebElement el,String typeWord)	;
	public void click(WebElement el)	;
	public void SelectByVisibleText(WebElement el,String Text);
	public void SelectByIndex(WebElement el,String index)	;
	public void SelectByValue(WebElement el,String value)	;
	public String getText(WebElement el);
	public void verifyText(WebElement el,String expText); 
	public void switchToWindow(WebElement el,int index);
	public void invokeApp(String URL,String browser);
	public void alertAccept() ;
	public void alertDismiss() ;
	public String getAlertText(); 
	public void sendTextToAlert(String s); 
	public void verifyTitle(String expTitle); 
	public void switchToFrame(WebElement el);
	public void closeBrowser();
	
}
