package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.belatrix.connect.framework.ParentPage;

public class SelectAnUserPage extends ParentPage{

	public SelectAnUserPage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/employees");
	By BTN_BACK_PAGE = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By TXT_FIND_CONTACT = By.
			id("com.belatrixsf.connect:id/action_search");
	By SELECT_A_CONTACT = By.
			xpath("//android.support.v7.widget.RecyclerView[@index='0']"
					+ "/android.widget.LinearLayout[@index='0']");
	By SEARCH_CONTACT = By.
			id("com.belatrixsf.connect:id/search_term");
	By BTN_CLOSE_SEARCH = By.
			id("com.belatrixsf.connect:id/action_mode_close_button");
	
	/**
	  * This a method is for wait to load the Contact Profile Page
	 **/
	public void loadPageSucessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
		handlingWaitsToElement(SELECT_A_CONTACT);
	}
	
	/**
	  * This a method is for a click to button find Specific Contact
	 **/
	public void clickSearchContact()
	{
		click(TXT_FIND_CONTACT);
	}
	
	/**
	  * This a method is for select a first contact of the Result List
	 **/
	public void selectFirstUserOfList()
	{
		click(SELECT_A_CONTACT);
	}
	
	/**
	  * This a method is for do click to open the Back Page Button
	 **/
	public void clickBackPage() 
	{
		loadPageSucessfully();
		click(BTN_BACK_PAGE);
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
	  * This a method is for do click to open the Back Page Button of Search
	 **/
	public void clickBackSearchPage() 
	{
		click(BTN_CLOSE_SEARCH);
	}
	
	/**
	  * This a method is for search a specific contact by Name of Contact
	  * @param String ContactName
	 **/
	public void findSpecificContact(String contactName) 
	{
		loadSearchElemens();
	    sendKeys(SEARCH_CONTACT, contactName);
	    clickAndroidBackButton();
	}
	
	/**
	  * This a method is for wait Result Element after a search
	 **/
	public void loadElemensAfterSearch()
	{
		handlingWaitsToElement(SELECT_A_CONTACT);
	}
	
	/**
	  * This a method is for select a specific contact after a search
	  * This method assert the contact selected is equal to search
	  * @param String ContactName
	 **/
	public void selectContactAfterSearch(String contactName)
	{
		loadElemensAfterSearch();
		System.out.println("The Result of Search show correctly");
		click(SELECT_A_CONTACT);
	}
}