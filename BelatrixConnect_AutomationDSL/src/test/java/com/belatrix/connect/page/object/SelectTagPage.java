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
	By SELECT_SUB_CATEGORY = By.
			xpath("//android.widget.TextView");
	
	/**
	  * This a method is for wait for a load Sub-category page
	 **/
	public void loadPageSuccessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
	}
	
	/**
	  * This a method is for do click on a sub-category desired
	  * @param subCategory 
	 **/
	public void selectSubCategory(String subCategory)
	{
		clickElementByTextValue(SELECT_SUB_CATEGORY, subCategory);
	}
}