package PageClasses;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class QALegendLeavePage {
	
	
	WebDriver driver;
	PageUtility page_utility= new PageUtility();
	WaitUtility wait_utility = new WaitUtility();
	
	@FindBy(xpath = "//i[@class='fa fa-sign-out font-16']//parent::a")
	WebElement leavePageField;
	
	@FindBy(xpath = "(//a[@class='btn btn-default'])[1]")
	WebElement applyLeaveField;
	
	@FindBy(id = "s2id_leave_type_id")
	WebElement dropDownApplyLeave;
	
	@FindBy(xpath  = "//div[text()='Casual Leave ']")
	WebElement applyLeaveType;
	
	@FindBy(xpath = "(//div[@class='col-md-9'])[2]")
	WebElement applyLeaveDurationField;
	
	@FindBy(id = "duration_single_day")
	WebElement leaveDurationButtonField;
	
	@FindBy(id = "single_date")
	WebElement applyLeaveDateField;
	
	@FindBy(id = "reason")
	WebElement applyLeaveReasonField;
	
	@FindBy(xpath = "(//a[@class='btn btn-default'])[2]")
	WebElement assignLeaveField;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement saveApplyLeaveField;
	
	@FindBy(id = "ajaxModalTitle")
	WebElement titleOfApplyLeave;
	
	@FindBy(xpath = "//a[text()='18']")
	WebElement leavePageCountField;
	
	@FindBy(xpath = "(//tr[@role='row' and @class='odd']//child::td)[14]")
	WebElement AssertLeaveTypeField;
	
	
	public QALegendLeavePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public void onClickLeavePage()
	{
		page_utility.doubleClick(driver, leavePageField);
	}
	
	 
	public void onClickApplyLeavePage()
	{
		page_utility.clickOnElement(applyLeaveField);
		
	}
	
	public void onClickdropDownApplyLeave()
	{
		page_utility.clickOnElement(dropDownApplyLeave);
	}
	
	public void onClickapplyLeaveType()
	{
		page_utility.clickOnElement(applyLeaveType);
	}
	
	public void onClickApplyLeaveDuration() {
		wait_utility.waitForAnElementToBeClickable(driver, applyLeaveDurationField);
		page_utility.clickOnElement(applyLeaveDurationField);
	}
	
	public void onClickLeaveDurationButton() {
		wait_utility.waitForAnElementToBeClickable(driver, applyLeaveDurationField);
		page_utility.clickOnElement(leaveDurationButtonField);
	}
	
	public void inputApplyLeaveDate(String date)
	{
		page_utility.enterText(applyLeaveDateField, date);
	}
	
	public void inputApplyLeaveReason(String reason)
	{
		page_utility.enterText(applyLeaveReasonField, reason);
	}
	
	public void onClickSaveApplyLeave() {
	//	WaitUtility.waitForAnElementToBeClickable(driver, applyLeaveDurationField);
		page_utility.clickOnElement(saveApplyLeaveField);
	}
	
	public void onClickAssignLeavePage()
	{
		page_utility.clickOnElement(assignLeaveField);
	}
	
	public String titleOfApplyLeave()
	{
		return titleOfApplyLeave.getText();
	}
	
	public void onClickLeavePageCount()
	{
		page_utility.clickUsingJavaScript(leavePageCountField, driver);
	}
	
	public boolean AssertLeaveType()
	{
		return AssertLeaveTypeField.isDisplayed();
	}
}
