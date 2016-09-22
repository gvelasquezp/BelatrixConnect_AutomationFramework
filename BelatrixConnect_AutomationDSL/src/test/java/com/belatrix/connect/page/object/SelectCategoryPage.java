package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class SelectCategoryPage extends ParentPage{

	public SelectCategoryPage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/main_content");
	By BTN_BACK_PAGE = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By SELECT_CATEGORY = By.
			xpath("//android.widget.TextView");

	/**
	  * This a method is for wait for a load category page
	 **/
	public void loadPageSuccessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
	}
	
	/**
	  * This a method is for do click on a category desired
	  * @param category 
	 **/
	public void selectCategory(String category)
	{
		clickElementByTextValue(SELECT_CATEGORY, category);
	}
}