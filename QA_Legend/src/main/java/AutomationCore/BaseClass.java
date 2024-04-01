package AutomationCore;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public WebDriver driver;
	public String excelFilePath="//src//test//resources//TestData//testData_Excel.xlsx";
	
	public WebDriver browserInitilization(String browserName) throws Exception
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver= new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			throw new Exception("Invalid name Exception");
		}
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;       // to enable driver to take screen shot
		File source = ts.getScreenshotAs(OutputType.FILE);     //capture screenshot in file
		String destinationFile = System.getProperty("user.dir")+"\\test-output\\"+testCaseName+".png";
		File destination= new File(destinationFile);
        FileUtils.copyFile(source, destination);
       return destinationFile;
		
	}

}
