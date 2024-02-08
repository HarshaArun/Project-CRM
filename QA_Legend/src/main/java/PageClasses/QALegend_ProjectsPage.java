package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;

public class QALegend_ProjectsPage {
	
	WebDriver driver;
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
	 
	 @FindBy(xpath = "//table//tbody//tr//td//a[text()='Qalegend_selenium9692']")
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
		 PageUtility.clickOnElement(projectPageField);
	 }
	
	public void onClickAllProjects() {
		PageUtility.clickOnElement(allProjectPageField);
	}
	
	public void onClickAddProjects() {
		PageUtility.clickOnElement(addProjectField);
	}
	
	public void inputProjectTitle(String title) {
		WaitUtility.waitForAnElementToBeVisible(driver, projectTitleField);
		PageUtility.enterText(projectTitleField,title );
		
	}
	
	public void inputProjectClient() {
		PageUtility.clickOnElement(projectClientField);
	}
	
	public void inputProjectDescription(String description)
	{
		PageUtility.enterText(projectDescriptionField, description);
	}
	
		
	public void onClickSaveProject()
	{
		PageUtility.doubleClick(driver, projectSaveButtonField);
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
