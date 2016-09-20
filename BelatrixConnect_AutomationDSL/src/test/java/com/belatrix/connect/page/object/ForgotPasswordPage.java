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
}