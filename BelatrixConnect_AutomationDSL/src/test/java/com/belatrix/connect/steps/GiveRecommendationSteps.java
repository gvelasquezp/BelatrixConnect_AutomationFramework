package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GiveRecommendationSteps extends ParentScenario{
	
	@When("^I click on this Tag Name \"(.*?)\" of the list$")
	public void i_click_on_this_Tag_Name_of_the_list(String tagName){
		tabTopTagPage.selectTagNameOption(tagName);
		System.out.println("I click on TagName: " + tagName);
	}

	@Then("^I see one list of all contacts with points on page \"(.*?)\"$")
	public void i_see_one_list_of_all_contacts_with_points_on_page(String tagName){
		foundTopTagPage.loadPageSucessfully(tagName);
		System.out.println("The results are corrects");
	}

	@When("^I click on this contact \"(.*?)\" of the list$")
	public void i_click_on_this_contact_of_the_list(String contactName){
		foundTopTagPage.selectSpecificContact(contactName);
		System.out.println("I click on contact: " + contactName);
	}
	
	@When("^I see the profile of the contact \"(.*?)\" selected$")
	public void i_see_the_profile_of_the_contact_selected(String contactName){	    
		contactProfilePage.checkUserNameOfContactPage(contactName);
		System.out.println("the user profile page is correct");
	}

	@When("^I click on Recommend Option$")
	public void i_click_on_Recommend_Option(){
		contactProfilePage.clickRecommend();
		System.out.println("I click in Recommend option");
	}

	@Then("^I should see the Give a Recommendation to contact \"(.*?)\"$")
	public void i_should_see_the_Give_a_Recommendation_to_contact(String contactName){
	    giveRecommendationPage.loadPageSuccessfully(contactName);
	    System.out.println("The Give a Recommendation Page of the user: " + contactName);
	}

	@Then("^I check the button done is disabled$")
	public void i_check_the_button_done_is_disabled(){
		System.out.println("Assert buton = false");
	}

	@When("^I click in select a Category$")
	public void i_click_in_select_a_Category(){
		giveRecommendationPage.selectCategory();
		System.out.println("I click in Select Category Option");
	}

	@When("^select a Category as \"(.*?)\"$")
	public void select_a_Category_as(String category){
		selectCategoryPage.loadPageSuccessfully();
		System.out.println("The Category page is load Successfully");
		selectCategoryPage.selectCategory(category);
		System.out.println("I select the category "+ category +" correctly");
	}

	@When("^Select a Subcategory as \"(.*?)\"$")
	public void select_a_Subcategory_as(String subCategory){
	    selectSubCategoryPage.selectSubCategory(subCategory);
	    System.out.println("I select the Sub-category "+ subCategory +" correctly");
	}

	@Then("^I should see the Subcategory as \"(.*?)\" selected in a first field$")
	public void i_should_see_the_Subcategory_as_selected_in_a_first_field(String subCategory){
		giveRecommendationPage.checkSubCategorySelected(subCategory);
		System.out.println("The Sub-Category " + subCategory +  " show successly ");
	}

	@When("^I click in Write a comment$")
	public void i_click_in_Write_a_comment(){
		System.out.println("I click in Write a Comment");
		giveRecommendationPage.writeComment();
	}

	@When("^I write a comment \"(.*?)\"$")
	public void i_write_a_comment(String comment){
	    writeCommentPage.loadPageSuccessfully();
	    System.out.println("The Write Comment page is load Successfully");
	    writeCommentPage.writeComment(comment);
	    System.out.println("I wrote the comment");
	}

	@When("^I click in Done$")
	public void i_click_in_Done(){
		writeCommentPage.doneWriteComment();
		System.out.println("I click in Done after wrote the Comment");
	}

	@Then("^I should see the commend \"(.*?)\" wrote in in a second field$")
	public void i_should_see_the_commend_wrote_in_in_a_second_field(String comment){
		giveRecommendationPage.checkTheCommentEntered(comment);
		System.out.println("The comment " + comment +  " show successly ");
	}

	@When("^I click in select a Tag$")
	public void i_click_in_select_a_Tag(){
		System.out.println("I click in Select Tag Option");
		giveRecommendationPage.selectTag();	
	    selectTagPage.loadPageSuccessfully();
	    System.out.println("The Tag page is load Successfully");
	}

	@When("^I select a Tag \"(.*?)\"$")
	public void i_select_a_Tag(String tag){
		selectTagPage.selectTag(tag);
		System.out.println("I select the Sub-category "+ tag +" correctly");
	}

	@Then("^I should see the Tag \"(.*?)\" selected in the last field$")
	public void i_should_see_the_Tag_selected_in_the_last_field(String tag){
	    giveRecommendationPage.checkTheTagSelected(tag);
	    System.out.println("The Tag " + tag +  " show successly ");
	}

	@Then("^I check the button done now is enable$")
	public void i_check_the_button_done_now_is_enable(){
		System.out.println("Assert buton = true");
	}

	@When("^I click Done button$")
	public void i_click_Done_button(){
		giveRecommendationPage.doneRecommendation();
		System.out.println("I clicked in Done Recommendation");
	}

	@Then("^I should see the message of action done successfully$")
	public void i_should_see_the_message_of_action_done_successfully(){
	    alertMessageConfirmation.waitForSnackBarMessage();
	    System.out.println("Display the Message of Confirmation");
	}

	@Then("^I confirm the success message$")
	public void i_confirm_the_success_message(){
		alertMessageConfirmation.aceptConfirmationSnackBar();
		System.out.println("I confirmed the message");
	}

	@Then("^I back the page to exit of the App$")
	public void i_back_the_page_to_exit_of_the_App(){
	    contactProfilePage.clickBackPage();
	    System.out.println("I click back of contact Profile Page");
	}
	
	@When("^I click on button give a Recommendation$")
	public void i_click_on_button_give_a_Recommendation(){
		System.out.println("I click on Give Recommendation Option");
		tabProfilePage.giveRecommendationOption();
	}

	@Then("^I should see the Give a Recommendation page$")
	public void i_should_see_the_Give_a_Recommendation_page(){
	    giveRecommendationPage.loadPageSuccessfully();
	    System.out.println("the Give Recommendation page was load sucessfully");
	}

	@When("^I click on select a user option$")
	public void i_click_on_select_a_user_option(){
	    giveRecommendationPage.selectUser();
	    System.out.println("i click on select user option");
	}

	@Then("^I should see the contact \"(.*?)\" selected$")
	public void i_should_see_the_contact_selected(String contactName){
	    giveRecommendationPage.checkUserSelected(contactName);
	    System.out.println("I select the User "+ contactName +" correctly");
	}
}