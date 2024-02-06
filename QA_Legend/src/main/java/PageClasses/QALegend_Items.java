package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class QALegend_Items {
	
	
	WebDriver driver;
	@FindBy(xpath = "//i[@class='fa fa-list-ul']")
	WebElement itemsPageField;
	
	 @FindBy(xpath = "//a[@class='btn btn-default']")
	 WebElement addItemField;
	
	 @FindBy(id = "title")
	 WebElement ItemTitleField;
	 
	 @FindBy(id = "description")
	 WebElement ItemDescriptionField;
	 
	 @FindBy(id = "unit_type")
	 WebElement ItemUnitTypeField;
	 
	 @FindBy(id = "item_rate")
	 WebElement ItemRateField;
	 
	 @FindBy(xpath  = "//button[text()=' Save']")
	 WebElement saveItemField;
	 
	public QALegend_Items(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void onClickItemsPage()
	{
		PageUtility.clickOnElement(itemsPageField);
	}
	
	public void onClickAddItem()
	{
		PageUtility.clickOnElement(addItemField);
	}
	
	public void inputItemTitle(String title) {
		
		PageUtility.enterText(ItemTitleField,title );
		
	}
	
   public void inputItemDescription(String description) {
		
		PageUtility.enterText(ItemDescriptionField,description );
		
	}
   
   public void inputUnitType(String unittype) {
		
		PageUtility.enterText(ItemUnitTypeField,unittype);
		
	}
   
   public void inputItemRate(String rate) {
		
		PageUtility.enterText(ItemRateField,rate);
		
	}
   
   public void onClickSaveAddItem()
	{
	   WaitUtility.waitForAnElementToBeClickable(driver, saveItemField);
		PageUtility.doubleClick(driver, saveItemField);
	}
   
}
