package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.belatrix.connect.framework.ParentPage;

public class LoginPage extends ParentPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	By TITLE_PAGE = By
			.xpath("//android.widget.TextView[@text='Belatrix Connect']");
	By LOGIN_PAGE = By.
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

	/**
	  * This a method is for log In APP
	  * @param String UserName
	  * @param String password
	 **/
	public void loginOnApp(String userName, String password) throws Throwable 
	{
		sendKeys(TXT_USER_NAME, userName);
		sendKeys(TXT_PASSWORD, password);
		clickAndroidBackButton();
		click(BTN_LOGIN);
	}
	
	/**
	  * This a method is for go back on APP or Android System
	 **/
	public void forgotPasswordOption()
	{
		click(HLNK_FORGOT_PASSWORD);
	}
	
	/**
	  * This a method is for Assert if the Page login was initiate successfully
	 **/
	public void assertExistLoginPage()
	{
		Assert.assertNotSame(TITLE_PAGE, null, "Page Login is found");
	} 
	
	/**
	  * This a method is for Assert if the Page login was initiate badly
	 **/
	public void assertNotExistLoginPage()
	{
		Assert.assertEquals(TITLE_PAGE, null, "Page Login is not found");
	} 
	
	/**
	  * This a method is for wait for a login page load
	 **/
	public void loadPageSuccessfully()
	{
		handlingWaitsToElement(LOGIN_PAGE);
	}

}
