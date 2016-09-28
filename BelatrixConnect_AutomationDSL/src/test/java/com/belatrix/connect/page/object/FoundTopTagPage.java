package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class FoundTopTagPage extends ParentPage{

	public FoundTopTagPage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/employees");
	By TITLE_PAGE = By.
			xpath("//android.widget.TextView");
	By BTN_BACK_PAGE = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By SELECT_A_CONTACT = By.
			xpath("//android.widget.TextView");
	
	/**
	  * This a method is for wait to load the found TopTag Page
	  * This method check the name of this page by tagName
	  * @param tagName
	 **/
	public void loadPageSucessfully(String tagName)
	{
		handlingWaitsToElement(CONTAINER_PAGE);
		handlingWaitsToElement(SELECT_A_CONTACT);
		tagName = tagName + " Top";
		handlingWaitsToNewElementByText(TITLE_PAGE, tagName);
	}
	
	/**
	  * This a method is for select any contact with contain the text
	  * This method check the name of contact
	  * @param tagName
	 **/
	public void selectSpecificContact(String contactName)
	{
		clickElementByTextValue(SELECT_A_CONTACT, contactName);
	}
	
	/**
	  * This a method is for do click to open the Back Page Button
	 **/
	public void clickBackPage() 
	{
		click(BTN_BACK_PAGE);
	}	
}