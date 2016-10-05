package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.belatrix.connect.framework.ParentPage;

public class TabProfilePage extends ParentPage{

	public TabProfilePage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/main_view_pager");
	By BTN_SIDEBAR = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By BTN_EDIT_SKILL = By.
			id("com.belatrixsf.connect:id/action_edit_skills");
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
		handlingWaitsToElement(PROFILE_NAME);
		handlingWaitsToElement(BTN_EDIT);
	}
	
	/**
	  * This a method is for wait the sideBar Option
	 **/
	public void loadSideBarButtonOption()
	{
		handlingWaitsToElement(BTN_SIDEBAR);
	}
	
	/**
	  * This a method is for do click on Edit Profile
	 **/
	public void openEditProfile()
	{
		click(BTN_EDIT);
	}
	
	/**
	  * This a method is for to check the update of data are correct
	  * @param String firstName
	  * @param String lastName
	  * @param String skypeId
	 **/
	public void checkUpdateDataEdited(String firstName, String lastName, String skypeId, String location)
	{
		Assert.assertEquals(getTextValue(PROFILE_NAME).equals(firstName + " "+ lastName), true);
		Assert.assertEquals(getTextValue(PROFILE_SKYPE_ID).equals(skypeId), true);
		Assert.assertEquals(getTextValue(PROFILE_LOCATION).equals(location), true);
	}
	
	/**
	  * This a method is for do click on Button More (Give Recommendation)
	 **/
	public void giveRecommendationOption()
	{
		click(BTN_MORE);
	}
}