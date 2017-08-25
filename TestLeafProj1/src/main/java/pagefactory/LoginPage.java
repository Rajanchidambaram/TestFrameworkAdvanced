package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageAbstract {
	
	
	public LoginPage() {
		PageFactory.initElements(eventDriver, this);
	}
	
	@FindBy(how=How.ID,using="username")
	WebElement eleUserNameTBox;
	
	@FindBy(how=How.ID,using="password")
	WebElement elePassWordTBox;
	
	@FindBy(how=How.XPATH,using="//input[@class='decorativeSubmit']")
	WebElement eleSubmitBtn;
	
	public LoginPage enterUserName() {
		Type(eleUserNameTBox, "DemoSalesManager");
		return this;
		}
	
	public LoginPage enterPassWord() {
		Type(elePassWordTBox, "crmsfa");
		return this;
		}
	
	public HomePage submitForm() {
		click(eleSubmitBtn);
		return new HomePage();
	}
	
	
}
