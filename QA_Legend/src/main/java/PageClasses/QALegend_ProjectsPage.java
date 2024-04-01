package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class QALegend_ProjectsPage {
	
	WebDriver driver;
	PageUtility page_utility= new PageUtility();
	WaitUtility wait_utility = new WaitUtility();
	
	 @FindBy(xpath = "//span[text()='Projects']")
	 WebElement projectPageField;
	 
	 @FindBy(xpath = "//span[text()='All Projects']")
	 WebElement allProjectPageField;
	 
	 @FindBy(xpath = "//a[@class='btn btn-default']")
	 WebElement addProjectField;
	 
	 @FindBy(id = "title")
	 WebElement projectTitleField;
	 
	 @FindBy(xpath = "(//span[@class='select2-chosen'])[3]")
	 WebElement projectClientField;
	 
	 @FindBy(id = "description")
	 WebElement projectDescriptionField;
	 
	 @FindBy(xpath = "//button[@type='submit']")
	 WebElement projectSaveButtonField;
	 
	 @FindBy(xpath = "(//tr[@role='row']//child::td)[2]")
	 WebElement assertionOfTitleProjects;
	
	 @FindBy(id = "ajaxModalTitle")
	 WebElement titleOfAllProjects;
	 
	public QALegend_ProjectsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void onClickProjects()
	 {
		page_utility.clickOnElement(projectPageField);
	 }
	
	public void onClickAllProjects() {
		page_utility.clickOnElement(allProjectPageField);
	}
	
	public void onClickAddProjects() {
		page_utility.clickOnElement(addProjectField);
	}
	
	public void inputProjectTitle(String title) {
		wait_utility.waitForAnElementToBeVisible(driver, projectTitleField);
		page_utility.enterText(projectTitleField,title );
		
	}
	
	public void inputProjectClient() {
		page_utility.clickOnElement(projectClientField);
	}
	
	public void inputProjectDescription(String description)
	{
		page_utility.enterText(projectDescriptionField, description);
	}
	
		
	public void onClickSaveProject()
	{
		page_utility.doubleClick(driver, projectSaveButtonField);
	}
	
	public boolean assertionOfTitleProjects()
	{
		return  assertionOfTitleProjects.isDisplayed();
		
	}
	
	public String titleOfAllProjects()
	{
		return titleOfAllProjects.getText();
	}
}
