package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLead extends PageAbstract{
	
	public ViewLead() {
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	WebElement deleteBtn;
	
	public MyLeads clickDeleteButton() {
		click(deleteBtn);
		return new MyLeads();
		
	}
	
	
	
	
	
	
	//
	
}
