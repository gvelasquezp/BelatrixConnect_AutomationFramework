package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.belatrix.connect.framework.ParentPage;

public class TabRankingPage extends ParentPage{

	public TabRankingPage(WebDriver driver) {
		super(driver);
	}
	
	By CONTAINER_PAGE = By.
			id("com.belatrixsf.connect:id/fragment_ranking_container");
	By BTN_SIDEBAR = By.
			xpath("//android.widget.ImageButton[@index='0']");
	By TXT_CONTACT_FULLNAME = By.
			id("com.belatrixsf.connect:id/contact_full_name");
	By CURRENT_MONTH_RANKING = By.
			xpath("//android.widget.TextView[@text='Last Month']");
	By LAST_MOTH_RANKING = By.
			xpath("//android.widget.TextView[@text='Current Month']");
	By ALL_TIME_RANKING = By.
			xpath("//android.widget.TextView[@text='All Time']");
	
	public void viewLastMonthRanking()
	{
		click(LAST_MOTH_RANKING);
	}
	
	public void viewAllTimeRanking()
	{
		click(ALL_TIME_RANKING);
	}
}