package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class LoginPage extends ParentPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/login");
	By TXT_USER_NAME = By.
			id("com.belatrixsf.connect:id/username");
	By TXT_PASSWORD = By.
			id("com.belatrixsf.connect:id/password");
	By BTN_LOGIN = By.
			id("com.belatrixsf.connect:id/log_in");
	By HLNK_FORGOT_PASSWORD = By.
			id("com.belatrixsf.connect:id/forgot_password");
	By HLNK_NEW_USER = By.
			id("com.belatrixsf.connect:id/sign_up");
	
	By CONTAINER_PAGE_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[1]");
	By TXT_USER_NAME_iOS = By.
			xpath(" //UIAApplication[1]/UIAWindow[1]/UIATextField[1]");
	By TXT_PASSWORD_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]");
	By BTN_LOGIN_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]");
	By BTN_LOGIN_AS_GUEST_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]");
	By HLNK_FORGOT_PASSWORD_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]");
	By HLNK_NEW_USER_iOS = By.
			xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]");

	/**
	  * This a method is for log In APP
	  * @param String UserName
	  * @param String password
	 **/
	public void loginOnApp(String userName, String password)
	{
		sendKeys(TXT_USER_NAME, userName);
		sendKeys(TXT_PASSWORD, password);
		clickAndroidBackButton();
		click(BTN_LOGIN);
	}
	
	/**
	  * This method is for log In APP on iOS Devices
	  * @param String UserName
	  * @param String password
	 **/
	public void loginOnApp_iOS(String userName, String password)
	{
		sendKeys(TXT_USER_NAME_iOS, userName);
		sendKeys(TXT_PASSWORD_iOS, password);
		click(BTN_LOGIN_iOS);
	}
	
	/**
	  * This a method is for go back on APP or Android System
	 **/
	public void forgotPasswordOption()
	{
		click(HLNK_FORGOT_PASSWORD);
	}
	
	/**
	  * This method is for go to forgot Password on iOS Devices
	 **/
	public void forgotPasswordOption_iOS()
	{
		click(CONTAINER_PAGE_iOS);
		click(HLNK_FORGOT_PASSWORD_iOS);
	}
	
	/**
	  * This a method is for wait for a login page load
	 **/
	public void loadPageSuccessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
	}
	
	/**
	  * This method is for wait for a login page load on iOS Devices
	 **/
	public void loadPageSuccessfully_iOS()
	{
		handlingWaitsToElement(CONTAINER_PAGE_iOS);
	}
}