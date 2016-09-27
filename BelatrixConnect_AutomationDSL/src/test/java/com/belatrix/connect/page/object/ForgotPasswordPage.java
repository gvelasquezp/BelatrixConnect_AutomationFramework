package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class ForgotPasswordPage extends ParentPage{

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	By TITLE_PAGE = By.
			xpath("//android.widget.TextView[@text='New password']");
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/request_password");
	By TXT_EMAIL = By.
			id("com.belatrixsf.connect:id/email");
	By BTN_REQUEST_NEW_PASSWORD = By.
			id("com.belatrixsf.connect:id/new_password");
	
	By TITLE_PAGE_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]");
	By IMAGE_PAGE_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[1]");
	By TXT_EMAIL_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]");
	By BTN_REQUEST_NEW_PASSWORD_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]");

	/**
	  * This a method is for a request a new password 
	  * Input the email then click in a button to request a new password
	  * @param String Email
	 **/
	public void requestNewPassword(String Email)
	{
		sendKeys(TXT_EMAIL, Email);
		clickAndroidBackButton();
		click(BTN_REQUEST_NEW_PASSWORD);		
	}
	
	/**
	  * This method is for a request a new password on iOS Devices
	  * Input the email then click in a button to request a new password
	  * @param String Email
	 **/
	public void requestNewPassword_iOS(String Email)
	{
		sendKeys(TXT_EMAIL_iOS, Email);
		click(BTN_REQUEST_NEW_PASSWORD_iOS);		
	}
}