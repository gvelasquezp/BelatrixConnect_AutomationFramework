package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckRankingSteps extends ParentScenario {
	
	@When("^I click on ranking Tab$")
	public void i_click_on_ranking_Tab() {
		tabLinearLayout.clickRankingTab();
		System.out.println("I see the ranking page of default");
	}

	@Then("^I see the Currement Month rank deafult$")
	public void i_see_the_Currement_Month_rank_deafult() throws Throwable {
	    tabRankingPage.loadPageSuccessfully();
	}

	@And("^I check the current Month Rank$")
	public void i_check_the_current_Month_Rank() throws Throwable {
		System.out.println("check the result list Rank");
		tabRankingPage.checkResultOfRankList();
		System.out.println("The current Month Ranking Page is correct");
	}
	
	@Then("^I click on Last Month ranking$")
	public void i_click_on_Last_Month_ranking() throws Throwable {
		tabRankingPage.viewLastMonthRanking();
	    System.out.println("I see the Last Month Ranking");
	}

	@And("^I check the last Month Rank$")
	public void i_check_the_last_Month_Rank() throws Throwable {
		System.out.println("check the result list Rank");
		tabRankingPage.checkResultOfRankList();
		System.out.println("The Ranking Page is correct");
	}
	
	@Then("^I click on all time rank$")
	public void i_click_on_all_time_rank() throws Throwable {
		tabRankingPage.viewAllTimeRanking();
	    System.out.println("I see the all time Ranking");
	}
	
	@And("^I check the all time Rank$")
	public void i_check_the_all_time_Rank() throws Throwable {
		tabRankingPage.checkResultOfRankList();
		System.out.println("The all time Ranking Page is correct");
	}
}