package com.belatrix.connect.framework;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.belatrix.connect.page.object.AlertErrorMessage;
import com.belatrix.connect.page.object.AlertMessageConfirmation;
import com.belatrix.connect.page.object.AlertMessageTwoOptions;
import com.belatrix.connect.page.object.EditProfilePage;
import com.belatrix.connect.page.object.ForgotPasswordPage;
import com.belatrix.connect.page.object.LoginPage;
import com.belatrix.connect.page.object.TabProfilePage;
import com.belatrix.connect.page.object.SideBarNavigation;
import com.belatrix.connect.page.object.TabLinearLayout;
import com.belatrix.connect.page.object.TabRankingPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParentScenario {
	private WebDriver driver;
	protected LoginPage loginPage;
	protected TabLinearLayout tabLinearLayout;
	protected SideBarNavigation sideBarNavigation;
	protected AlertMessageTwoOptions alertMessageTwoOptions;
	protected TabProfilePage tabProfilePage;
	protected AlertMessageConfirmation alertMessageConfirmation;
	protected AlertErrorMessage alertErrorMessage;
	protected ForgotPasswordPage forgotPasswordPage;
	protected TabRankingPage tabRankingPage;
	protected EditProfilePage editProfilePage;

	public void startAndroid() {
		String url = "http://127.0.0.1:4723/wd/hub";
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "CB5A28Q2LU");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.belatrixsf.connect");

		try {
			driver = new AndroidDriver<WebElement>(new URL(url), cap);
		} catch (Exception e) {
			System.out.println("Exepcion al momento de generar el Driver" + e);
		}
		loginPage = new LoginPage(driver);
		tabLinearLayout = new TabLinearLayout(driver);
		sideBarNavigation = new SideBarNavigation(driver);
		alertMessageTwoOptions = new AlertMessageTwoOptions(driver);
		tabProfilePage = new TabProfilePage(driver);
		alertMessageConfirmation = new AlertMessageConfirmation(driver);
		alertErrorMessage = new AlertErrorMessage(driver);
		forgotPasswordPage = new ForgotPasswordPage(driver);
		tabRankingPage = new TabRankingPage(driver);
		editProfilePage = new EditProfilePage(driver);
	}

	protected void navigateTo(String url) {
		driver.navigate().to(url);
	}

	protected void closeDriver() {
		driver.quit();
	}
}