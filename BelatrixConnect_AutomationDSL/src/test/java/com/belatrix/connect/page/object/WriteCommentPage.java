package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class WriteCommentPage extends ParentPage{

	public WriteCommentPage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/main_content");
	By BTN_BACK_PAGE = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By TXT_COMMENT = By.
			id("com.belatrixsf.connect:id/comment");
	By BTN_DONE = By.
			id("com.belatrixsf.connect:id/action_done");
	
	/**
	  * This a method is for wait for a load Sub-category page
	 **/
	public void loadPageSuccessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
	}
	
	/**
	  * This a method is for send a comment in this page
	  * @param comment
	 **/
	public void writeComment(String comment)
	{
		sendKeys(TXT_COMMENT, comment);
	}
	
	/**
	  * This a method is for do click in done button after wrote a text
	 **/
	public void doneWriteComment()
	{
		click(BTN_DONE);
	}
}