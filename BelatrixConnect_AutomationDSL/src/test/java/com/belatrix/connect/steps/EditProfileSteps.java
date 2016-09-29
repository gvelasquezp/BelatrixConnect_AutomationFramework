package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditProfileSteps extends ParentScenario{
	
	@When("^I click on edit my profile$")
	public void i_click_on_edit_my_profile() {
		tabProfilePage.openEditProfile();
		System.out.println("Entering the option Edit Profile");
	}

	@And("^I'm on my edit profile page$")
	public void i_m_on_my_edit_profile_page() {
		editProfilePage.loadPageSucessfully();
		System.out.println("Was entered correctly to form Edit Profile");
	}

	@And("^I edit my \"(.*?)\" and my \"(.*?)\" and my \"(.*?)\" and Select one \"(.*?)\"$")
	public void i_edit_my_and_my_and_my_and_Select_one(String firstName, String lastName, String skypeId, String location) {
		editProfilePage.editDataProfile(firstName, lastName, skypeId, location);
		System.out.println("Profile data is properly edited");
	}

	@And("^I select one Custom Picture$")
	public void i_select_one_Custom_Picture() {
		System.out.println("...");
	}

	@Then("^I click on done buton$")
	public void i_click_on_done_buton() {
		editProfilePage.finishTheEditionProfile();
		System.out.println("Was finished with the Edit Profile");
	}

	@And("^I check my \"(.*?)\" and my \"(.*?)\" and my \"(.*?)\" and my \"(.*?)\"$")
	public void i_check_my_and_my_and_my_and_my(String firstName, String lastName, String skypeId, String location) {
		tabProfilePage.loadPageSucessfully();
		tabProfilePage.checkUpdateDataEdited(firstName, lastName, skypeId, location);
		System.out.println("Fields were edited correctly");
	}
}