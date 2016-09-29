package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class TabTopTagPage extends ParentPage{

	public TabTopTagPage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/keywords");
	By BTN_SEARCH_TAG = By.
			id("com.belatrixsf.connect:id/action_search");
	By TAG_TO_SELECT = By.
			xpath("//android.widget.TextView");
	By BTN_MORE = By.
			id("com.belatrixsf.connect:id/start_recommendation");
	By SEARCH_CONTACT = By.
			id("com.belatrixsf.connect:id/search_term");
	By BTN_CLOSE_SEARCH = By.
			id("com.belatrixsf.connect:id/action_mode_close_button");
	
	/**
	  * This a method is for select a Specific Tag Name
	  * @param tagName
	 **/
	public void selectTagNameOption(String tagName)
	{
		clickElementByTextValue(TAG_TO_SELECT, tagName);
	}
	
	/**
	  * This a method is for wait to load the Top Tags Page
	 **/
	public void loadPageSuccessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
		handlingWaitsToElement(BTN_SEARCH_TAG);
		handlingWaitsToElement(BTN_MORE);
	}
	
	/**
	  * This a method is for do a click in Search Option
	 **/
	public void clickSearchTag()
	{
		click(BTN_SEARCH_TAG);
	}
	
	/**
	  * This a method is for wait to load the Search Elements
	 **/
	public void loadSearchElemens()
	{
		handlingWaitsToElement(SEARCH_CONTACT);
		handlingWaitsToElement(BTN_CLOSE_SEARCH);
	}
	

	/**
	  * This a method is for do a click in close search Option
	 **/
	public void clickCloseSearch()
	{
		loadSearchElemens();
		click(BTN_CLOSE_SEARCH);
	}
	
	/**
	  * This a method is for select a Specific Tag Name
	  * This method contain his own wait for load his element
	  * @param tagName
	 **/
	public void findSpecificTopTag(String tagName)
	{
		loadSearchElemens();
		sendKeys(SEARCH_CONTACT, tagName);
		clickAndroidBackButton();
	}
}