package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageAbstract{
	
	public HomePage() {
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	WebElement crmsfaLink;
	
	
	public LeadsPage clickCrmsfaLink() {
		
		click(crmsfaLink);
		return new LeadsPage();
	}
}
