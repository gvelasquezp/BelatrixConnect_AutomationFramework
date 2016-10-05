package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class SkillsPage extends ParentPage {

	public SkillsPage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_SIDEBAR = By
			.id("com.belatrixsf.connect:id/main_content");
	By BTN_BACK_PAGE = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By BTN_ADD_NEW_SKILL = By.
			id("com.belatrixsf.connect:id/add_skill");
	By SELECT_SKILL_OPTION = By.
			xpath("//android.widget.TextView");
}