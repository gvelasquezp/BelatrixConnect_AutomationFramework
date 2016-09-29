package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class AlertMessageTwoOptions  extends ParentPage{
	
	public AlertMessageTwoOptions(WebDriver driver) {
		super(driver);
	}
	
	By CONTEINER_MESSAGE = By.
			id("android:id/content");
	By MESSAGE = By.
			id("android:id/message");
	By YES_OPTION = By.
			id("android:id/button1");
	By NO_OPTION = By.
			id("android:id/button2");
	
	By CONTAINER_MESSAGE_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]");
	By MESSAGE_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIAScrollView[1]/UIAStaticText[2]");
	By ACCEPT_OPTION_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[2]");
	By CANCEL_OPTION_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]");
	
	/**
	  * This a method is for wait load the message alert
	 **/
	public void waitForAlertMessage()
	{
		handlingWaitsToElement(CONTEINER_MESSAGE);
		handlingWaitsToElement(MESSAGE);
	}
	
	public void waitForAlertMessage_iOS()
	{
		handlingWaitsToElement(CONTAINER_MESSAGE_iOS);
		handlingWaitsToElement(MESSAGE_iOS);
	}
	
	/**
	  * This a method is for do click in Yes option
	 **/
	public void answerYes()
	{
		click(YES_OPTION);
	}

	
	/**
	  * This method is for do click in Accept option
	 **/
	public void answerAccept_iOS()
	{
		click(ACCEPT_OPTION_iOS);
	}
}
