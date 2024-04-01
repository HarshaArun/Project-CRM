package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class QALegend_Items {
	
	
	WebDriver driver;
	PageUtility page_utility= new PageUtility();
	WaitUtility wait_utility = new WaitUtility();
	
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
	 
//	 @FindBy(xpath = "//tbody//tr//td[@class=' w20p' and text()='Samsung7033']")
	 @FindBy(xpath = "(//tr[@role='row']//child::td)[1]")         
	 WebElement displaySavedItem;
	 
	 @FindBy(id = "ajaxModalTitle")
	 WebElement titleOfItem;
	 
	 
	public QALegend_Items(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void onClickItemsPage()
	{
		page_utility.clickOnElement(itemsPageField);
	}
	
	public void onClickAddItem()
	{
		page_utility.clickOnElement(addItemField);
	}
	
	public void inputItemTitle(String title) {
		
		page_utility.enterText(ItemTitleField,title );
		
	}
	
   public void inputItemDescription(String description) {
		
	   page_utility.enterText(ItemDescriptionField,description );
		
	}
   
   public void inputUnitType(String unittype) {
		
	   page_utility.enterText(ItemUnitTypeField,unittype);
		
	}
   
   public void inputItemRate(String rate) {
		
	   page_utility.enterText(ItemRateField,rate);
		
	}
   
   public boolean valueDisplay()
   {
	   return displaySavedItem.isDisplayed();
   }
   
   public void onClickSaveAddItem()
	{
	   wait_utility.waitForAnElementToBeClickable(driver, saveItemField);
	   page_utility.doubleClick(driver, saveItemField);
	}
   
   public String titleOfItem()
   {
	   return titleOfItem.getText();
   }
   
}
