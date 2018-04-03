package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.Login;
import edu.bsuir.web.page.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Acer on 02.04.2018.
 */
public class MenuTest{
    private WebDriver driver = WebDriverSingleton.getInstance();
    MenuPage mp = new MenuPage();

    @Before
    public void login() throws Exception{
        Login l = new Login();
        l.login("Начальник отдела");
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
