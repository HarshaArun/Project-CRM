package PageClasses;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class QALegendTimeCardsPage {

	

	WebDriver driver;
	PageUtility page_utility= new PageUtility();
	WaitUtility wait_utility = new WaitUtility();
	
	@FindBy(xpath = "//i[@class='fa fa-clock-o font-16']")
	WebElement timeCardPageField;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement addTimeManuallyField;
	
	@FindBy(id="s2id_attendance_user_id")
	WebElement dropDownteamMember;
	
	@FindBy(xpath = "//div[text()='Harsha Arun ']")
	WebElement selectTeamMember;
	
	@FindBy(id = "in_date")
	WebElement inDateField;
	
	@FindBy(xpath = "//div[@class='datepicker-days']")
	WebElement inCalendarField;
	
	@FindBy(id="out_date")
	WebElement outDateField;
	
	@FindBy(xpath = "//div[@class='datepicker-days']")
	WebElement outCalendarField;
	
	@FindBy(xpath = "(//td[@class='day'])[16]")
	WebElement selectOutDateField;
	
	@FindBy(id = "in_time")
	WebElement inTimeField;
	
	@FindBy(id="out_time")
	WebElement outTimeField;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveAddTimeField;
	
	@FindBy(xpath = "ajaxModalTitle")
	WebElement titleOfAddTimeManually;
	
	@FindBy(xpath = "//a[text()='Clock In / Out']")
//	@FindBy(xpath = "//a[text()='Clock In / Out']//parent::li")
	WebElement clockInOutField;
	
	@FindBy(xpath = "(//tr[@role=\"row\"and@class='even']//child::td)[1]")
	WebElement  assertTeamMemberField;
	
	public QALegendTimeCardsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		public void onClickTimeCards()
		 {
			page_utility.scrollToBottom(driver);
			page_utility.clickUsingJavaScript(timeCardPageField, driver);
		 }
		
		public void onClickAddTimeManually()
		 {
			page_utility.clickOnElement(addTimeManuallyField);
			
		 }
		public void onClickDropDownTeamMember()
		 {
			page_utility.clickOnElement(dropDownteamMember);
			 
		 }
		public void onClickSelectTeamMember()
		 {
			wait_utility.waitForAnElementToBeClickable(driver,selectTeamMember);
			page_utility.clickOnElement(selectTeamMember);	
			
		 }
		
		
		
		public void onClickInDate()
		 {
			page_utility.clickOnElement(inDateField);
			 
		 }
		
		public void onClickInCalendar()
		 {
			page_utility.clickOnElement(inCalendarField);
			 
		 }
		
		public void onClickOutDate()
		 {
			page_utility.clickOnElement(outDateField);
			 
		 }
		
		public void onClickOutCalendar()
		 {
			page_utility.clickOnElement(outCalendarField);
			 
		 }
		
		public void onClickSelectOutDate()
		 {
			page_utility.clickOnElement(selectOutDateField);
			 
		 }
		
		public void inputOutDate(String outdate)
		 {
			page_utility.clearText(outDateField);
			page_utility.enterText(outDateField, outdate);
			 
		 }
		
		public void onClickInTime()
		 {
			page_utility.clickUsingJavaScript(inTimeField, driver);
			 
		 }
		
//		public void clearInTime()
//		{
//			PageUtility.clearText(inTimeField);	
//		}
		
		public void inputInTime(String intime)
		 {
			page_utility.clearText(inTimeField);
			page_utility.enterText(inTimeField, intime);
			 
		 }
		
		public void onClickOutTime()
		 {
			page_utility.clickUsingJavaScript(outTimeField, driver);
			 
		 }
		
		public void inputOutTime(String outtime)
		 {
			page_utility.clearText(outTimeField);
			page_utility.enterText(outTimeField, outtime);
			 
		 }
		
		public void onClickSaveAddTime()
		 {
			page_utility.clickUsingJavaScript(saveAddTimeField, driver);
			 
		 }
		
		public void onClickclockInOut()
		{
			page_utility.clickUsingJavaScript(clockInOutField, driver);
		}
		
		public boolean assertTeamMember()
	   {
			return assertTeamMemberField.isDisplayed();
		}
}
