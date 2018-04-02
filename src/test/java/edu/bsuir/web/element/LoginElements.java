package edu.bsuir.web.element;

import org.openqa.selenium.By;

/**
 * Created by Acer on 02.04.2018.
 */
public class LoginElements {
    public static final String URL = "http://testing.cld.iba.by";
    public static final By USERNAME = By.id("_58_login");
    public static final By PASSWORD = By.id("_58_password");
    public static final By LOGIN_BUTTON = By.xpath("//div[@class='button-holder ']//button");

    public static By getLoginButton(String name){
        return By.xpath("//button[text()=' " + name + " ']");
    }
}
