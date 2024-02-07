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
	
	@FindBy(xpath = "//span[text()='Time cards']")
	WebElement timeCardPageField;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement addTimeManuallyField;
	
	@FindBy(xpath = "(//span[@class='select2-chosen'])[3]")
	WebElement teamMemberField;
	
	@FindBy(xpath ="(//input[@class='select2-input'])[5]" )
	WebElement searchTeamMember;
	
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
	
	
	public QALegendTimeCardsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		public void onClickTimeCards()
		 {
			 PageUtility.clickOnElement(timeCardPageField);
		 }
		
		public void onClickAddTimeManually()
		 {
			 PageUtility.clickOnElement(addTimeManuallyField);
			
		 }
		public void onClickTeamMember()
		 {
			 PageUtility.clickOnElement(teamMemberField);
			 PageUtility.clearText(teamMemberField);
		 }
		public void onClickSearchTeamMember()
		 {
		//	WaitUtility.waitForAnElementToBeClickable(driver,timeCardsTeamMemberField);
		//	 PageUtility.clickOnElement(timeCardsTeamMemberField);	
			PageUtility.clickUsingJavaScript(searchTeamMember, driver);
			PageUtility.clearText(searchTeamMember);
		 }
		
		public void onClickSelectTeamMember()
		 {
		//	WaitUtility.waitForAnElementToBeClickable(driver,timeCardsTeamMemberField);
			PageUtility.clickUsingJavaScript(selectTeamMember, driver);
			
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
}
