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
	
	 public QALegend_Messages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
		 
	public void onClickmessagesPage()
	{
		PageUtility.clickUsingJavaScript(messagesPageField, driver);
	}
	
	public void onClickcomposePage()
	{
		PageUtility.clickUsingJavaScript(composePageField, driver);
	}
	
	public void onClickDropDownMessageTo()
	{
		
		WaitUtility.waitForAnElementToBeClickable(driver, dropDownMessageToField);
		PageUtility.clickOnElement(dropDownMessageToField);
	}
	
	public void onClickSelectMessageTo()
	{
		PageUtility.clickOnElement(selectMessageToField);
	}
	
	public void inputSubject(String subject)
	{
		PageUtility.enterText(subjectField, subject);
	}
	
	public void inputWriteMessage(String writemessage)
	{
		PageUtility.enterText(writeMessageField, writemessage);
	}
	
	public void onClickSaveCompose()
	{
		PageUtility.clickOnElement(saveCompose);
	}
}
