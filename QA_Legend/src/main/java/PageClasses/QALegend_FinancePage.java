package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class QALegend_FinancePage {


	WebDriver driver;
	PageUtility page_utility= new PageUtility();
	
	
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
	
	//@FindBy(xpath = "//table//tr//td[text()=\"Training792\"]")
	@FindBy(xpath = "(//tr[@role='row' and @class='odd']//child::td)[3]")
	WebElement titleOfExpense;
	
	@FindBy(xpath = "//h4[text()='Add expense']")
	WebElement addExpenseTitle;
	
	public QALegend_FinancePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void onClickFinancePage()
	 {
		page_utility.clickOnElement(financePageField);
	 }
	
	public void onClickExpensePage()
	 {
		page_utility.clickOnElement(expensePageField);
	 }
	
	public void onClickAddExpensePage()
	 {
		page_utility.clickOnElement(addExpenseField);
		
	 }
	
	public void onClickExpenseCategory()
	 {
		
		page_utility.clickUsingJavaScript(expenseCategoryField, driver);
	 }
	
	public void inputExpenseAmount(String amount)
	 {
		page_utility.enterText(expenseAmountField, amount);
	 }
	
	public void inputExpenseTitle(String title)
	 {
		page_utility.enterText(expenseTitleField, title);
	 }
	
	public void inputExpenseDescription(String description)
	 {
		page_utility.enterText(expensedescriptionField, description);
	 }
	
	public boolean titleOfExpense()
	{
		return titleOfExpense.isDisplayed();
	}
	
	
	
	public void onClickExpenseTax()
	 {
	//	WaitUtility.waitForAnElementToBeClickable(driver, expenseTaxField);
		page_utility.scrollToElement(expenseTaxField, driver);
		page_utility.clickUsingJavaScript(expenseTaxField, driver);
	 }
	
	public void onClickExpenseTaxFromSelect()
	 {
		
	//	 PageUtility.scrollToElement(expenseScrollBar, driver);
		page_utility.clickUsingJavaScript(expenseTaxField, driver);
	 }
	
	public void onClickSaveExpense()
	 {
	//	WaitUtility.waitForAnElementToBeClickable(driver, expenseSaveField);
		page_utility.scrollToElement(expenseSaveField, driver);
		page_utility.clickUsingJavaScript(expenseSaveField, driver);
	 }
	
	public String addExpenseTitle()
	{
		return addExpenseTitle.getText();
	}
}
