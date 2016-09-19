package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import org.testng.annotations.AfterClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginScenariesSteps extends ParentScenario{

	@Given("^I open the app$")
	public void i_open_the_app() throws Throwable {
		System.out.println("I open the app");
		startAndroid();
	}

	@When("^I login with this \"(.*?)\" and this \"(.*?)\" values$")
	public void i_login_with_this_and_this_values(String username, String password)
			throws Throwable {
		loginPage.loginOnApp(username, password);
		System.out.println("I login with recorder credentials");
	}

	@Then("^I see my user profile page$")
	public void i_see_my_user_profile_page() throws Throwable {
		System.out.println("Assert Profile page should show here");
		
	}

	@When("^I logout of the App$")
	public void i_logout_of_the_App() throws Throwable {
		mainProfilePage.openMenuSideBar();
		sideBarNavigation.logOutUserSesion();
	}

	@And("^I confirm the message displayed$")
	public void i_confirm_the_message_displayed() throws Throwable {
		alertMessageTwoOptions.answerYes();
	}

	@Then("^App login should appears$")
	public void app_login_should_appears() throws Throwable {
		System.out.println("Assert login page should show here");
	}

	@Then("^I see an error message for invalid login$")
	public void i_see_an_error_message_for_invalid_login() throws Throwable {
		System.out.println("Assert alertmessage invalid should show here");
	}
	
	@AfterClass
	public void after() {
		closeDriver();
	}

}