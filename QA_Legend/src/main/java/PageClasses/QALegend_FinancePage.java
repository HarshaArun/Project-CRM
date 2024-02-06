package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class QALegend_FinancePage {


	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Finance']")
	WebElement financePageField;
	
	@FindBy(xpath = "//span[text()='Expenses']")
	WebElement expensePageField;
	
	@FindBy(xpath = "//a[@class='btn btn-default mb0']")
	WebElement addExpenseField;
	
	@FindBy(id = "select2-results-9")
	WebElement expenseCategoryField;
	
	@FindBy(id="amount")
	WebElement expenseAmountField;
	
	@FindBy(id="title")
	WebElement expenseTitleField;
	
	@FindBy(id="description")
	WebElement expensedescriptionField;
	
	@FindBy(xpath = "(//div[@class='ps__thumb-y'])[3]")
	WebElement expenseScrollBar;
	
	@FindBy(xpath = "//span[text()='Tax (10%) ']")
	WebElement expenseTaxField;
	
	@FindBy(xpath = "(//div[@class='select2-result-label'])[2]")
	WebElement expenseTaxSelectField;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement expenseSaveField;
	
	
	public QALegend_FinancePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void onClickFinancePage()
	 {
		 PageUtility.clickOnElement(financePageField);
	 }
	
	public void onClickExpensePage()
	 {
		 PageUtility.clickOnElement(expensePageField);
	 }
	
	public void onClickAddExpensePage()
	 {
		 PageUtility.clickOnElement(addExpenseField);
		
	 }
	
	public void onClickExpenseCategory()
	 {
		
		 PageUtility.clickUsingJavaScript(expenseCategoryField, driver);
	 }
	
	public void inputExpenseAmount(String amount)
	 {
		 PageUtility.enterText(expenseAmountField, amount);
	 }
	
	public void inputExpenseTitle(String title)
	 {
		 PageUtility.enterText(expenseTitleField, title);
	 }
	
	public void inputExpenseDescription(String description)
	 {
		 PageUtility.enterText(expensedescriptionField, description);
	 }
	
	
	
	
	public void onClickExpenseTax()
	 {
	//	WaitUtility.waitForAnElementToBeClickable(driver, expenseTaxField);
		 PageUtility.scrollToElement(expenseTaxField, driver);
		 PageUtility.clickUsingJavaScript(expenseTaxField, driver);
	 }
	
	public void onClickExpenseTaxFromSelect()
	 {
		
	//	 PageUtility.scrollToElement(expenseScrollBar, driver);
		 PageUtility.clickUsingJavaScript(expenseTaxField, driver);
	 }
	
	public void onClickSaveExpense()
	 {
	//	WaitUtility.waitForAnElementToBeClickable(driver, expenseSaveField);
		 PageUtility.scrollToElement(expenseSaveField, driver);
		 PageUtility.clickUsingJavaScript(expenseSaveField, driver);
	 }
}
