package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by Acer on 30.03.2018.
 */
public class RecruitmentPageTest {

    private WebDriver driver = WebDriverSingleton.getInstance();

    @Before
    public void login() {
        driver.get("http://testing.cld.iba.by/web/guest/home");

        WebElement searchField = driver.findElement(By.id("_58_login"));
        searchField.sendKeys("kabanov@tc.by");

        WebElement passwordField = driver.findElement(By.id("_58_password"));
        passwordField.sendKeys("welcome");

        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));
        button.sendKeys(Keys.RETURN);
    }

    @Test
    public void recruitmentPageTest() throws InterruptedException{
        Thread.sleep(5000);
        WebElement recruitButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/nav/ul/li[2]/a"));
        recruitButton.click();
        Assert.assertEquals("Подбор и адаптация - Конструктор Талантов", driver.getTitle());
    }

    @After
    public void shutDown() {
        driver.close();
    }

}
