package base;

//import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.UnsupportedCommandException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

public class OverrideListener implements WebDriverEventListener {

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Happened: afterAlertAccept"+arg0);
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Happened: afterAlertDismiss"+arg0);
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("For the webelement "+arg0+" after change is"+arg2);
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("webelement "+arg0+"is clicked");
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("After findBy type:"+arg0+" of webelement "+arg2);
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("The browser is launched with URL "+arg0);
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		System.out.println("Happened: beforeAlertAccept");
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		System.out.println("For the webelement "+arg0+" before change is"+arg2);
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("Before clicking on webElement"+arg0);
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub

		System.out.println("BeforefindBy type:"+arg0+" of webelement "+arg2);
//		str.replaceAll("([^)]*)", "");
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
	
		if(arg0 instanceof NoSuchElementException) {
			System.out.println("Element cannt be located"+arg0.getMessage());
		}
		else if (arg0 instanceof NoSuchWindowException) {
			System.out.println("Windows cannot be identified"+arg0.getMessage());
		}
		else if (arg0 instanceof InvalidSelectorException) {
			System.out.println("Given selector is invalid"+arg0.getMessage());
		}
		else if (arg0 instanceof ElementNotInteractableException)
		{
			System.out.println("Given Element is not interactable"+arg0.getMessage());
		}
		else if (arg0 instanceof ElementNotSelectableException)
		{
			System.out.println("Given Element is not selectable"+arg0.getMessage());
		}
		else if (arg0 instanceof StaleElementReferenceException) 
		{
			System.out.println("Given Element is not attached to the document"+arg0.getMessage());
			
		}
	
		else if(arg0 instanceof UnexpectedTagNameException ) 
		{
			System.out.println("Tag Name is not present in the doc"+arg0.getMessage());
		}
		else if(arg0 instanceof UnhandledAlertException)
		{
			System.out.println("ALert couldnot be handled"+arg0.getMessage());
		}
		else if(arg0 instanceof UnreachableBrowserException)
		{
			System.out.println("Browser is not reachable"+arg0.getMessage());
		}
		else if(arg0 instanceof UnsupportedCommandException)
		{
			System.out.println("The command is not supported"+arg0.getMessage());
		}
		else if(arg0 instanceof InvalidArgumentException) 
		{
			System.out.println("The argument is invalid"+arg0.getMessage());
		}
	}
	
	
	
	
	
	
	
	

}
