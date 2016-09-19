package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class TabLinearLayout extends ParentPage {
	
	public TabLinearLayout(WebDriver driver) {
		super(driver);
	}
	
	By TITLE_PAGE = By
			.xpath("//android.widget.TextView[@text='Belatrix Connect']");
	By TAB_ACCOUNT = By.
			id("com.belatrixsf.connect:id/username");
	By TAB_RANKING = By.
			id("com.belatrixsf.connect:id/password");
	By TAB_ACTIVITY = By.
			id("com.belatrixsf.connect:id/log_in");
	By TAB_TOPTAGS = By.
			id("com.belatrixsf.connect:id/forgot_password");

	/**
	  * This a method is for click on Account Tab
	 **/
	public void clickAccountTab()
	{
		click(TAB_ACCOUNT);
	}
	
	/**
	  * This a method is for click on Ranking Tab
	 **/
	public void clickRankingTab()
	{
		click(TAB_RANKING);
	}
	
	/**
	  * This a method is for click on Ranking Tab
	 **/
	public void clickActivityTab()
	{
		click(TAB_ACTIVITY);
	}
	
	/**
	  * This a method is for click on Ranking Tab
	 **/
	public void clickTopTagsTab()
	{
		click(TAB_TOPTAGS);
	}


}
