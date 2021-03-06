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
	
	By CONTAINER_MESSAGE_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]");
	By TITLE_MESSAGE_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[1]");
	By MESSAGE_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[2]");
	By BTN_ACCEPT_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[4]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]");

	/**
	 * This a method is for wait load the message alert
	 **/
	public void waitForErrorMessage() {
		handlingWaitsToElement(TITLE_MESSAGE);
		handlingWaitsToElement(MESSAGE);
		clickAndroidBackButton();
	}
	
	/**
	 * This method is for wait load the message alert on iOS Devices
	 **/
	public void waitForErrorMessage_iOS() {
		handlingWaitsToElement(TITLE_MESSAGE_iOS);
		handlingWaitsToElement(MESSAGE_iOS);
		click(BTN_ACCEPT_iOS);
	}
}