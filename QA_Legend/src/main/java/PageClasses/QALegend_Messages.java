package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;
import net.bytebuddy.asm.Advice.This;

public class QALegend_Messages {

	WebDriver driver;
	PageUtility page_utility= new PageUtility();
	WaitUtility wait_utility = new WaitUtility();
	
	@FindBy(xpath ="//span[text()='Messages']")
	 WebElement messagesPageField;
	 
	 @FindBy(xpath = "(//a[@class='list-group-item'])[1]")
	 WebElement composePageField;
	 
	 @FindBy(id = "select2-chosen-3")
	 WebElement dropDownMessageToField;
	
	 @FindBy(xpath = "//div[text()='Harsha Arun']")
	 WebElement selectMessageToField;
	 
	 @FindBy(id = "subject")
	 WebElement subjectField;
	 
	 @FindBy(id = "message")
	 WebElement writeMessageField;
	 
	 @FindBy(xpath = "//button[@type='submit']")
	 WebElement saveCompose;
	 
	 @FindBy(xpath = "//a[text()='Sent items']")
	 WebElement sentItemsField;
	
	 @FindBy(xpath = "(//div[@class='media-body'])[1]")
	 WebElement assertSentMessageField;
	 public QALegend_Messages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
		 
	public void onClickmessagesPage()
	{
		page_utility.clickUsingJavaScript(messagesPageField, driver);
	}
	
	public void onClickcomposePage()
	{
		page_utility.clickUsingJavaScript(composePageField, driver);
	}
	
	public void onClickDropDownMessageTo()
	{
		
		wait_utility.waitForAnElementToBeClickable(driver, dropDownMessageToField);
		page_utility.clickOnElement(dropDownMessageToField);
	}
	
	public void onClickSelectMessageTo()
	{
		page_utility.clickOnElement(selectMessageToField);
	}
	
	public void inputSubject(String subject)
	{
		page_utility.enterText(subjectField, subject);
	}
	
	public void inputWriteMessage(String writemessage)
	{
		page_utility.enterText(writeMessageField, writemessage);
	}
	
	public void onClickSaveCompose()
	{
		page_utility.clickOnElement(saveCompose);
	}
	
	public void onClickSentItems()
	{
		page_utility.clickUsingJavaScript(sentItemsField, driver);
	}
	
	public boolean assertSentMessage()
	{
		return assertSentMessageField.isDisplayed();
	}
}
