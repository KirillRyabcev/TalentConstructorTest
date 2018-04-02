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
        WebElement element = driver.findElement(MenuElements.MAIN);
        element.click();
    }
    public void clickRecruitment(){
        WebElement element = driver.findElement(MenuElements.RECRUITMENT);
        element.click();
    }
    public void clickReferenceBooks(){
        WebElement element = driver.findElement(MenuElements.REFERENCE_BOOKS);
        element.click();
    }

}
