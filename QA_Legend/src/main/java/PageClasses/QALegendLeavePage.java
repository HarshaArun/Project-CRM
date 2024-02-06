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
	
	@FindBy(xpath = "//i[@class='fa fa-sign-out font-16']//parent::a")
	WebElement leavePageField;
	
	@FindBy(xpath = "(//a[@class='btn btn-default'])[1]")
	WebElement applyLeaveField;
	
	@FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
	WebElement applyLeaveTypeField;
	
	@FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
	WebElement inputapplyLeaveTypeField;
	
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
	
	
	public QALegendLeavePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void onClickLeavePage()
	{
		PageUtility.doubleClick(driver, leavePageField);
	}
	
	 
	public void onClickApplyLeavePage()
	{
		PageUtility.clickOnElement(applyLeaveField);
		
	}
	
	public void onClickApplyLeaveType() {
		PageUtility.clickOnElement(applyLeaveTypeField);
	}
	
	public void onClickInputApplyLeaveType() {
		PageUtility.clickOnElement(inputapplyLeaveTypeField);
	}
	
	public void onClickApplyLeaveDuration() {
		WaitUtility.waitForAnElementToBeClickable(driver, applyLeaveDurationField);
		PageUtility.clickOnElement(applyLeaveDurationField);
	}
	
	public void onClickLeaveDurationButton() {
		WaitUtility.waitForAnElementToBeClickable(driver, applyLeaveDurationField);
		PageUtility.clickOnElement(leaveDurationButtonField);
	}
	
	public void inputApplyLeaveDate(String date)
	{
		PageUtility.enterText(applyLeaveDateField, date);
	}
	
	public void inputApplyLeaveReason(String reason)
	{
		PageUtility.enterText(applyLeaveReasonField, reason);
	}
	
	public void onClickSaveApplyLeave() {
	//	WaitUtility.waitForAnElementToBeClickable(driver, applyLeaveDurationField);
		PageUtility.clickOnElement(saveApplyLeaveField);
	}
	
	public void onClickAssignLeavePage()
	{
		PageUtility.clickOnElement(assignLeaveField);
	}
}
