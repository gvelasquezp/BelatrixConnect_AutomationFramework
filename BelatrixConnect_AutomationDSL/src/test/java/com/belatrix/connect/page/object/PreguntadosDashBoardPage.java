package com.belatrix.connect.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.belatrix.connect.framework.ParentPage;

public class PreguntadosDashBoardPage extends ParentPage {

	public PreguntadosDashBoardPage(WebDriver driver) {
		super(driver);
	}

	By BUTTON_NEW_GAME_ID = By.id("com.etermax.preguntados.lite:id/new_game_button");

	public void clickOnTheButtonNewGame() {

		try {
			Thread.sleep(15000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		click(BUTTON_NEW_GAME_ID);
	}

}
