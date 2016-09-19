package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class MainProfilePage extends ParentPage{

	public MainProfilePage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/main_view_pager");
	By BTN_SIDEBAR = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By TITLE_PAGE = By.
			xpath("//android.widget.TextView[@text='Belatrix Connect']");
	By BTN_EDIT = By.
			id("com.belatrixsf.connect:id/action_edit_profile");
	
	/**
	  * This a method is for do click to open the SideBar
	 **/
	public void openMenuSideBar() 
	{
		click(BTN_SIDEBAR);
	}
	
	/**
	  * This a method is for wait to load the Main Profile Page
	 **/
	public void loadPageSucessfully()
	{
		handlingWaitsToElement(CONTAINER_PAGE);
	}

}
