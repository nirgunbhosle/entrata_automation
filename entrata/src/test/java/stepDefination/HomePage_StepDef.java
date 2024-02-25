package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage_PageObject;

public class HomePage_StepDef {

	private DriverFactory driverFactory;
	WebDriver driver;
	HomePage_PageObject homePage;
	
	public HomePage_StepDef() {
		driverFactory = new DriverFactory();
		driver = driverFactory.getDriver();
		

		 homePage = new HomePage_PageObject(driver);
	}
	
	@Given("user open the browser homepage")
	public void user_open_the_browser() {
		
	}

	@When("user navigate to the {string}")
	public void user_navigate_to_the(String Url) {
		driver.get(Url);
	}

	@Then("page title should be {string} of Demoform")
	public void page_title_should_be(String PageTitle) {
		
		Assert.assertEquals(PageTitle, homePage.getPageTitle());
		
		
	}

	@When("user navigate to the products")
	public void user_navigate_to_the_products() {
		homePage.clickOnProduct();
	}

	@Then("user validate the text of products")
	public void user_validate_the_text_of_products() {
		homePage.validateAllProducts();
	}

	@When("user navigate to the solutions")
	public void user_navigate_to_the_solutions() {
		homePage.clickOnSolutions();
	}

	@Then("user validate the text of solutions")
	public void user_validate_the_text_of_solutions() {
		Assert.assertEquals("All Solutions",homePage.solutionText());
	}

	@When("user navigate to the resources")
	public void user_navigate_to_the_resources() {
		homePage.clickOnResources();
	}

	@Then("user validate the text of resources")
	public void user_validate_the_text_of_resources() {
		Assert.assertEquals("All Resources",homePage.resourceText());
	}

	@Then("user validate signin buttton")
	public void user_validate_signin_buttton() {
		Assert.assertEquals("Sign In",homePage.sinInText());
	}

}
