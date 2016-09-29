package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class TabRankingPage extends ParentPage{

	public TabRankingPage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/fragment_ranking_container");
	By TXT_CONTACT_FULLNAME = By.
			id("com.belatrixsf.connect:id/contact_full_name");
	By CURRENT_MONTH_RANKING = By.
			xpath("//android.widget.TextView[@text='Last Month']");
	By LAST_MOTH_RANKING = By.
			xpath("//android.widget.TextView[@text='Current Month']");
	By ALL_TIME_RANKING = By.
			xpath("//android.widget.TextView[@text='All Time']");
	
	/**
	  * This a method is for do a click on Last month rank option
	 **/
	public void viewLastMonthRanking()
	{
		click(LAST_MOTH_RANKING);
	}
	
	/**
	  * This a method is for do a click on view all rank option
	 **/
	public void viewAllTimeRanking()
	{
		click(ALL_TIME_RANKING);
	}
	
	/**
	  * This a method is for wait a page to successfully
	 **/
	public void loadPageSuccessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
		handlingWaitsToElement(LAST_MOTH_RANKING);
		handlingWaitsToElement(ALL_TIME_RANKING);
	}
	
	/**
	  * This a method is for wait a elements of the rank list of contacts
	 **/
	public void checkResultOfRankList()
	{
		handlingWaitsToElement(TXT_CONTACT_FULLNAME);
	}
}