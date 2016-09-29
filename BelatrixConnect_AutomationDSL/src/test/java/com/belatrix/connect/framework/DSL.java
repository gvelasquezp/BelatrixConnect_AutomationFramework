package com.belatrix.connect.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class DSL {

	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method use for send click to Element
	 * @param By locator
	 **/
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	/**
	  * This a method for send text to Element
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
	
	/**
	  * This a method obtain the Text of any Component
	  * @param By locator
	 **/
	public String getTextValue(By locator)
	{
		return driver.findElement(locator).getText();
	}
	
	/**
	  * This a method clear the Text value of any Component
	  * @param By locator
	 **/
	public void clearTextValue(By locator)
	{
		driver.findElement(locator).clear();
	}
	
	/**
	  * This a method wait for a component
	  * @param By locator
	 **/
	public void handlingWaitsToElement(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	  * This a method wait for a component with any Variable Text
	  * this method is only for locator type xpath
	  * @param By locator
	  * @param String Text
	 **/
	public void handlingWaitsToNewElementByText(By locator, String textValue)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		By newLocator = By.xpath(locator.toString().replaceAll("(By.xpath: )|(\\[@text.*?\\])", "")
				+ "[@text='"+textValue+"']");
		wait.until(ExpectedConditions.presenceOfElementLocated(newLocator));
	}
	
	/**
	  * This a method for do a click on one element with a specific text
	  * this method contain a handling wait by new element
	  * this method is only for locator type xpath
	  * @param By locator
	  * @param String textValue
	 **/
	public void clickElementByTextValue(By locator, String textValue)
	{
		By newLocator = By.xpath(locator.toString().replaceAll("(By.xpath: )|(\\[@text.*?\\])", "")
				+ "[@text='"+textValue+"']");
		handlingWaitsToElement(newLocator);
		click(newLocator);
	}

}