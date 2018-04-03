package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.MenuElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

/**
 * Created by Acer on 02.04.2018.
 */
public class MenuPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterMainPage(){
        driver.get(MenuElements.URL);
    }

    public void clickMain(){
        MenuElements.MAIN.click();
    }
    public void clickRecruitment(){
        MenuElements.RECRUITMENT.click();
    }
    public void clickReferenceBooks(){
        MenuElements.REFERENCE_BOOKS.click();
    }

}
