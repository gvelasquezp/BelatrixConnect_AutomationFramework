package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class SelectTagPage extends ParentPage{

	public SelectTagPage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/keywords");
	By BTN_BACK_PAGE = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By SELECT_TAG = By.
			xpath("//android.widget.TextView[@index='0']");
	
	/**
	  * This a method is for wait for a load Sub-category page
	 **/
	public void loadPageSuccessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
		handlingWaitsToElement(BTN_BACK_PAGE);
	}
	
	/**
	  * This a method is for do click on a sub-category desired
	  * @param tag 
	 **/
	public void selectTag(String tag)
	{
		clickElementByTextValue(SELECT_TAG, tag);
	}
}