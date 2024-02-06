package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

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
		 PageUtility.clickOnElement(expenseCategoryField);
	 }
}
