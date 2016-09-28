package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class AlertMessageConfirmation extends ParentPage{

	public AlertMessageConfirmation(WebDriver driver) {
		super(driver);
	}
	
	By ALERT_DIALOG_CONTEINER_MESSAGE = By.
			id("android:id/parentPanel");
	By ALERT_DIALOG_TITLE_MESSAGE = By.
			id("android:id/alertTitle");
	By ALERT_DIALOG_MESSAGE = By.
			id("android:id/message");
	By ALERT_DIALOG_BTN_CONFIRM = By.
			id("android:id/button1");
	
	By SNACK_BAR_CONTEINER_MESSAGE = By.
			xpath("android.widget.LinearLayout[@index='1']");
	By SNACK_BAR_MESSAGE = By.
			id("com.belatrixsf.connect:id/snackbar_text");
	By SNACK_BAR_BTN_CONFIRM = By.
			id("com.belatrixsf.connect:id/snackbar_action");
	
	
	
	/**
	  * Just for Message of type Alert Dialog 
	  * This a method is for do click on confirm button
	 **/
	public void aceptConfirmationAlertDialog()
	{
		click(ALERT_DIALOG_BTN_CONFIRM);
	}
	
	/**
	  * Just for Message of type Alert Dialog 
	  * This a method is for wait load the message alert
	 **/
	public void waitForAlertDialogMessage()
	{
		handlingWaitsToElement(ALERT_DIALOG_CONTEINER_MESSAGE);
		handlingWaitsToElement(ALERT_DIALOG_TITLE_MESSAGE);
		handlingWaitsToElement(ALERT_DIALOG_MESSAGE);
	}
	
	/**
	  * Just for Message of type SNACK BAR 
	  * This a method is for do click on confirm button
	 **/
	public void aceptConfirmationSnackBar()
	{
		click(SNACK_BAR_BTN_CONFIRM);
	}
	
	/**
	  * Just for Message of type android SNACK BAR 
	  * This a method is for wait load the SNACK BAR
	 **/
	public void waitForSnackBarMessage()
	{
		handlingWaitsToElement(SNACK_BAR_MESSAGE);
		handlingWaitsToElement(SNACK_BAR_BTN_CONFIRM);
	}
	
}