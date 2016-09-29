package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class SelectSubCategoryPage extends ParentPage{

	public SelectSubCategoryPage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/categories");
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
		handlingWaitsToElement(SELECT_SUB_CATEGORY);
	}
	
	/**
	  * This a method is for do click on a sub-category desired
	  * @param category 
	 **/
	public void selectSubCategory(String subcategory)
	{
		loadPageSuccessfully();
		clickElementByTextValue(SELECT_SUB_CATEGORY, subcategory);
	}
}