package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.page.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Acer on 02.04.2018.
 */
public class MenuTest {
    private WebDriver driver = WebDriverSingleton.getInstance();
    MenuPage mp = new MenuPage();

    @Before
    public void login() throws InterruptedException{
        driver.get("http://testing.cld.iba.by/");

        WebElement searchField = driver.findElement(By.id("_58_login"));
        searchField.sendKeys("kabanov@tc.by");

        WebElement passwordField = driver.findElement(By.id("_58_password"));
        passwordField.sendKeys("welcome");

        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));
        button.sendKeys(Keys.RETURN);
    }

    @Test
    public void testMenu() throws InterruptedException{
        Thread.sleep(5000);
        mp.enterMainPage();
        Thread.sleep(5000);
        mp.clickMain();
        Assert.assertEquals("http://testing.cld.iba.by/web/guest/home",driver.getCurrentUrl());
        mp.clickRecruitment();
        Assert.assertEquals("http://testing.cld.iba.by/web/guest/recruiting",driver.getCurrentUrl());
        mp.clickReferenceBooks();
        Assert.assertEquals("http://testing.cld.iba.by/web/guest/directories",driver.getCurrentUrl());
    }
}
