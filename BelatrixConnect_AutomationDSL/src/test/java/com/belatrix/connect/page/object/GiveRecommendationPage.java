package com.belatrix.connect.page.object;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.belatrix.connect.framework.ParentPage;

public class GiveRecommendationPage extends ParentPage{

	public GiveRecommendationPage(WebDriver driver) {
		super(driver);
	}

	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/main_content");
	By BTN_BACK_PAGE = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By BTN_DONE = By.
			id("com.belatrixsf.connect:id/action_done");
	By TXT_USER_NAME = By.
			id("com.belatrixsf.connect:id/contact_full_name");
	By SELECT_USER = By.
			xpath("//android.widget.TextView[@text='Select user']");
	By SELECT_CATEGORY = By.
			xpath("//android.widget.TextView[@text='Select Category']");
	By WRITE_COMMEND = By.
			xpath("//android.widget.TextView[@text='Write a comment']");
	By SELECT_TAG = By.
			xpath("//android.widget.TextView[@text='Select a Tag']");
	
	
	/**
	  * This a method is for wait for a Give Recommendation page load
	  * when use a parameter contactName is because you already
	  * selected an user before enter in this page
	  * @param contactName
	 **/
	public void loadPageSuccessfully(String contactName)
	{
		handlingWaitsToElement(CONTAINER_PAGE);
		handlingWaitsToElement(TXT_USER_NAME);
		Assert.assertEquals("The user give recommendation page doesnt correct", 
				contactName, getTextValue(TXT_USER_NAME));
	}
	
	/**
	  * This a method is for wait for a Give Recommendation page load
	  * when not use a parameter is because we are enter in this page
	  * without selected an user
	 **/
	public void loadPageSuccessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
		handlingWaitsToElement(SELECT_USER);
		handlingWaitsToElement(BTN_BACK_PAGE);
	}
	
	/**
	  * This a method is for do click on select an user option
	 **/
	public void selectUser()
	{
		click(SELECT_USER);
	}
	
	/**
	  * This a method is for check the subCateogry Selected by the user
	  * @param contactName
	 **/
	public void checkUserSelected(String contactName)
	{
		handlingWaitsToNewElementByText(SELECT_USER, contactName);
	}
	
	
	/**
	  * This a method is for do click on select category option
	 **/
	public void selectCategory()
	{
		click(SELECT_CATEGORY);
	}
	
	/**
	  * This a method is for check the subCateogry Selected by the user
	  * @param subCategory
	 **/
	public void checkSubCategorySelected(String subCategory)
	{
		handlingWaitsToNewElementByText(SELECT_CATEGORY, subCategory);
	}
	
	/**
	  * This a method is for do click on write comment option 
	 **/
	public  void writeComment()
	{
		click(WRITE_COMMEND);
	}
	
	/**
	  * This a method is for check the comment entered by the user
	  * @param commnet
	 **/
	public void checkTheCommentEntered(String commnet)
	{
		handlingWaitsToNewElementByText(WRITE_COMMEND, commnet);
	}
	
	/**
	  * This a method is for do click on select tag option
	 **/
	public void selectTag()
	{
		click(SELECT_TAG);
	}
	
	/**
	  * This a method is for check the tag selected by the user
	  * @param tag
	 **/
	public void checkTheTagSelected(String tag)
	{
		handlingWaitsToNewElementByText(SELECT_TAG, tag);
	}
	
	/**
	  * This a method is for do click on Done button
	 **/
	public void doneRecommendation()
	{
		click(BTN_DONE);
	}
}