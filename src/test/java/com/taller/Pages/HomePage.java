package com.taller.Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import com.taller.Utils.Utilities;
import com.taller.Utils.Base;
import com.taller.Constants.HomeConstants;
import org.testng.Assert;

public class HomePage extends Base{
	private final Logger logger = LogManager.getLogger(HomePage.class.getName());

	// Constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Métodos
	public void validateHomePage() {
		Utilities.waitElementToClick(HomeConstants.LOGIN_OPTION);
	}
	public void clickIniciarSesionMenu() {
		Utilities.clickElement(HomeConstants.LOGIN_OPTION);
	}

	public void clickStarWithEmailOption() {
		Utilities.waitElementToClick(HomeConstants.EMAIL_OPTION);
		Utilities.clickElement(HomeConstants.EMAIL_OPTION);
	}

	public void fillEmailPassword(String email, String password) {
		Utilities.waitForElement(HomeConstants.EMAIL_INPUT);
		Utilities.sendText(HomeConstants.EMAIL_INPUT, email);
		Utilities.sendText(HomeConstants.PASSWORD_INPUT, password);
		Utilities.clickElement(HomeConstants.LOGIN_BUTTON);
	}

	public void verifyLogoutElements() {
		Utilities.waitPresence(HomeConstants.LOGOUT_BUTTON);
	}

	public void validateFailedLogin(String message) {
		String failedMessage = Utilities.getText(HomeConstants.FAILED_LOGIN_MESSAGE);
		Assert.assertEquals(message, failedMessage);
	}
}
