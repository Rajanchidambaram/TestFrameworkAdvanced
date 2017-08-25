package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage extends PageAbstract{
	
	public LeadsPage() {
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Leads']")
	WebElement leadsTabLink;
	
	public MyLeads clickLeadsLink() {
		
		click(leadsTabLink);
		return new MyLeads();
	}
}
