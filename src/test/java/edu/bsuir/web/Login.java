package edu.bsuir.web;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.parser.ParseData;
import edu.bsuir.web.page.LoginPage;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

/**
 * Created by Acer on 03.04.2018.
 */
public class Login {
    public void login(String role) throws Exception{
        LoginPage lp = new LoginPage();
        ParseData pd = new ParseData();
        lp.enterLoginPage();
        ArrayList<String> loginAndPassword= pd.getData(role);
        lp.typeUsername(loginAndPassword.get(0));
        lp.typePassword(loginAndPassword.get(1));
        lp.clickLoginButton();
    }
}
