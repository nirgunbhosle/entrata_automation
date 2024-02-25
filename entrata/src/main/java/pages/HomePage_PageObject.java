/* This file Contains All WebElements and UI Interaction Methods of HomePage WebPage */
package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class HomePage_PageObject {
	
	WebDriver driver;
	private ElementUtils elementUtils;

	public HomePage_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 elementUtils= new ElementUtils(driver);
	}

	@FindBy(xpath = "(//div[@class='main-nav-link'])[1]")
	private WebElement Products;
	
	@FindBy(xpath = "(//div[@class='main-nav-link'])[2]")
	private WebElement Solutions;
	
	@FindBy(xpath = "(//div[@class='main-nav-link'])[3]")
	private WebElement Resources;
	
	@FindBy(xpath = "//div[@class='nav-group']//a[@class='fat-nav-header'][normalize-space()='Property Management']")
	private WebElement ProductTextLocator1;
	
	@FindBy(xpath = "//div[@class='nav-group']//a[@class='fat-nav-header'][normalize-space()='Marketing & Leasing']")
	private WebElement ProductTextLocator2;
	
	@FindBy(xpath = "//div[@class='nav-group']//a[@class='fat-nav-header'][normalize-space()='Accounting']")
	private WebElement ProductTextLocator3;
	
	@FindBy(xpath = "//div[@class='nav-group']//a[@class='fat-nav-header'][normalize-space()='Utilities']")
	private WebElement ProductTextLocator4;
	
	@FindBy(xpath = "//a[@class='fat-nav-header'][normalize-space()='All Solutions']")
	private WebElement SolutionTextLocator;
	
	@FindBy(xpath = "//a[@class='fat-nav-header'][normalize-space()='All Resources']")
	private WebElement ResourcesTextLocator;
	
	@FindBy(xpath = "//a[@class='button-default outline-dark-button']")
	private WebElement SignInButn;
	
//	public String getPageHeading()
//	{
////		return elementUtils.getTextFromElement(pageHeading, 30);
//		 
//	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void clickOnProduct()
	{
		elementUtils.clickOnWebElement(Products, 30);
	}
	
	
	public void validateAllProducts() {
		String Actual1 =elementUtils.getTextFromElement(ProductTextLocator1, 30);
		String Expected1 = "Property Management";
		Assert.assertEquals(Actual1, Expected1);
		
		String Actual2 = elementUtils.getTextFromElement(ProductTextLocator2, 30);
		String Expected2 = "Marketing & Leasing";
		Assert.assertEquals(Actual2, Expected2);
		
		String Actual3 = elementUtils.getTextFromElement(ProductTextLocator3, 30);
		String Expected3 = "Accounting";
		Assert.assertEquals(Actual3, Expected3);
		
		String Actual4 = elementUtils.getTextFromElement(ProductTextLocator4, 30);
		String Expected4 = "Utilities";
		Assert.assertEquals(Actual4, Expected4);
		
	}
	
	public void clickOnSolutions()
	{
		elementUtils.clickOnWebElement(Solutions, 30);
	}
	
	public String solutionText() {
		
		return elementUtils.getTextFromElement(SolutionTextLocator, 30);
		
		}
	public void clickOnResources() {
		
		elementUtils.clickOnWebElement(Resources, 30);
	}
	
public String resourceText() {
		
		return elementUtils.getTextFromElement(ResourcesTextLocator, 30);
		
		}
	
	public String sinInText() {
		return elementUtils.getTextFromElement(SignInButn, 30);
	}

}
