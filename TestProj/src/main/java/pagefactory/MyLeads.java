package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyLeads extends PageAbstract{
	
	public MyLeads() {
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	WebElement findLeadsLink;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Name and ID')]")
	WebElement nameandIdTab;
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	WebElement leadsTBox;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	WebElement findLeadsButton;
	
	
	public FindLeads clickFindLeadsTab() {
		click(findLeadsLink);
		return new FindLeads();
	}
	
	
}
