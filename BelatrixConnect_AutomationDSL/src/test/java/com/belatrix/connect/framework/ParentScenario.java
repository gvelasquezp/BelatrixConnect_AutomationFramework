package com.belatrix.connect.framework;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.belatrix.connect.page.object.LoginPage;
import com.belatrix.connect.page.object.SideBarNavigation;
import com.belatrix.connect.page.object.TabLinearLayout;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParentScenario {
	private WebDriver driver;
	//Create Object from the pages 
	protected LoginPage loginPage;
	protected TabLinearLayout tabLinearLayout;
	protected SideBarNavigation sideBarNavigation;

	public void startBrowser() {
		String url = null;
		url = "String conexion con el cel";

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "4d00020ee5c03051ni");
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.etermax.preguntados.lite");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");

		try {
			driver = new AndroidDriver<WebElement>(new URL(url), cap);
		} catch (Exception e) {
			System.out.println("Exepcion al momento de generar el Driver" + e);
		}
		//Instants the Objects Page
		loginPage = new LoginPage(driver);
		tabLinearLayout = new TabLinearLayout(driver);
		sideBarNavigation = new SideBarNavigation(driver);
	}

	protected void navigateTo(String url) {
		driver.navigate().to(url);
	}

	protected void closeDriver() {
		driver.quit();
	}
}