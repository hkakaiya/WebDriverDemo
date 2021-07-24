package StepDefn1;

import io.cucumber.java.en.*;

public class LogINStep {

	@Given("User is on logIn page")
	public void user_is_on_log_in_page() {
		System.out.println("test");
	}

	@When("User enters UserID & Password")
	public void user_enters_user_id_password() {
		System.out.println("test");
	}

	@And("Clicks on LogIn Button")
	public void clicks_on_log_in_button() {
		System.out.println("test");
	}

	@Then("User is allowed to logIn and see the HomePage")
	public void user_is_allowed_to_log_in_and_see_the_home_page() {
		System.out.println("test");
	}



}
