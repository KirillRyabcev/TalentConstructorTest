package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.page.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginTest {

    private WebDriver driver = WebDriverSingleton.getInstance();
    LoginPage lp = new LoginPage();

    @Test
    public void loginTest() {
        driver.get("http://testing.cld.iba.by/web/guest/home");

        WebElement searchField = driver.findElement(By.id("_58_login"));
        searchField.sendKeys("kabanov@tc.by");

        WebElement passwordField = driver.findElement(By.id("_58_password"));
        passwordField.sendKeys("welcome");

        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));
        button.sendKeys(Keys.RETURN);

        Assert.assertEquals("http://testing.cld.iba.by/web/guest/home", driver.getCurrentUrl());
    }

    @Test
    public void loginTest2(){
        lp.enterLoginPage();
        lp.typeUsername("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickLoginButton();
        Assert.assertEquals("http://testing.cld.iba.by/",driver.getCurrentUrl());
    }

    @After
    public void shutDown() {
        driver.close();
    }

}
