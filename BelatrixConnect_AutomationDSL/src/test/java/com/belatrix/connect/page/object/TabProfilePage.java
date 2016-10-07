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
	By BTN_EDIT = By.
			id("com.belatrixsf.connect:id/action_edit_profile");
	By BTN_EDIT_SKILL = By.
			id("com.belatrixsf.connect:id/action_edit_skills");
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
	
	By CONTAINER_PAGE_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAImage[1]");
	By BTN_MORE_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIATabBar[1]/UIAButton[5]");
	By BTN_SETTINGS_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[4]");
	By BTN_LOGOUT_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[2]");
	By PROFILE_NAME_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAStaticText[2]");
	
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
	  * This method is for wait to load the Main Profile Page on iOS Devices
	 **/
	public void loadPageSucessfully_iOS()
	{
		handlingWaitsToElement(PROFILE_NAME_iOS);
	}
	
	/**
	  * This method is for Log out the User session on iOS Devices
	 **/
	public void logOutUserSession_iOS(){
		click(BTN_MORE_iOS);
		click(BTN_SETTINGS_iOS);
		click(BTN_LOGOUT_iOS);
		
	}
	
	/**
	  * This a method is for do click on Button More (Give Recommendation)
	 **/
	public void giveRecommendationOption()
	{
		click(BTN_MORE);
	}
}