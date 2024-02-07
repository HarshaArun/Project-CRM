package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.PageUtility;

public class QALegend_TicketsPage {
 
	public QALegend_TicketsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	WebDriver driver;
	
	@FindBy(xpath = "//i[@class='fa fa-life-ring']//parent::a")
	WebElement ticketsPageField;
	
	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle  mt0 mb0']")
	WebElement editTicketIconField;
	
	@FindBy(xpath = "(//a[@title='Edit'])[1]")
	WebElement editTicketButtonField;
	
	@FindBy(id = "title")
	WebElement editTitleField;
	
	@FindBy(id = "select2-chosen-14")
	WebElement editTicketTypeField;
	
	@FindBy(id = "select2-chosen-16")
	WebElement assignToField;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveEditField;
	
	
	public void onClickTicketsPage()
	{
		PageUtility.clickUsingJavaScript(ticketsPageField, driver);
	}
	
	public void onClickEditTicketIcon()
	{
		PageUtility.clickOnElement(editTicketIconField);
	}
	
	public void onClickEditTicketButton()
	{
		PageUtility.clickOnElement(editTicketButtonField);
	}
	
	public void inputeditTitle(String title)
	{
		PageUtility.enterText(editTitleField, title);
	}
	
	public void inputeditTicketType(String tickettype)
	{
		PageUtility.enterText(editTicketTypeField, tickettype);
	}
	
	public void onClickassignToField()
	{
		PageUtility.clickOnElement(assignToField);
	}
	
	public void onClickSaveTicket()
	{
		PageUtility.clickOnElement(assignToField);
	}
}
