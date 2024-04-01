package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import AutomationCore.BaseClass;
import PageClasses.QALegendLeavePage;
import PageClasses.QALegendTimeCardsPage;
import PageClasses.QALegend_FinancePage;
import PageClasses.QALegend_HomePage;
import PageClasses.QALegend_Items;
import PageClasses.QALegend_Loginpage;
import PageClasses.QALegend_Messages;
import PageClasses.QALegend_NotesPage;
import PageClasses.QALegend_ProjectsPage;
import PageClasses.QALegend_TeamMembers;
import PageClasses.QALegend_AnnouncementPage;
import Utilities.ExcelUtilities;
import Utilities.FakerUtility;

public class QALegendTestCases  extends BaseClass{
  public WebDriver driver;
  
  FileInputStream fis;
  Properties prop;
  QALegend_Loginpage loginpage;
  QALegend_HomePage homepage;
  QALegend_NotesPage notespage;
  QALegend_ProjectsPage projectspage;
  QALegendLeavePage leavepage;
  QALegend_Items itemspage;
  QALegendTimeCardsPage timecardspage;
  QALegend_FinancePage financepage;
  QALegend_TeamMembers teammembers;
  QALegend_AnnouncementPage announcementpage;
  QALegend_Messages messagespage;
  ExcelUtilities excel_utility;
  FakerUtility faker_utility;
  
  @BeforeMethod
  @Parameters({"Browser"})
  public void initilization(String browser) throws Exception
  {
	 driver= browserInitilization(browser);
	 fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\testdata.properties");
	 prop=new Properties();
	 prop.load(fis);
	 driver.get(prop.getProperty("url"));
	 loginpage=new QALegend_Loginpage(driver);
	 homepage= new QALegend_HomePage(driver);
	 notespage=new QALegend_NotesPage(driver);
	 projectspage=new QALegend_ProjectsPage(driver);
	 leavepage=new QALegendLeavePage(driver);
	 itemspage= new QALegend_Items(driver);
	 timecardspage= new QALegendTimeCardsPage(driver);
	 financepage= new QALegend_FinancePage(driver);
	 teammembers=new QALegend_TeamMembers(driver);
	 announcementpage=new QALegend_AnnouncementPage(driver);
	 messagespage=new QALegend_Messages(driver);
	 excel_utility= new ExcelUtilities();
	 faker_utility= new FakerUtility();
	   }
  
//  @AfterMethod
//  public void logoutCRM()
//  {
//	  homepage.logOut();
//  }
//  
  @Test (priority = 1)
  public void loginCRM() 
  {
	  loginpage.logInToTheApplication(prop.getProperty("username"), prop.getProperty("password"));
	 
	  String expectuser=homepage.getUserProfileName();
	  String actualuser=prop.getProperty("user_profile_name");
	  System.out.println(expectuser);
	  System.out.println(actualuser);
	//  Assert.assertEquals( homepage.getUserProfileName(), prop.getProperty("user_profile_name"));
	
	 Assert.assertEquals(expectuser , actualuser);
  }
  
//  @Test (priority = 3)
  public void addNotes() throws IOException
  {
	  loginpage.logInToTheApplication(prop.getProperty("username"), prop.getProperty("password"));
	  notespage.onClickNotes();
	  notespage.onClickAddNotes();  
	//  notespage.enterAddNotesTitle(prop.getProperty("addnote_title"));
	//  notespage.enterAddNotesDescription(prop.getProperty("addnote_description"));
	 	String notes_title=excel_utility.getString(1, 0, excelFilePath, "Notes") + faker_utility.randomNumberCreation();
	  	notespage.inputAddNotesTitle(notes_title);	
	  	String notes_description=excel_utility.getString(1, 1, excelFilePath, "Notes");
	  	notespage.inputAddNotesDescription(notes_description);
//	  	notespage.onClickAddNotesLabels();
	  	notespage.onClickAddNoteSaveButton();
	  	Assert.assertEquals(notespage.titleOfAddNote(),prop.getProperty("addnote_pagetitle"));
	  	Assert.assertEquals(notespage.assertionForNoteTitle(), true);
	  
  }
 
  
 //@Test
 public void addProjects() throws IOException
 {
	 loginpage.logInToTheApplication(prop.getProperty("username"), prop.getProperty("password"));
	 projectspage.onClickProjects();
	 projectspage.onClickAllProjects();
	 projectspage.onClickAddProjects();
	 
	 String projects_title=excel_utility.getString(1, 2, excelFilePath, "Notes")+ faker_utility.randomNumberCreation();
	 projectspage.inputProjectTitle(projects_title);
	 
	 String project_description= excel_utility.getString(1, 3, excelFilePath, "Notes");
	 projectspage.inputProjectDescription(project_description);
	 projectspage.inputProjectClient();
	 projectspage.onClickSaveProject();
	 Assert.assertEquals(projectspage.assertionOfTitleProjects(), true);
	 Assert.assertEquals(projectspage.titleOfAllProjects(),prop.getProperty("addprojects_pagetitle"));
	
 }
 
//@Test
public void composeMessage() throws IOException
{
	loginpage.logInToTheApplication(prop.getProperty("username"), prop.getProperty("password"));
	messagespage.onClickmessagesPage();
	messagespage.onClickcomposePage();
	messagespage.onClickDropDownMessageTo();
	messagespage.onClickSelectMessageTo();
	String messages_subject=excel_utility.getString(19, 0, excelFilePath, "Notes")+ faker_utility.randomNumberCreation();
	messagespage.inputSubject(messages_subject);
	String messages_writemessage=excel_utility.getString(19, 1, excelFilePath, "Notes");
	messagespage.inputWriteMessage(messages_writemessage);
	messagespage.onClickSaveCompose();
	messagespage.onClickSentItems();
	Assert.assertEquals(messagespage.assertSentMessage(), true);
	}
 

// @Test
 	public void applyLeave() throws IOException
 	{
 	 loginpage.logInToTheApplication(prop.getProperty("username"), prop.getProperty("password"));
	 leavepage.onClickLeavePage();
	 leavepage.onClickApplyLeavePage();
	 leavepage.onClickdropDownApplyLeave();
	 leavepage.onClickapplyLeaveType();
	 leavepage.onClickApplyLeaveDuration();
	 leavepage.onClickLeaveDurationButton();
	 String leave_date=excel_utility.getDateValue(4, 1, excelFilePath, "Notes");
	 leavepage.inputApplyLeaveDate(leave_date);
	 String leave_reason= excel_utility.getString(4, 0, excelFilePath, "Notes");
	  leavepage.inputApplyLeaveReason(leave_reason);
	 leavepage.onClickSaveApplyLeave();
	 leavepage.onClickLeavePageCount();
	 Assert.assertEquals(leavepage.titleOfApplyLeave(), prop.getProperty("addleave"));
	 Assert.assertEquals(leavepage.AssertLeaveType(),true);
 	}
 	
 	

 
// @Test
 public void addItems() throws IOException
 {
	 loginpage.logInToTheApplication(prop.getProperty("username"), prop.getProperty("password"));
	 itemspage.onClickItemsPage();
	 itemspage.onClickAddItem();
	 String item_title= excel_utility.getString(4, 2, excelFilePath, "Notes") + faker_utility.randomNumberCreation();
	 itemspage.inputItemTitle(item_title);
	 String item_description= excel_utility.getString(4, 3, excelFilePath, "Notes") ;
	 itemspage.inputItemDescription(item_description);
	 String item_unittype= excel_utility.getNumeric(4, 4, excelFilePath, "Notes") ;
	 itemspage.inputUnitType(item_unittype);
	 String item_rate= excel_utility.getNumeric(4, 5, excelFilePath, "Notes") ;
	 itemspage.inputItemRate(item_rate);
	 itemspage.onClickSaveAddItem();
	 Assert.assertEquals(itemspage.titleOfItem(), prop.getProperty("additem_pagetitle"));
	 Assert.assertEquals(itemspage.valueDisplay(), true);
	 
 }
 
 
 @Test
 public void addTimeManually() throws IOException
 {
	 loginpage.logInToTheApplication(prop.getProperty("username"), prop.getProperty("password"));
	 timecardspage.onClickTimeCards();
	 timecardspage.onClickAddTimeManually();
	 timecardspage.onClickDropDownTeamMember();
	 timecardspage.onClickSelectTeamMember();
	 timecardspage.onClickInDate();
	 timecardspage.onClickInCalendar();
	 timecardspage.onClickOutDate();
	 timecardspage.onClickOutCalendar();
//	 timecardspage.onClickSelectOutDate();
	 
	 timecardspage.onClickInTime();
//	 timecardspage.clearInTime();
	 String timecard_intime=excel_utility.getString(16, 0,excelFilePath, "Notes");
	 timecardspage.inputInTime(timecard_intime);
	 timecardspage.onClickOutTime();
	 String timecard_outtime=excel_utility.getString(16, 2,excelFilePath, "Notes");
	 timecardspage.inputOutTime(timecard_outtime);
	 timecardspage.onClickSaveAddTime();
	 timecardspage.onClickclockInOut();
	 Assert.assertEquals(timecardspage.assertTeamMember(), true);
//	 Assert.assertEquals(timecardspage.titleOfAddTimeManually(), prop.getProperty("addtimemanually"));
	 
 }
 
 //@Test
 public void addExpenseInFinance() throws IOException
 {
	 loginpage.logInToTheApplication(prop.getProperty("username"), prop.getProperty("password"));
	 financepage.onClickFinancePage();
	 financepage.onClickExpensePage();
	 financepage.onClickAddExpensePage();
	 Assert.assertEquals(financepage.addExpenseTitle(),prop.getProperty("addexpense_pagetitle"));
	 financepage.onClickExpenseCategory();
	  String finance_amount=excel_utility.getNumeric(13, 2, excelFilePath, "Notes");
	  financepage.inputExpenseAmount(finance_amount);
	  String finance_title=excel_utility.getString(13, 0, excelFilePath, "Notes") + faker_utility.randomNumberCreation();
	  financepage.inputExpenseTitle(finance_title);
	  String finance_description=excel_utility.getString(13, 1, excelFilePath, "Notes");
	  financepage.inputExpenseDescription(finance_description);
//	 financepage.onClickExpenseTax();
//	 financepage.onClickExpenseTaxFromSelect();
	  financepage.onClickSaveExpense();
	  
	  Assert.assertEquals(financepage.titleOfExpense(), true);
 }
 
 //@Test(priority = 2)
 public void addTeamMember() throws IOException
 {
	 loginpage.logInToTheApplication(prop.getProperty("username"), prop.getProperty("password"));
	 teammembers.onClickTeamMembersPage();
	 teammembers.onClickAddMember();
	 String member_firstname= excel_utility.getString(7, 0, excelFilePath, "Notes") ;
	 teammembers.inputMemberFirstName(member_firstname);
	 String member_lastname= excel_utility.getString(7, 1, excelFilePath, "Notes") + faker_utility.randomNumberCreation() ;
	 teammembers.inputMemberLastName(member_lastname);
	 String member_address= excel_utility.getString(7, 2, excelFilePath, "Notes") + faker_utility.randomNumberCreation();
	 teammembers.inputMemberEmailAddress(member_address);
	 String member_phonenumber= excel_utility.getNumeric(7, 3, excelFilePath, "Notes") ;
	 teammembers.inputMemeberPhoneNum(member_phonenumber);
	 teammembers.onClickaddMemberNext();
	 String member_jobtitle= excel_utility.getString(10, 0, excelFilePath, "Notes") ;
	 teammembers.inputMemberJobTitle(member_jobtitle);
	 String member_salary=excel_utility.getNumeric(10, 1, excelFilePath, "Notes") ;
	 teammembers.inputMemberSalary(member_salary);
	 String member_salaryterm= excel_utility.getString(10, 2, excelFilePath, "Notes") ;
	 teammembers.inputmemberSalaryTerm(member_salaryterm);
	 teammembers.onClickaddMemberNextButton();
	 String member_emailid=excel_utility.getString(10, 3, excelFilePath, "Notes") + faker_utility.randomNumberCreation() ;
	 teammembers.inputMemberEmailId(member_emailid);
	 String member_password= excel_utility.getString(10, 4, excelFilePath, "Notes") ;
	 teammembers.inputMemberPassword(member_password);
	 teammembers.onClickSaveMember();
	 Assert.assertEquals(teammembers.titleOfAddMember(), prop.getProperty("addteammember"));
	 Assert.assertEquals(teammembers.assertionOfMemberName(), true);
 }
 
//@Test  
public void editAnnouncement() throws IOException
{
	loginpage.logInToTheApplication(prop.getProperty("username"), prop.getProperty("password"));
	announcementpage.onClickAnnouncementButton();
	announcementpage.onClickEditButton();
	String announcement_title=excel_utility.getString(19, 2, excelFilePath, "Notes")+ faker_utility.randomNumberCreation();
	announcementpage.inputEditTitle(announcement_title);
	String announcement_text=excel_utility.getString(19, 3, excelFilePath, "Notes")+ faker_utility.randomNumberCreation();
	announcementpage.inputEditText(announcement_text);
	announcementpage.onClickSaveEditButton();
	announcementpage.onClickviewButton();
	announcementpage.onClickbackToAnnouncements();
	Assert.assertEquals(announcementpage.announcementCreatedBy(), true);
			
}



}
