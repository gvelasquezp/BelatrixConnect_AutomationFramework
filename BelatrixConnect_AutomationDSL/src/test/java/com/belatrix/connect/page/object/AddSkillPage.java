package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class AddSkillPage extends ParentPage{

	public AddSkillPage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_SIDEBAR = By
			.id("com.belatrixsf.connect:id/main_content");
	By BTN_BACK_PAGE = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By BTN_ACTION_SEARCH = By.
			id("com.belatrixsf.connect:id/action_search");
	By SELECT_SKILL_OPTION = By.
			xpath("//android.widget.TextView");
	By TXT_SEARCH_SKILL = By.
			id("com.belatrixsf.connect:id/search_term");
	By BTN_BACK_SEARCH = By.
			id("com.belatrixsf.connect:id/action_mode_close_button");
	
}