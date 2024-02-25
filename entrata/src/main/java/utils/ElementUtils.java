/* In this file contains all generalized methods used for UI Interaction */

package utils;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {

	WebDriver driver;

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnWebElement(WebElement element, long durationInSeconds) {

		WebElement webElement = waitForElement(element, durationInSeconds);
		webElement.click();
	}

	public void typeTextIntoTheElement(WebElement element, String textTobeTyped, long durationOfTime) {
		WebElement webElement = waitForElement(element, durationOfTime);
		webElement.click();
		webElement.clear();
		webElement.sendKeys(textTobeTyped);
	}

	public WebElement waitForElement(WebElement element, long durationOfSeconds) {
		WebElement webElement = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationOfSeconds));
			webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return webElement;
	}

	public void selectOptionDropdown(WebElement element, int index, long dueationOfSeconds) {
		WebElement webElement = waitForElement(element, dueationOfSeconds);
		Select select = new Select(webElement);
//		select.selectByVisibleText(dropDownOptions);
		select.selectByIndex(index);
	}

	

	public WebElement waitForVisiblityOfelement(WebElement element, long durationInSeconds) {
		WebElement webElement = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
			webElement = wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return webElement;

	}

	public String getTextFromElement(WebElement element, long durationInSeconds)
	{
		WebElement webElemnt = waitForElement(element, durationInSeconds);
		return webElemnt.getText();
	}
	
	public boolean displayStatusOfElement(WebElement element, long durationInSecondsu)
	{
		try {
		WebElement webElemnt = waitForElement( element, durationInSecondsu);
		return webElemnt.isDisplayed();
		}
		catch (Throwable e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public String getAttribute(WebElement element, long durationInSecondsu)
	{
		WebElement webElemnt = waitForElement(element, durationInSecondsu);
		return webElemnt.getAttribute("aria-invalid");

	}
	public String checkBoxAttribute(WebElement element, long durationInSecondsu) {
		
		WebElement webElemnt = waitForElement(element, durationInSecondsu);
		return webElemnt.getAttribute("aria-checked");
		
	}
	
	public void getWindowScroll()
	{

        JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,600)","");
	}
	

}
