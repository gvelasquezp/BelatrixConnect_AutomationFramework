package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class TabLinearLayout extends ParentPage {
	
	public TabLinearLayout(WebDriver driver) {
		super(driver);
	}
	
	By TAB_ACCOUNT = By.
			xpath("//android.widget.TextView[@text='Account']");
	By TAB_RANKING = By.
			xpath("//android.widget.TextView[@text='Ranking']");
	By TAB_ACTIVITY = By.
			xpath("//android.widget.TextView[@text='Activity']");
	By TAB_TOPTAGS = By.
			xpath("//android.widget.TextView[@text='Top Tags']");

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