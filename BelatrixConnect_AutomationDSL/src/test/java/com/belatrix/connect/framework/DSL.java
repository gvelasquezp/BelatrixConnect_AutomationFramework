package com.belatrix.connect.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class DSL {

	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @param locator
	 **/
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	/**
	  * This a method for send text to Web Element
	  * @param By locator
	  * @param String textToSend
	 **/
	public void sendKeys(By locator, String textToSend){
		driver.findElement(locator).sendKeys(textToSend);
	}
	
	/**
	  * This a method for click on Android back button
	 **/
	public void clickAndroidBackButton(){
		driver.navigate().back(); 
	}

}
