package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class AlertErrorMessage extends ParentPage {

	public AlertErrorMessage(WebDriver driver) {
		super(driver);
	}

	By CONTEINER_MESSAGE = By.
			id("android:id/parentPanel");
	By TITLE_MESSAGE = By.
			id("android:id/alertTitle");
	By MESSAGE = By.
			id("android:id/message");

	/**
	 * This a method is for wait load the message alert
	 **/
	public void waitForErrorMessage() {
		handlingWaitsToElement(TITLE_MESSAGE);
		handlingWaitsToElement(MESSAGE);
		clickAndroidBackButton();
	}
}