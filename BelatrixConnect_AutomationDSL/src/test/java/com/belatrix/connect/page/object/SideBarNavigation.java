package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class SideBarNavigation  extends ParentPage {
	
	public SideBarNavigation (WebDriver driver){
		super(driver);
	}

	By CONTAINER_SIDEBAR = By
			.id("com.belatrixsf.connect:id/design_navigation_view");
	By USER_FULL_NAME = By.
			id("com.belatrixsf.connect:id/full_name");
	By USER_EMAIL = By.
			id("com.belatrixsf.connect:id/email");
	By HOME_OPTION = By.
			xpath("//android.widget.CheckedTextView[@text='Home']");
	By CONTACTS_OPTION = By.
			xpath("//android.widget.CheckedTextView[@text='Contacts']");
	By EVENTS_OPTION = By.
			xpath("//android.widget.CheckedTextView[@text='Events']");
	By ABOUT_OPTION = By.
			xpath("//android.widget.CheckedTextView[@text='About']");
	By SETTINGS_OPTION = By.
			xpath("//android.widget.CheckedTextView[@text='Settings']");
	By LOGOUT_OPTION = By.
			id("com.belatrixsf.connect:id/menu_logout");
	
	/**
	  * This a method let me logout of my current session
	 **/
	public void logOutUserSession()
	{
		click(LOGOUT_OPTION);
	}
	
	/**
	  * This a method do a click on Contacts Option
	 **/
	public void clickContactsOption()
	{
		click(CONTACTS_OPTION);
	}
}