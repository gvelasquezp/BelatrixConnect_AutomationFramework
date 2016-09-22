package com.belatrix.connect.page.object;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.belatrix.connect.framework.ParentPage;

public class ContactProfilePage extends ParentPage{

	public ContactProfilePage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/account_swipe_refresh");
	By BTN_BACK_PAGE = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By BTN_RECOMMEND = By.
			id("com.belatrixsf.connect:id/action_recommend");
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
	
	/**
	  * This a method is for do click to open the Back Page Button
	 **/
	public void clickBackPage() 
	{
		click(BTN_BACK_PAGE);
	}
	
	/**
	  * This a method is for wait to load the Contact Profile Page
	 **/
	public void loadPageSucessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
		handlingWaitsToElement(PROFILE_NAME);
		handlingWaitsToElement(BTN_BACK_PAGE);
	}
	
	/**
	  * This a method is for do click on recommend
	 **/
	public void clickRecommend()
	{
		click(BTN_RECOMMEND);
	}
	
	/**
	  * This a method is for check the user profile page is correct
	  * @param contactName
	 **/
	public void checkUserNameOfContactPage(String contactName)
	{
		loadPageSucessfully();
		Assert.assertEquals("The user profile page doesnt correct", 
				contactName, getTextValue(PROFILE_NAME));
	}
}