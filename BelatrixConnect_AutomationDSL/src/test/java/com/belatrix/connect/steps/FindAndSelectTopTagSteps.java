package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindAndSelectTopTagSteps extends ParentScenario{
	
	@When("^I click on Top Tags tab$")
	public void i_click_on_Top_Tags_tab(){
		System.out.println("I click on Top Tags tab");
		tabLinearLayout.clickTopTagsTab();
	}

	@Then("^I see one list of all Top Tags used$")
	public void i_see_one_list_of_all_Top_Tags_used(){
	    tabTopTagPage.loadPageSuccessfully();
	    System.out.println("The list of all Top Tags used load correctly");
	}

	@When("^I click on find a specific Tag$")
	public void i_click_on_find_a_specific_Tag(){
		tabTopTagPage.clickSearchTag();
		System.out.println("I try to find a specific tag, i was click on search a tag");
	}

	@And("^type the next Tag Name \"(.*?)\"$")
	public void type_the_next_Tag_Name(String tagName){
		tabTopTagPage.findSpecificTopTag(tagName);
		System.out.println("I was put the next String: " + tagName);
	}

	@And("^I click over the field of this tag \"(.*?)\"$")
	public void i_click_over_the_field_of_this_tag(String tagName){
		System.out.println("The search finish correctly");
		tabTopTagPage.selectTagNameOption(tagName);
		System.out.println("I click on Result of Search");
	}

	@Then("^I see one list of all contacts with points in this Tag \"(.*?)\"$")
	public void i_see_one_list_of_all_contacts_with_points_in_this_Tag(String tagName){
		foundTopTagPage.loadPageSucessfully(tagName);
		System.out.println("The results are corrects");
		foundTopTagPage.clickBackPage();
		tabTopTagPage.clickCloseSearch();
	}
}