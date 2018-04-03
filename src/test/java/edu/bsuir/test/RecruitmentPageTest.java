package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.Login;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Acer on 30.03.2018.
 */
public class RecruitmentPageTest {

    private WebDriver driver = WebDriverSingleton.getInstance();

    @Before
    public void login() throws Exception{
        Login l = new Login();
        l.login("Начальник отдела");
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
