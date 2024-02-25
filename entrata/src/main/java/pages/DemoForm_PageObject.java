/* This file Contains All WebElements and UI Interaction Methods of DemoForm webpage */
package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class DemoForm_PageObject {
	
		
		WebDriver driver;
		private ElementUtils elementUtils;

		public DemoForm_PageObject(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			 elementUtils= new ElementUtils(driver);
		}

		@FindBy(xpath ="//a[@class='button-default solid-dark-button']")
		private WebElement WatchDemoBtn;
		
		@FindBy(id ="FirstName")
		private WebElement FirstNameTextField;
		
		@FindBy(id ="LastName")
		private WebElement LastNameTextField;
		
		@FindBy(id ="Email")
		private WebElement EmailTextField;
		
		@FindBy(id ="Company")
		private WebElement CompanyNameTextField;
		
		@FindBy(id ="Phone")
		private WebElement PhoneNumberTextField;
		
		@FindBy(id ="Title")
		private WebElement JobTitleTextField;
		
		@FindBy(id ="Unit_Count__c")
		private WebElement SelectUnit;
		
		public void clickOnWatchDemoBtn() {
			elementUtils.clickOnWebElement(WatchDemoBtn, 30);
		}
		public void enterFirstName(String firstName) {
			elementUtils.typeTextIntoTheElement(FirstNameTextField, firstName, 30);
		}
		public void validateFirstName(String firstName) {
			String attributeValue=elementUtils.getAttribute(FirstNameTextField, 30);
			boolean attribute = Boolean.parseBoolean(attributeValue);
			if(firstName.isEmpty()) {
				Assert.assertTrue("The text box is empty", attribute);
			}
			else {
				attribute = !attribute;
				Assert.assertTrue("The text box is not empty", attribute);
			}
			
		}
		public void validatelastName(String lastName) {
			String attributeValue=elementUtils.getAttribute(LastNameTextField, 30);
			boolean attribute = Boolean.parseBoolean(attributeValue);
			if(lastName.isEmpty()) {
				Assert.assertTrue("The text box is empty", attribute);
			}
			else {
				attribute = !attribute;
				Assert.assertTrue("The text box is not empty", attribute);
			}
			
		}
		public void validateEmail(String email) {
			String attributeValue=elementUtils.getAttribute(EmailTextField, 30);
			boolean attribute = Boolean.parseBoolean(attributeValue);
			if(email.contains("@")) {
				attribute = !attribute;
				Assert.assertTrue("The text box is not empty", attribute);
			
			}
			else {
				Assert.assertTrue("The text box is empty", attribute);
			}
			
		}
		public void validateCompanyName(String companyName) {
			String attributeValue=elementUtils.getAttribute(CompanyNameTextField, 30);
			boolean attribute = Boolean.parseBoolean(attributeValue);
			if(companyName.isEmpty()) {
				Assert.assertTrue("The text box is empty", attribute);
			}
			else {
				attribute = !attribute;
				Assert.assertTrue("The text box is not empty", attribute);
			}
			
		}
		public void validatePhoneNumber(String phoneNumber) {
			String attributeValue=elementUtils.getAttribute(PhoneNumberTextField, 30);
			boolean attribute = Boolean.parseBoolean(attributeValue);
			if(phoneNumber.isEmpty()) {
				Assert.assertTrue("The text box is empty", attribute);
			}
			else {
				attribute = !attribute;
				Assert.assertTrue("The text box is not empty", attribute);
			}
			
		}
		public void jobTitle(String jobTitle) {
			String attributeValue=elementUtils.getAttribute(JobTitleTextField, 30);
			boolean attribute = Boolean.parseBoolean(attributeValue);
			if(jobTitle.isEmpty()) {
				Assert.assertTrue("The text box is empty", attribute);
			}
			else {
				attribute = !attribute;
				Assert.assertTrue("The text box is not empty", attribute);
			}
			
		}
		public void selectUnits() {
			elementUtils.selectOptionDropdown(SelectUnit, 2, 30);
		}
		public void enterLastName(String lastName) {
			elementUtils.typeTextIntoTheElement(LastNameTextField, lastName, 30);
		}
		public void enterMail(String email) {
			elementUtils.typeTextIntoTheElement(EmailTextField, email, 30);
		}
		public void enterCompany(String company) {
			elementUtils.typeTextIntoTheElement(CompanyNameTextField, company, 30);
		}
		public void enterPhone(String phone) {
			elementUtils.typeTextIntoTheElement(PhoneNumberTextField, phone, 30);
		}
		public void enterJobTitle(String job) {
			elementUtils.typeTextIntoTheElement(JobTitleTextField, job, 30);
		}
}
