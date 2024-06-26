package PageClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.PageUtility;
import Utilities.WaitUtility;
import net.bytebuddy.asm.Advice.This;

public class QALegend_HomePage {

	

	WebDriver driver;
	PageUtility page_utility = new PageUtility();
	WaitUtility wait_utility = new WaitUtility();
	
	@FindBy(xpath =  "//span[@class='topbar-user-name']")
	WebElement userprofilename;
	
	
	
	@FindBy(xpath = "//a[text()=' Sign Out']")
	WebElement signoutuser;
	
	
	
	public QALegend_HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logOut() {
		
		page_utility.clickOnElement(userprofilename);
		page_utility.clickOnElement(signoutuser);
	}
	

	public String getUserProfileName() {
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
//		wait.until(ExpectedConditions.visibilityOf(userprofilename));
		
		wait_utility.waitForAnElementToBeClickable(driver, userprofilename);
		String userName=page_utility.getTextFromElement(userprofilename);
		return userName;
	}
}
