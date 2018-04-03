package edu.bsuir.web.element;

import edu.bsuir.element.Element;
import org.openqa.selenium.By;

/**
 * Created by Acer on 02.04.2018.
 */
public class MenuElements {
    public static final String URL = "http://testing.cld.iba.by/web/guest/home";

    public static final Element MAIN = new Element("Главная страница",By.xpath("//*[@id=\"layout_1\"]"));
    public static final Element RECRUITMENT = new Element("Страница 'Подбор и адаптация'",By.xpath("//*[@id=\"layout_2\"]"));
    public static final Element REFERENCE_BOOKS = new Element("Страница справочники",By.xpath("//*[@id=\"layout_9\"]"));
}
