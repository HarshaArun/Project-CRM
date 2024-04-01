package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	
	public void clickOnElement(WebElement element)
	{
		element.click();
	}

	public void enterText(WebElement element , String value )
	{
		element.sendKeys(value);
	}
	
	public String getTextFromElement(WebElement element)
	{
		return element.getText();
	}
	public void clearText(WebElement element)
	{
		element.clear();
	}
	public void navigateBack(WebDriver driver)
	{
		driver.navigate().back();
	}
	public String getAttributeValue(WebElement element,String attributeName)
	{
		return element.getAttribute(attributeName);
	}
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void rightClickOnElement(WebDriver driver,WebElement element)
	{
		Actions actions= new Actions(driver);
		actions.contextClick(element).build().perform();
	}
	public void rightClick(WebDriver driver)
	{
		Actions actions= new Actions(driver);
		actions.contextClick().build().perform();
	}
	
	public void enterTextUsingActions(WebDriver driver, WebElement element, String value)
	{
		Actions actions= new Actions(driver);
		actions.sendKeys(element, value).build().perform();
		
	}
	
public void scrollToElement(WebElement element ,WebDriver driver) {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public void scrollToBottom(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,800)");
	}
	public void clickUsingJavaScript(WebElement element , WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element);
	}

	public void selectDropdown(WebElement element, String visibleText) {
		
		Select staticDropdown = new Select(element);
		staticDropdown.selectByVisibleText(visibleText);
		
}
	public void moveToElement(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }	
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();
    }

    public void pressKey(WebDriver driver, Keys key) {
        Actions actions = new Actions(driver);
        actions.sendKeys(key).build().perform();
    }

    public void keyDown(WebDriver driver, Keys key) {
        Actions actions = new Actions(driver);
        actions.keyDown(key).build().perform();
    }

    public  void keyUp(WebDriver driver, Keys key) {
        Actions actions = new Actions(driver);
        actions.keyUp(key).build().perform();
    }
    public void doubleClick(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.doubleClick(element).build().perform();
    }
    public void clickAndHold(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
    }
    
    public void selectDropDown(WebElement element, String visibleText)
    {
    	Select staticDropDown= new Select(element);
    	staticDropDown.deselectByVisibleText(visibleText);
    }
}
