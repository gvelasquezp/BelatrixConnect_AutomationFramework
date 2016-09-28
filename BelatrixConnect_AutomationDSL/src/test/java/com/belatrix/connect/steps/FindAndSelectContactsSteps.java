package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindAndSelectContactsSteps extends ParentScenario{
	@When("^I click on Side bar Menu$")
	public void i_click_on_Side_bar_Menu() {
		tabProfilePage.openMenuSideBar();
		System.out.println("I open the Side Bar menu");
	}

	@And("^I click on Contacts Option$")
	public void i_click_on_Contacts_Option() {
		sideBarNavigation.clickContactsOption();
		System.out.println("I click on contacts option");
	}

	@Then("^I see one list of all contacts$")
	public void i_see_one_list_of_all_contacts() {
		selectAnUserPage.loadPageSucessfully();
		System.out.println("I see the list of all contacts correctly");
	}

	@When("^I click over one user of the list$")
	public void i_click_over_one_user_of_the_list() {
		selectAnUserPage.selectFirstUserOfList();
		System.out.println("I select a first user of the list of contacts");
	}

	@Then("^I should see the Profile User selected$")
	public void i_should_see_the_Profile_User_selected() {
		contactProfilePage.loadPageSucessfully();
		System.out.println("The profile of user selected load successfully");
		contactProfilePage.clickBackPage();
		System.out.println("I back on pages to main Page");
		selectAnUserPage.clickBackPage();
	}
	
	@When("^I click on find a Contact$")
	public void i_click_on_find_a_Contact() {
		selectAnUserPage.clickSearchContact();
	    System.out.println("I click on Find a specific contact");
	}

	@And("^type the next Contact \"(.*?)\"$")
	public void type_the_next_Contact(String contactName) {
		selectAnUserPage.findSpecificContact(contactName);
	    System.out.println("I find a contact by name: " + contactName);
	}

	@And("^click over the field of this Contact \"(.*?)\"$")
	public void click_over_the_field_of_this_Contact(String contactName) {
		selectAnUserPage.selectContactAfterSearch(contactName);
		System.out.println("i select the contact finded");
	}
	
	@Then("^I should see the Profile User finded$")
	public void i_should_see_the_Profile_User_finded() {
		contactProfilePage.loadPageSucessfully();
		System.out.println("The profile of user selected load successfully");
	}
	
	@And("I back on Pages to Logout of APP$")
	public void I_back_on_Pages_to_Logout_of_APP() {
		contactProfilePage.clickBackPage();
		System.out.println("I back on pages to main Page");
		selectAnUserPage.clickBackSearchPage();
		selectAnUserPage.clickBackPage();
	}
}