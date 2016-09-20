package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class EditProfilePage extends ParentPage{

	public EditProfilePage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/main_content");
	By BTN_NAVIGATE_UP = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By BTN_DONE = By.
			id("com.belatrixsf.connect:id/action_done");
	By BTN_SELECT_PICTURE = By.
			id("com.belatrixsf.connect:id/edit_image");
	By TXT_FIRST_NAME = By.
			id("com.belatrixsf.connect:id/firstName");
	By TXT_LAST_NAME = By.
			id("com.belatrixsf.connect:id/lastName");
	By TXT_SKYPE_ID = By.
			id("com.belatrixsf.connect:id/skypeId");
	By RBTN_BUENOS_AIRES = By.
			xpath("//android.widget.RadioButton[@text='Buenos Aires']");
	By RBTN_LIMA = By.
			xpath("//android.widget.RadioButton[@text='Lima']");
	By RBTN_MENDOZA = By.
			xpath("//android.widget.RadioButton[@text='Mendoza']");
	By RBTN_USA = By.
			xpath("//android.widget.RadioButton[@text='USA']");

	public void editDataProfile(String firstName, String lastName, String skypeId, String location)	{
		sendKeys(TXT_FIRST_NAME, firstName);
		clickAndroidBackButton();
		sendKeys(TXT_LAST_NAME, lastName);
		clickAndroidBackButton();
		sendKeys(TXT_SKYPE_ID, skypeId);
		clickAndroidBackButton();
		
		String locationBuenosAirestxt = getTextValue(RBTN_BUENOS_AIRES);
		String locationLimatxt = getTextValue(RBTN_LIMA);
		String locationMendozatxt = getTextValue(RBTN_MENDOZA);
		String locationUSAtxt = getTextValue(RBTN_USA);

		if(locationBuenosAirestxt.equals(location))
			click(RBTN_BUENOS_AIRES);
		else if (locationLimatxt.equals(location))
			click(RBTN_LIMA);
		else if (locationMendozatxt.equals(location))
			click(RBTN_MENDOZA);
		else if (locationUSAtxt.equals(location))
			click(RBTN_USA);
	}
	
	public void finishTheEditionProfile()
	{
		click(BTN_DONE);
	}
}