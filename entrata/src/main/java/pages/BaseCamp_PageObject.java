/* This file Contains All WebElements and UI Interaction Methods of BaseCamp webpage */

package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class BaseCamp_PageObject {

	
	WebDriver driver;
	private ElementUtils elementUtils;

	public BaseCamp_PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 elementUtils= new ElementUtils(driver);
	}
	
	@FindBy(xpath ="(//a[@class='main-nav-link'])[1]")
	private WebElement BaseCampBtn;
	
	@FindBy(xpath ="//a[@class='landing-register-btn w-inline-block']")
	private WebElement RegisterNow;
	
	@FindBy(xpath ="//h2[normalize-space()='Personal Information']")
	private WebElement PageHeadingLocator;
	
	@FindBy(id ="56aeaca6-a0ad-4548-8afc-94d8d4361ba1")
	private WebElement FirstNameTextField;
	
	@FindBy(id ="cfc98829-80b7-41b6-82b5-b968d43ef1c1")
	private WebElement LastNameTextField;
	
	@FindBy(id ="ff919d05-4281-4d9c-aa0d-82e3722d580d")
	private WebElement EmailTextField;
	
	@FindBy(id ="227f50d0-f65b-4a72-9a4f-5060ea05f6ab")
	private WebElement CompanyNameTextField;
	
	@FindBy(id ="032e80c1-f29f-44e6-af13-a89e53906422")
	private WebElement PhoneNumberTextField;
	
	@FindBy(id ="228cc308-a4d9-4212-8454-8407dd578c3d")
	private WebElement JobTitleTextField;
	
	@FindBy(xpath ="//input[@id='adminRegSelected_0']")
	private WebElement CheckBox;
	
	@FindBy(xpath ="//div[@id='56aeaca6-a0ad-4548-8afc-94d8d4361ba1-required']")
	private WebElement ValidateFirstNameTextField;
	
	@FindBy(xpath ="//div[@id='cfc98829-80b7-41b6-82b5-b968d43ef1c1-required']")
	private WebElement ValidateLastNameTextField;
	
	@FindBy(xpath ="//div[@id='ff919d05-4281-4d9c-aa0d-82e3722d580d-emailAddress']")
	private WebElement ValidateEmailTextField;
	
	@FindBy(xpath ="//div[@id='227f50d0-f65b-4a72-9a4f-5060ea05f6ab-required']")
	private WebElement ValidateCompanyNameTextField;
	
	@FindBy(xpath ="//div[@id='032e80c1-f29f-44e6-af13-a89e53906422-required']")
	private WebElement ValidatePhoneNumberTextField;
	
	@FindBy(xpath ="//div[@id='228cc308-a4d9-4212-8454-8407dd578c3d-required']")
	private WebElement ValidateJobTitleTextField;
	
	@FindBy(xpath ="//h2[normalize-space()='Enter your personal information below']")
	private WebElement ValidateCheckBox;

	public void clickOnBaseCampLink() {
		elementUtils.clickOnWebElement(BaseCampBtn, 30);
		Set<String> handles=driver.getWindowHandles();
		List<String> tab = new ArrayList(handles);
		driver.switchTo().window(tab.get(1));
	}
	public void clickOnRegisterNowBtn() {
		elementUtils.clickOnWebElement(RegisterNow, 30);
	}
	public String getTitleText() {
		return driver.getTitle();
	}
	public String getText() {
		return elementUtils.getTextFromElement(PageHeadingLocator, 30);
	}
	public void enterFirstName(String firstName) {
		elementUtils.typeTextIntoTheElement(FirstNameTextField, firstName, 30);
	}
	public void enterLastName(String lastName) {
		elementUtils.typeTextIntoTheElement(LastNameTextField, lastName, 30);
	}
	public void enterMail(String email) {
		elementUtils.typeTextIntoTheElement(EmailTextField, email, 30);
	}
	public void enterCompany(String company) {
		elementUtils.typeTextIntoTheElement(CompanyNameTextField, company, 30);
		elementUtils.getWindowScroll();
	}
	public void enterPhone(String phone) {
		elementUtils.typeTextIntoTheElement(PhoneNumberTextField, phone, 30);
	}
	public void enterJobTitle(String job) {
		elementUtils.typeTextIntoTheElement(JobTitleTextField, job, 30);
	}
	public void validateFirstNameTextField() {
		String Actual1 =elementUtils.getTextFromElement(ValidateFirstNameTextField, 30);
		String Expected1 = "First Name is required.";
		Assert.assertEquals(Expected1,Actual1);
	}
	public void validateLastNameTextField() {
		String Actual1 =elementUtils.getTextFromElement(ValidateLastNameTextField, 30);
		String Expected1 = "Last Name is required.";
		Assert.assertEquals(Expected1,Actual1);
	}
	public void validateEmailTextField() {
		String Actual1 =elementUtils.getTextFromElement(ValidateEmailTextField, 30);
		String Expected1 = "Email Address is required.";
		String Expected2 = "Email Address is invalid.";
		if(Actual1.equals(Expected1)) {
		Assert.assertEquals(Expected1 ,Actual1);
		}else {
			Assert.assertEquals(Expected2 ,Actual1);
		}
	}
	public void validateCompanyNameTextField() {
		String Actual1 =elementUtils.getTextFromElement(ValidateCompanyNameTextField, 30);
		String Expected1 = "Company is required.";
		Assert.assertEquals(Expected1,Actual1);
	}
	public void validateJobTitleTextField() {
		String Actual1 =elementUtils.getTextFromElement(ValidateJobTitleTextField, 30);
		String Expected1 = "Title is required.";
		Assert.assertEquals(Expected1,Actual1);
				
	}
	public void validatePhoneNumberTextField() {
		String Actual1 =elementUtils.getTextFromElement(ValidatePhoneNumberTextField, 30);
		String Expected1 = "Mobile is required.";
		Assert.assertEquals(Expected1,Actual1);
	}
	public void validateCheckBox() {
		String Attribute =elementUtils.checkBoxAttribute(CheckBox, 30);
		String Expected1 = "true";
		Assert.assertEquals(Expected1,Attribute);
	}
	public void clickOnCheckBox() {
		elementUtils.clickOnWebElement(CheckBox, 30);
	}
}
