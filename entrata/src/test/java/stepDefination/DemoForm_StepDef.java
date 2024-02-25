package stepDefination;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.DemoForm_PageObject;


public class DemoForm_StepDef {

	private DriverFactory driverFactory;
	WebDriver driver;
	DemoForm_PageObject demoFormPage;
	
	@Given("user open the browser Demoform")
	public void user_open_the_browser() {
		driverFactory = new DriverFactory();
		driver = driverFactory.getDriver();
		

		demoFormPage = new DemoForm_PageObject(driver);
	}
	
	@When("user click on Watch Demo button")
	public void user_click_on_watch_demo_button() {
	   demoFormPage.clickOnWatchDemoBtn();
	}

	@Then("user enters the first name {string}")
	public void user_enters_the_first_name(String First_Name) {
		demoFormPage.enterFirstName(First_Name);
	    
	}

	@Then("user validate the first name field {string}")
	public void user_validate_the_first_name_field(String firstName) {
		demoFormPage.validateFirstName(firstName);
	}

	@Then("user enters the last name field {string}")
	public void user_enters_the_last_name_field(String Last_Name) {
		demoFormPage.enterLastName(Last_Name);
	}

	@Then("user validate the last name field {string}")
	public void user_validate_the_last_name_field(String lastName) {
		demoFormPage.enterLastName(lastName);
	}

	@Then("user enters the email field {string}")
	public void user_enters_the_email_field(String Email) {
		demoFormPage.enterMail(Email);
	}

	@Then("user validate the email field {string}")
	public void user_validate_the_email_field(String email) {
		demoFormPage.validateEmail(email);
	}

	@Then("user enters the company name field {string}")
	public void user_enters_the_company_name_field(String Company_Name) {
		demoFormPage.enterCompany(Company_Name);
	}

	@Then("user validate the company name field {string}")
	public void user_validate_the_company_name_field(String companyName) {
		demoFormPage.validateCompanyName(companyName);
	}

	@Then("user enters the phonenumber field {string}")
	public void user_enters_the_phonenumber_field(String PhoneNumber) {
		demoFormPage.enterPhone(PhoneNumber);
	}

	@Then("user validate the phonenumber field {string}")
	public void user_validate_the_phonenumber_field(String phoneNumber) {
		demoFormPage.validatePhoneNumber(phoneNumber);
	}

	@Then("user select the unit count")
	public void user_select_the_unit_count() {
		demoFormPage.selectUnits();
	}

	@Then("user enters the job title field {string}")
	public void user_enters_the_job_title_field(String Job_Title) {
		demoFormPage.enterJobTitle(Job_Title);
	}

	@Then("user validate the job title field {string}")
	public void user_validate_the_job_title_field(String jobTitle) {
		demoFormPage.enterJobTitle(jobTitle);
	}


}
