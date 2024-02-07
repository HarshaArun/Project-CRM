package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class QALegend_NotesPage {
	
	
	WebDriver driver;
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

	public QALegend_NotesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	public void onClickNotes()
	{
		PageUtility.clickOnElement(notePageField);
	}
	
	public void onClickAddNotes() {
		PageUtility.clickOnElement(addnotePageField);
	}
	
	
	public void inputAddNotesTitle(String title) {
		// TODO Auto-generated method stub
		PageUtility.enterText(titlefield, title);
	}
	
	public void inputAddNotesDescription(String description) {
		// TODO Auto-generated method stub
		PageUtility.enterText(descriptionfield, description);
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
		PageUtility.doubleClick(driver, savebuttonfield);
	}
	
	public String titleOfAddNote()
	{
		return titleOfAddNote.getText();
	}
}
