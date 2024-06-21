package com.taller.Constants;

import org.openqa.selenium.By;

public class HomeConstants {

    public static final By REGISTER_OPTION = By.xpath("//a[@href='register.php']");

    public static final By LOGIN_OPTION = By.xpath("//button[@class='LoginButton-button']");
    public static final By EMAIL_OPTION = By.id("EmailLoginButton");
    public static final By EMAIL_INPUT = By.name("email");
    public static final By PASSWORD_INPUT = By.name("password");
    public static final By LOGIN_BUTTON = By.xpath("//button[@class='LoginForm-submit']");
    public static final By LOGOUT_BUTTON = By.xpath("//li[@class='LoginButton-logout']");
    public static final By FAILED_LOGIN_MESSAGE = By.xpath("//span[contains(text(),'El usuario o la contraseña son incorrectos')]");
}

