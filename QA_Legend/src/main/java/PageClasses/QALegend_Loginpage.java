package PageClasses;

import javax.swing.plaf.basic.BasicPasswordFieldUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class QALegend_Loginpage {

	
	WebDriver driver;
	PageUtility page_utility= new PageUtility();
	
	@FindBy(id   ="email")
	WebElement usernamefield;
	
	@FindBy(id = "password")
	WebElement passwordfield;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement loginfield;
	
	
	
	public QALegend_Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void logInToTheApplication(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		 onClickLogin();
	}
	public void enterUserName(String username)
	{
		page_utility.enterText(usernamefield, username);
	}
	
	
	public void enterPassword(String password)
	{
		page_utility.enterText(passwordfield, password);
	}
	
	public void onClickLogin()
	{
		page_utility.clickOnElement(loginfield);
	}
	
}
