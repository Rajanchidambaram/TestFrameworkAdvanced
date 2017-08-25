package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FindLeads extends PageAbstract {
	
	public static String deleteLeadID;
	
	public FindLeads() {
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Phone')]")
	WebElement phoneTab;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Name and ID')]")
	WebElement nameAndIDTab;
	
	
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	WebElement findLeadsButton;
	
	@FindBy(how=How.XPATH,using="//*[@class='x-grid3-row-table']//a")
	WebElement firstLeadLink;
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	WebElement leadsTBox;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'No records to display')]")
	WebElement errorMsgLbl;
	
	
	public FindLeads clickPhoneTab()
	{
		click(phoneTab);
		return this ;
	}
	
	public FindLeads clickNameAndIDTab() {
		
	click(nameAndIDTab);
	return this;
		
	}
	
	public FindLeads clickFindLeadsButton() {
		click(findLeadsButton);
		return this;
	}
	
	public FindLeads checkErrorMessage() {
		
		verifyText(errorMsgLbl, "No records to display");
		return new FindLeads();
	}
	
	public ViewLead clickFirstLead() {
		
		deleteLeadID=getText(firstLeadLink);
		click(firstLeadLink);
		return new ViewLead();
	}
	
	public FindLeads enterLeadID() {
		
		Type(leadsTBox, deleteLeadID);
		return new FindLeads();
	}
	
}
