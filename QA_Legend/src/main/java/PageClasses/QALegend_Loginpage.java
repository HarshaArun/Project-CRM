package PageClasses;

import javax.swing.plaf.basic.BasicPasswordFieldUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class QALegend_Loginpage {

	
	WebDriver driver;
	
	@FindBy(id = "email")
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


	public void enterUserName(String username)
	{
		PageUtility.enterText(usernamefield, username);
	}
	
	
	public void enterPassword(String password)
	{
		PageUtility.enterText(passwordfield, password);
	}
	
	public void onClickLogin()
	{
		PageUtility.clickOnElement(loginfield);
	}
	
}
