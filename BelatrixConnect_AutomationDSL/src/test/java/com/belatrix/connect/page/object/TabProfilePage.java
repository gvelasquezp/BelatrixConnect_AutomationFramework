package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class TabProfilePage extends ParentPage{

	public TabProfilePage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/account_swipe_refresh");
	By BTN_SIDEBAR = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By BTN_EDIT = By.
			id("com.belatrixsf.connect:id/action_edit_profile");
	By PROFILE_NAME = By.
			id("com.belatrixsf.connect:id/profile_name");
	By PROFILE_EMAIL = By.
			id("com.belatrixsf.connect:id/profile_email");
	By PROFILE_SKYPE_ID = By.
			id("com.belatrixsf.connect:id/skype_id");
	By PROFILE_LOCATION = By.
			id("com.belatrixsf.connect:id/location_name");
	By CURRENT_MONTH_SCORE = By.
			id("com.belatrixsf.connect:id/current_month_score");
	By CURRENT_SCORE = By.
			id("com.belatrixsf.connect:id/score");
	By CURRENT_LEVEL = By.
			id("com.belatrixsf.connect:id/level");
	By BTN_MORE = By.
			id("com.belatrixsf.connect:id/start_recommendation");
	
	/**
	  * This a method is for do click to open the SideBar
	 **/
	public void openMenuSideBar() 
	{
		click(BTN_SIDEBAR);
	}
	
	/**
	  * This a method is for wait to load the Main Profile Page
	 **/
	public void loadPageSucessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
	}
}