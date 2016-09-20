package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class AlertMessageConfirmation extends ParentPage{

	public AlertMessageConfirmation(WebDriver driver) {
		super(driver);
	}
	
	By CONTEINER_MESSAGE = By.
			id("android:id/parentPanel");
	By TITLE_MESSAGE = By.
			id("android:id/alertTitle");
	By MESSAGE = By.
			id("android:id/message");
	By BTN_CONFIRM = By.
			id("android:id/button1");
	
	/**
	  * This a method is for do click on confirm button
	 **/
	public void aceptConfirmationMessage()
	{
		click(BTN_CONFIRM);
	}
	
	/**
	  * This a method is for wait load the message alert
	 **/
	public void waitForMessageConfirmation()
	{
		handlingWaitsToElement(CONTEINER_MESSAGE);
		handlingWaitsToElement(TITLE_MESSAGE);
		handlingWaitsToElement(MESSAGE);
	}
}