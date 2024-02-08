package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;
import Utilities.WaitUtility;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class QALegend_TeamMembers {

	
	WebDriver driver;
	@FindBy(xpath = "//span[text()='Team members']")
	WebElement teamMembersPageField;
	
	@FindBy(xpath = "(//a[@class='btn btn-default'])[2]")
	WebElement addMemberField;
	
	@FindBy(id = "first_name")
	WebElement memberFirstNameField;
	
	@FindBy(id = "last_name")
	WebElement memberLastNameField;
	
	@FindBy(id="address")
	WebElement memberEmailAddressField;
	
	@FindBy(id="phone")
	WebElement memberPhoneNumField;
	
	@FindBy(xpath = "(//div[@class=' col-md-9'])[5]")
	WebElement memberGenderField;
	
	@FindBy(id = "form-next")
	WebElement addMemeberNextField;
	
	@FindBy(id = "job_title")
	WebElement memberJobTitleField;
	
	@FindBy(id = "salary")
	WebElement memberSalaryField;
	
	@FindBy(id = "salary_term")
	WebElement memberSalaryTermField;
	
	@FindBy(id = "date_of_hire")
	WebElement memberDateOfHireField;
	
	@FindBy(xpath = "//button[@class='btn btn-info']")
	WebElement addMemberNextButtonField;
	
	@FindBy(id = "email")
	WebElement memberEmailField;
	
	@FindBy(id = "password")
	WebElement memberPasswordField;
	
	@FindBy(id = "form-submit")
	WebElement saveMemberField;
	
	@FindBy(id = "ajaxModalTitle")
	WebElement titleOfAddMember;
	
	@FindBy(xpath = "//table//tbody//tr//td//a[text()='Harsha Arun ']")
	WebElement assertionOfMemberName;
	
	public QALegend_TeamMembers(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void onClickTeamMembersPage()
	 {
		 PageUtility.clickUsingJavaScript(teamMembersPageField, driver);
	 }
	
	public void onClickAddMember()
	 {
		 PageUtility.clickUsingJavaScript(addMemberField, driver);
	 }
	
	public void inputMemberFirstName(String firstname)
	 {
		 PageUtility.enterText(memberFirstNameField,  firstname);
	 }
	
	public void inputMemberLastName(String lastname)
	 {
		 PageUtility.enterText(memberLastNameField, lastname);
	 }
	
	public void inputMemberEmailAddress(String emailaddress)
	 {
		 PageUtility.enterText(memberEmailAddressField, emailaddress);
	 }
	
	public void inputMemeberPhoneNum(String phoneNum)
	 {
		 PageUtility.enterText(memberPhoneNumField, phoneNum);
	 }
	
	public void onClickaddMemberNext()
	 {
		 WaitUtility.waitForAnElementToBeClickable(driver, addMemeberNextField);
		 PageUtility.clickUsingJavaScript(addMemeberNextField, driver);
	 }
	
	public void inputMemberJobTitle(String jobtitle)
	 {
		WaitUtility.waitForAnElementToBeVisible(driver, memberJobTitleField);
		// PageUtility.enterText(memberJobTitleField, jobtitle);
		 PageUtility.enterTextUsingActions(driver, memberJobTitleField, jobtitle);
		 
	 }
	
	public void inputMemberSalary(String salary)
	 {
		 PageUtility.enterText(memberSalaryField, salary);
	 }
	
	public void inputmemberSalaryTerm(String salaryterm)
	 {
		 PageUtility.enterText(memberSalaryTermField, salaryterm);
	 }
	
	public void onClickaddMemberNextButton()
	 {
		 WaitUtility.waitForAnElementToBeClickable(driver, addMemberNextButtonField);
		 PageUtility.clickUsingJavaScript(addMemberNextButtonField, driver);
	 }
	
	public void inputMemberEmailId(String emailid)
	 {
		 PageUtility.enterText(memberEmailField, emailid);
	 }
	
	public void inputMemberPassword(String password)
	 {
		 PageUtility.enterText(memberPasswordField, password);
	 }
	
	public void onClickSaveMember()
	 {
		
		 PageUtility.clickUsingJavaScript(saveMemberField, driver);
	 }
	
	public String titleOfAddMember()
	{
		return titleOfAddMember.getText();
	}
	
	public boolean assertionOfMemberName()
	{
		return assertionOfMemberName.isDisplayed();
	}
	
}
