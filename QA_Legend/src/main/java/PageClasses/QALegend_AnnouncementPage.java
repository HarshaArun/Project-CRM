package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class QALegend_AnnouncementPage {
 
	WebDriver driver;
	PageUtility page_utility = new PageUtility();

	@FindBy(xpath = "//span[text()='Announcements']")
	WebElement announcementPageField;
	
	@FindBy(xpath = "(//a[@class='edit'])[5]")
	WebElement editButtonField;
	
	@FindBy(id = "title")
	WebElement editTitleField;
	
	@FindBy(xpath = "//div[@class='note-editable panel-body']")
	WebElement editTextField;
	
	@FindBy(xpath = "//input[@value='2024-02-03']")
	WebElement editStartDate;
	
	@FindBy(xpath = "//input[@value='2024-03-08']")
	WebElement editEndDate;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveEditButton;
	
	@FindBy(xpath = "//div[@class='title-button-group']")
	WebElement viewButtonField;
	
	@FindBy(xpath = "//a[text()='Announcements']")
	WebElement backToAnnouncements;
	
	@FindBy(xpath = "(//tr[@role='row'and@class='odd']//child::td)[2]")
	WebElement announcementCreatedByField;
	
	
	public QALegend_AnnouncementPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void onClickAnnouncementButton()
	{
		page_utility.scrollToBottom(driver);
		page_utility.clickUsingJavaScript(announcementPageField, driver);
	}
	
	public void onClickEditButton()
	{
		page_utility.clickOnElement(editButtonField);
	}
	
	
	public void inputEditTitle(String edittitle)
	{
		page_utility.clearText(editTitleField);
		page_utility.enterText(editTitleField, edittitle);
	}
	
	public void inputEditText(String edittext)
	{
		page_utility.clearText(editTextField);
		page_utility.enterText(editTextField, edittext);
	}
	
	public void onClickSaveEditButton()
	{
		page_utility.clickUsingJavaScript(saveEditButton, driver);
	}
	
	public void onClickviewButton()
	{
		page_utility.clickOnElement(viewButtonField);
	}
	
	public void onClickbackToAnnouncements()
	{
		page_utility.clickOnElement(backToAnnouncements);
	}
	
	public boolean announcementCreatedBy()
	{
		return announcementCreatedByField.isDisplayed();
		
	}
}
