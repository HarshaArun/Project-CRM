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
	
	public QALegendTimeCardsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		public void onClickTimeCards()
		 {
			 PageUtility.scrollToBottom(driver);
			 PageUtility.clickUsingJavaScript(timeCardPageField, driver);
		 }
		
		public void onClickAddTimeManually()
		 {
			 PageUtility.clickOnElement(addTimeManuallyField);
			
		 }
		public void onClickDropDownTeamMember()
		 {
			 PageUtility.clickOnElement(dropDownteamMember);
			 
		 }
		public void onClickSelectTeamMember()
		 {
			WaitUtility.waitForAnElementToBeClickable(driver,selectTeamMember);
		    PageUtility.clickOnElement(selectTeamMember);	
			
		 }
		
		
		
		public void onClickInDate()
		 {
			 PageUtility.clickOnElement(inDateField);
			 
		 }
		
		public void onClickInCalendar()
		 {
			 PageUtility.clickOnElement(inCalendarField);
			 
		 }
		
		public void onClickOutDate()
		 {
			 PageUtility.clickOnElement(outDateField);
			 
		 }
		
		public void onClickOutCalendar()
		 {
			 PageUtility.clickOnElement(outCalendarField);
			 
		 }
		
		public void onClickSelectOutDate()
		 {
			 PageUtility.clickOnElement(selectOutDateField);
			 
		 }
		
		public void inputOutDate(String outdate)
		 {
			PageUtility.clearText(outDateField);
			 PageUtility.enterText(outDateField, outdate);
			 
		 }
		
		public void onClickInTime()
		 {
			 PageUtility.clickUsingJavaScript(inTimeField, driver);
			 
		 }
		
//		public void clearInTime()
//		{
//			PageUtility.clearText(inTimeField);	
//		}
		
		public void inputInTime(String intime)
		 {
			PageUtility.clearText(inTimeField);
			 PageUtility.enterText(inTimeField, intime);
			 
		 }
		
		public void onClickOutTime()
		 {
			 PageUtility.clickUsingJavaScript(outTimeField, driver);
			 
		 }
		
		public void inputOutTime(String outtime)
		 {
			PageUtility.clearText(outTimeField);
			 PageUtility.enterText(outTimeField, outtime);
			 
		 }
		
		public void onClickSaveAddTime()
		 {
			 PageUtility.clickUsingJavaScript(saveAddTimeField, driver);
			 
		 }
		
//		public String titleOfAddTimeManually()
//		{
//			return titleOfAddTimeManually.getText();
//		}
}
