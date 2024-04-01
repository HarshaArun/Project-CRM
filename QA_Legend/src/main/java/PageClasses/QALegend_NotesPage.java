package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class QALegend_NotesPage {
	
	
	WebDriver driver;
	PageUtility page_utility= new PageUtility();
	WaitUtility wait_utility= new WaitUtility();
	
	
	@FindBy(xpath = "//i[@class='fa fa-book font-16']")
	WebElement notePageField;

	@FindBy(xpath = "//div[@class='title-button-group']")
	WebElement addnotePageField;
	
	@FindBy(id = "title")
	WebElement titlefield;
	
	@FindBy(id = "description")
	WebElement descriptionfield;
	
	@FindBy(id = "jpdupmtj")
	WebElement addnotescrolldownfield;
	
	@FindBy(xpath =  "(//input[@type='text'])[4]")
	WebElement labelsfield;
	
	@FindBy(xpath = "//div[@class='select2-result-label']")
	WebElement labelsFieldDropDown;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savebuttonfield;
	
	@FindBy(id = "ajaxModalTitle")
	WebElement titleOfAddNote;
	
	
	@FindBy(xpath = "(//tr[@role='row']//child::td)[2]")
	WebElement assertionForTitle;

	public QALegend_NotesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void onClickNotes()
	{
		page_utility.clickOnElement(notePageField);
	}
	
	public void onClickAddNotes() {
		page_utility.clickOnElement(addnotePageField);
	}
	
	
	public void inputAddNotesTitle(String title) {
		// TODO Auto-generated method stub
		page_utility.enterText(titlefield, title);
	}
	
	public void inputAddNotesDescription(String description) {
		// TODO Auto-generated method stub
		page_utility.enterText(descriptionfield, description);
	}
	
//	public void addNoteScrollPage() {
//		PageUtility.scrollToBottom(driver);
//	}
//	
//	public void onClickAddNotesLabels() {
//		
//		
//	PageUtility.clickOnElement(labelsfield);
//		
//	}
	
	public void onClickAddNoteSaveButton()
	{
		page_utility.doubleClick(driver, savebuttonfield);
	}
	
	public String titleOfAddNote()
	{
		return titleOfAddNote.getText();
	}
	
	public boolean assertionForNoteTitle()
	{
		wait_utility.waitForAnElementToBeVisible(driver, assertionForTitle);
		return assertionForTitle.isDisplayed();
	}
}
