package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.parser.ParseData;
import edu.bsuir.web.page.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;


public class LoginTest {

    private WebDriver driver = WebDriverSingleton.getInstance();
    LoginPage lp = new LoginPage();
    ParseData pd = new ParseData();


    @Test
    public void loginTest() throws Exception{
        lp.enterLoginPage();
        ArrayList<String> loginAndPassword= pd.getData("Генеральный директор");
        lp.typeUsername(loginAndPassword.get(0));
        lp.typePassword(loginAndPassword.get(1));
        lp.clickLoginButton();
        Assert.assertEquals("http://testing.cld.iba.by/",driver.getCurrentUrl());
    }

    //@After
    //public void shutDown() {
    //    driver.close();
    //}

}
