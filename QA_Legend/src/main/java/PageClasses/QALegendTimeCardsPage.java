package PageClasses;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class QALegendTimeCardsPage {

	

	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Time cards']")
	WebElement timeCardPageField;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement addTimeManuallyField;
	
	@FindBy(xpath = "(//div[@class='select2-search'])[7]")
	WebElement timeCardsTeamMemberField;
	
	@FindBy(xpath = "(//span[text()='Saumia Alex '])")
	WebElement timeCardsMemberField;
	
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
		
		public void onClickTimeCardsTeamMember()
		 {
			 PageUtility.clickOnElement(timeCardsTeamMemberField);
		 }
		
		public void onClickTimeCardsMember()
		 {
			 PageUtility.clickOnElement(timeCardsMemberField);
		 }
}
