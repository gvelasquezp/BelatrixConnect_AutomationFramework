package com.belatrix.connect.framework;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.belatrix.connect.page.object.AlertErrorMessage;
import com.belatrix.connect.page.object.AlertMessageConfirmation;
import com.belatrix.connect.page.object.AlertMessageTwoOptions;
import com.belatrix.connect.page.object.ContactProfilePage;
import com.belatrix.connect.page.object.EditProfilePage;
import com.belatrix.connect.page.object.ForgotPasswordPage;
import com.belatrix.connect.page.object.FoundTopTagPage;
import com.belatrix.connect.page.object.GiveRecommendationPage;
import com.belatrix.connect.page.object.LoginPage;
import com.belatrix.connect.page.object.SelectAnUserPage;
import com.belatrix.connect.page.object.SelectCategoryPage;
import com.belatrix.connect.page.object.SelectSubCategoryPage;
import com.belatrix.connect.page.object.SelectTagPage;
import com.belatrix.connect.page.object.SideBarNavigation;
import com.belatrix.connect.page.object.TabLinearLayout;
import com.belatrix.connect.page.object.TabProfilePage;
import com.belatrix.connect.page.object.TabRankingPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import com.belatrix.connect.page.object.TabTopTagPage;
import com.belatrix.connect.page.object.WriteCommentPage;


public class ParentScenario {
	private WebDriver driver;
	protected static LoginPage loginPage;
	protected static TabLinearLayout tabLinearLayout;
	protected static SideBarNavigation sideBarNavigation;
	protected static AlertMessageTwoOptions alertMessageTwoOptions;
	protected static TabProfilePage tabProfilePage;
	protected static AlertMessageConfirmation alertMessageConfirmation;
	protected static AlertErrorMessage alertErrorMessage;
	protected static ForgotPasswordPage forgotPasswordPage;
	protected static TabRankingPage tabRankingPage;
	protected static EditProfilePage editProfilePage;
	protected static SelectAnUserPage selectAnUserPage;
	protected static ContactProfilePage contactProfilePage;
	protected static TabTopTagPage tabTopTagPage;
	protected static FoundTopTagPage foundTopTagPage;
	protected static GiveRecommendationPage giveRecommendationPage;
	protected static SelectCategoryPage selectCategoryPage;
	protected static SelectSubCategoryPage selectSubCategoryPage;
	protected static WriteCommentPage writeCommentPage;
	protected static SelectTagPage selectTagPage;

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
		selectAnUserPage = new SelectAnUserPage(driver);
		contactProfilePage = new ContactProfilePage(driver);
		tabTopTagPage = new TabTopTagPage(driver);
		foundTopTagPage = new FoundTopTagPage(driver);
		giveRecommendationPage = new GiveRecommendationPage(driver);
		selectCategoryPage = new SelectCategoryPage(driver);
		selectSubCategoryPage = new SelectSubCategoryPage(driver);
		writeCommentPage = new WriteCommentPage(driver);
		selectTagPage = new SelectTagPage(driver);
	}
	
	public void startiOS() {
		String url = "http://127.0.0.1:4723/wd/hub";
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "CB5A28Q2LU");

		try {
			driver = new IOSDriver<WebElement>(new URL(url), cap);
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