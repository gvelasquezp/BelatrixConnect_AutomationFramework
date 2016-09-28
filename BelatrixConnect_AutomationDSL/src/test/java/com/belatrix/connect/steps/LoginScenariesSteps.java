package com.belatrix.connect.steps;

import org.testng.annotations.AfterClass;
import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginScenariesSteps extends ParentScenario{
	
	@Given("^I open the app$")
	public void i_open_the_app() {
		System.out.println("I open the app");
		startAndroid();
		loginPage.loadPageSuccessfully();
		System.out.println("The App is load successfully");
	}

	@When("^I login with this \"(.*?)\" and this \"(.*?)\" values$")
	public void i_login_with_this_and_this_values(String username, String password) {
		loginPage.loginOnApp(username, password);
		System.out.println("I login with recorder credentials");
	}

	@Then("^I see my user profile page$")
	public void i_see_my_user_profile_page() {
		tabProfilePage.loadPageSucessfully();
		System.out.println("Assert Profile page should show here");
	}

	@When("^I logout of the App$")
	public void i_logout_of_the_App() {
		tabProfilePage.openMenuSideBar();
		sideBarNavigation.logOutUserSession();
		System.out.println("I click on Side Bar LogOut Session");
	}

	@And("^I confirm the message displayed$")
	public void i_confirm_the_message_displayed() {
		alertMessageTwoOptions.waitForAlertMessage();
		System.out.println("The confirmation message is displayed");
		alertMessageTwoOptions.answerYes();
		System.out.println("I confirm the logout session");
	}

	@Then("^App login should appears$")
	public void app_login_should_appears() {
		loginPage.loadPageSuccessfully();
		System.out.println("Assert login page should show here");
	}

	@Then("^I see an error message for invalid login$")
	public void i_see_an_error_message_for_invalid_login() {
		alertErrorMessage.waitForErrorMessage();
		System.out.println("Assert alertmessage invalid should show here");
	}
	
	@And ("^App show me a message of error$")
	public void App_show_me_a_message_of_error() {
		System.out.println("The system show me the Error message of Login");
		alertErrorMessage.waitForErrorMessage();
	}
	
	@Then ("^I go to Forgot Password option$")
	public void I_go_to_Forgot_Password_option() {
		System.out.println("I click in Forgot Password option");
		loginPage.forgotPasswordOption();
	}
	
	@When ("^I request my New Passowrd after input my Email \"(.*?)\"$")
	public void I_request_my_New_Passowrd_after_input_my_Email(String Email) {
		System.out.println("I input my Email to Request the new password");
		forgotPasswordPage.requestNewPassword(Email);
	}
	
	@And ("^I confirm the message of password Recovery displayed$")
	public void I_confirm_the_message_of_password_Recovery_displayed() {
		System.out.println("I confirm the alert message");
		alertMessageConfirmation.aceptConfirmationAlertDialog();
	}
	
	@AfterClass
	public void afterClass() {
		closeDriver();
	}
}