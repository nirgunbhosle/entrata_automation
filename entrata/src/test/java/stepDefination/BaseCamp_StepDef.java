package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.BaseCamp_PageObject;

public class BaseCamp_StepDef {
	
	private DriverFactory driverFactory;
	WebDriver driver;
	BaseCamp_PageObject baseCampPage;
	
	public BaseCamp_StepDef() {
		driverFactory = new DriverFactory();
		driver = driverFactory.getDriver();
		

		baseCampPage = new BaseCamp_PageObject(driver);
	}

	@When("user click on Base Camp link")
	public void user_click_on_base_camp_link() {
		baseCampPage.clickOnBaseCampLink();
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String Title) {
		Assert.assertEquals(Title, baseCampPage.getTitleText());
			
			
	}

	@Then("user click on Register Now button")
	public void user_click_on_register_now_button() {
		baseCampPage.clickOnRegisterNowBtn();
	}

	@Then("user validate the personal information tite text")
	public void user_validate_the_personal_information_tite_text() {
		Assert.assertEquals("Personal Information" ,baseCampPage.getText());
	}
	@Then("user enters the first Name {string}")
	public void user_enters_the_first_name(String firstName) {
		baseCampPage.enterFirstName(firstName);
	}

	@Then("user enters the last name {string}")
	public void user_enters_the_last_name(String lastName) {
		baseCampPage.enterLastName(lastName);
	}

	@Then("user enters the company name {string}")
	public void user_enters_the_company_name(String companyName) {
		baseCampPage.enterCompany(companyName);
	}

	@Then("user enters the job title {string}")
	public void user_enters_the_job_title(String jobTitle) {
		baseCampPage.enterJobTitle(jobTitle);
	}

	@Then("user enters the email {string}")
	public void user_enters_the_email(String email) {
		baseCampPage.enterMail(email);
	}

	@Then("user enters the phone number {string}")
	public void user_enters_the_phone_number(String phoneNumber) {
		baseCampPage.enterPhone(phoneNumber);
	}

	@Then("user validate the first name")
	public void user_validate_the_first_name() {
		baseCampPage.validateFirstNameTextField();
	}

	@Then("user validate the last name")
	public void user_validate_the_last_name() {
		baseCampPage.validateLastNameTextField();
	}

	@Then("user validate the company name")
	public void user_validate_the_company_name() {
		baseCampPage.validateCompanyNameTextField();
	}

	@Then("user validate the job title")
	public void user_validate_the_job_title() {
		baseCampPage.validateJobTitleTextField();
	}

	@Then("user validate the email")
	public void user_validate_the_email() {
		
		baseCampPage.validateEmailTextField();
	}

	@Then("user click on check box")
	public void user_click_on_check_box() {
		baseCampPage.clickOnCheckBox();
		baseCampPage.validateCheckBox();
	}

	@Then("user validate the phonenumber")
	public void user_validate_the_phonenumber() {
		baseCampPage.validatePhoneNumberTextField();
	}

@Then("user validate the phonenumber textfield")
public void user_validate_the_phonenumber_textfield() {
    
}
}
