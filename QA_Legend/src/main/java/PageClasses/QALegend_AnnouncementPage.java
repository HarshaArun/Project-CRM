package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class QALegend_AnnouncementPage {
 
WebDriver driver;
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
	
	public QALegend_AnnouncementPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void onClickAnnouncementButton()
	{
		PageUtility.scrollToBottom(driver);
		PageUtility.clickUsingJavaScript(announcementPageField, driver);
	}
	
	public void onClickEditButton()
	{
		PageUtility.clickOnElement(editButtonField);
	}
	
	
	public void inputEditTitle(String edittitle)
	{
		PageUtility.clearText(editTitleField);
		PageUtility.enterText(editTitleField, edittitle);
	}
	
	public void inputEditText(String edittext)
	{
		PageUtility.clearText(editTextField);
		PageUtility.enterText(editTextField, edittext);
	}
	
	public void onClickSaveEditButton()
	{
		PageUtility.clickUsingJavaScript(saveEditButton, driver);
	}
	
	public void onClickviewButton()
	{
		PageUtility.clickOnElement(viewButtonField);
	}
	
	public void onClickbackToAnnouncements()
	{
		PageUtility.clickOnElement(backToAnnouncements);
	}
}
