package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

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
import PageClasses.QALegend_NotesPage;
import PageClasses.QALegend_ProjectsPage;
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
 
  
  @BeforeMethod
  @Parameters({"Browser"})
  public void initilization(String browser) throws Exception
  {
	 driver= browserInitilization(browser);
	 fis=new FileInputStream("C:\\Users\\Arun\\eclipse-workspace\\QA_Legend\\src\\main\\java\\TestData\\testdata.properties");
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
	 
	 loginpage.enterUserName(prop.getProperty("username"));
	  loginpage.enterPassword(prop.getProperty("password"));
	  loginpage.onClickLogin();
	  
	   }
  
//  @AfterMethod
//  public void logoutCRM()
//  {
//	  homepage.logOut();
//  }
//  
  @Test
  public void loginCRM()
  {
	  homepage.logOut();
	  loginpage.enterUserName(prop.getProperty("username"));
	  loginpage.enterPassword(prop.getProperty("password"));
	  loginpage.onClickLogin();
	  String expectuser=homepage.getUserProfileName();
	  String actualuser=prop.getProperty("user_profile_name");
	  System.out.println(expectuser);
	  System.out.println(actualuser);
	//  Assert.assertEquals( homepage.getUserProfileName(), prop.getProperty("user_profile_name"));
	
	 Assert.assertEquals(expectuser , actualuser);
  }
  
//  @Test
  public void addNotes() throws IOException
  {
	  notespage.onClickNotes();
	  notespage.onClickAddNotes();
	  
	//  notespage.enterAddNotesTitle(prop.getProperty("addnote_title"));
	//  notespage.enterAddNotesDescription(prop.getProperty("addnote_description"));
	
	  
	  	String notes_title=ExcelUtilities.getString(1, 0, excelFilePath, "Notes") +FakerUtility.randomNumberCreation();
	  	notespage.inputAddNotesTitle(notes_title);
	
	  	String notes_description=ExcelUtilities.getString(1, 1, excelFilePath, "Notes");
	  	notespage.inputAddNotesDescription(notes_description);
	  	
//	  	notespage.addNoteScrollPage();
//	  	notespage.onClickAddNotesLabels();
	  	notespage.onClickAddNoteSaveButton();
	  
  }
 
  
// @Test
 public void addProjects() throws IOException
 {
	 projectspage.onClickProjects();
	 projectspage.onClickAllProjects();
	 projectspage.onClickAddProjects();
	 
	 String projects_title=ExcelUtilities.getString(1, 2, excelFilePath, "Notes")+FakerUtility.randomNumberCreation();
	 projectspage.inputProjectTitle(projects_title);
	 
	 String project_description= ExcelUtilities.getString(1, 3, excelFilePath, "Notes");
	 projectspage.inputProjectDescription(project_description);
	 projectspage.inputProjectClient();
	 projectspage.onClickSaveProject();
	 
	
 }
 
// @Test
 	public void applyLeave() throws IOException
 	{
	 leavepage.onClickLeavePage();
	 leavepage.onClickApplyLeavePage();
	 leavepage.onClickApplyLeaveType();
	 leavepage.onClickInputApplyLeaveType();
	 leavepage.onClickApplyLeaveDuration();
	 leavepage.onClickLeaveDurationButton();
	 String leave_date=ExcelUtilities.getDateValue(4, 1, excelFilePath, "Notes");
	 leavepage.inputApplyLeaveDate(leave_date);
	 String leave_reason= ExcelUtilities.getString(4, 0, excelFilePath, "Notes");
	  leavepage.inputApplyLeaveReason(leave_reason);
	 leavepage.onClickSaveApplyLeave();
 	}
 	
 	
// @Test
 public void assignLeave()
	{
	 leavepage.onClickLeavePage(); 
	 leavepage.onClickAssignLeavePage();
	}
 
// @Test
 public void addItems() throws IOException
 {
	 itemspage.onClickItemsPage();
	 itemspage.onClickAddItem();
	 String item_title= ExcelUtilities.getString(4, 2, excelFilePath, "Notes") + FakerUtility.randomNumberCreation();
	 itemspage.inputItemTitle(item_title);
	 String item_description= ExcelUtilities.getString(4, 3, excelFilePath, "Notes") ;
	 itemspage.inputItemDescription(item_description);
	 String item_unittype= ExcelUtilities.getNumeric(4, 4, excelFilePath, "Notes") ;
	 itemspage.inputUnitType(item_unittype);
	 String item_rate= ExcelUtilities.getNumeric(4, 5, excelFilePath, "Notes") ;
	 itemspage.inputItemRate(item_rate);
	 itemspage.onClickSaveAddItem();
 }
 
 
 //@Test
 public void addTimeManually()
 {
	 timecardspage.onClickTimeCards();
	 timecardspage.onClickAddTimeManually();
	 timecardspage.onClickTimeCardsTeamMember();
	// timecardspage.onClickTimeCardsMember();
 }
 
 @Test
 public void addExpenseInFinance()
 {
	 financepage.onClickFinancePage();
	 financepage.onClickExpensePage();
	 financepage.onClickAddExpensePage();
	 financepage.onClickExpenseCategory();
 }
}