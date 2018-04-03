package edu.bsuir.web.element;

import edu.bsuir.element.Element;
import org.openqa.selenium.By;

/**
 * Created by Acer on 02.04.2018.
 */
public class ApplicationElements {

    public static final String URL = "http://testing.cld.iba.by/web/guest/recruiting/applications/-/applications/createApplication";

    public static final Element POSITION = new Element("Должность",By.xpath("//*[@id=\"name\"]"));
    public static final Element DATE = new Element("Дата закрытия",By.xpath("//*[@id=\"plannedClosingDate\"]"));
    public static final Element PRIORITY = new Element("Приоритет",By.xpath("//*[@id=\"priority-1\"]"));
    public static final Element QUANTITY = new Element("Количество работников",By.xpath("//*[@id=\"quantity\"]"));
    public static final Element CREATION_REASON = new Element("Причина создания",By.xpath("//*[@id=\"creationReason\"]"));
    public static final Element CONTRACT_TYPE = new Element("Тип договора",By.xpath("//*[@id=\"contractType-2\"]"));
    public static final Element SALARY = new Element("Зарплата",By.xpath("//*[@id=\"salary\"]"));
    public static final Element CURRENCY = new Element("Валюта",By.xpath("//*[@id=\"currency\"]"));
    public static final Element JOBTYPE = new Element("Тип занятости",By.xpath("//*[@id=\"jobType\"]"));
    public static final Element EMPLOYEES = new Element("Наличие подчиненных",By.xpath("//*[@id=\"employees\"]"));
    public static final Element BUSINESS_TRIP = new Element("Командировки",By.xpath("//*[@id=\"businessTrip\"]"));
    public static final Element TIMETABLE = new Element("Расписание",By.xpath("//*[@id=\"timetable\"]"));
    public static final Element PROBATION_PERIOD = new Element("Испытательный срок",By.xpath("//*[@id=\"probationPeriod\"]"));
    public static final Element RESPONSIBILITIES = new Element("Обязанности",By.xpath("//*[@id=\"responsibilities\"]"));
    public static final Element CANDIDATE_TYPE = new Element("Тип кандидата",By.xpath("//*[@id=\"candidateTypeExternal\"]"));
    public static final Element EDUCATION = new Element("Образование",By.xpath("//*[@id=\"education\"]"));
    public static final Element EDUCATION_SPECIALIZATION = new Element("Требуемое образование",By.xpath("//*[@id=\"educationSpecialization\"]"));
    public static final Element EXPERIENCE = new Element("Опыт работы",By.xpath("//*[@id=\"experience\"]"));
    public static final Element PRIORITY_WORKING_EXPERIENCE = new Element("Желательные организации",By.xpath("//*[@id=\"priority.working.experience\"]"));
    public static final Element UNDESIRABLE_WORKING_EXPERIENCE = new Element("Нежелательные организации",By.xpath("//*[@id=\"undesirableWorkingExperience\"]"));
    public static final Element REQUIRED_COMPETENCES = new Element("Требуемы компетенции",By.xpath("//*[@id=\"editrequiredCompetence\"]"));
    public static final Element FIND_BUTTON = new Element("Кнопка поиска",By.xpath("//*[@class=\"multiselect dropdown-toggle btn btn-default\"]"));
    public static final Element PROGRAMMER_CHECKBOX = new Element("Программист Чекбокс",By.xpath("//*[@id=\"func-area-filtermultiselect-3\"]"));
    public static final Element SUBDITEM = new Element("СУБД",By.xpath("//*[@id=\"category_34\"]"));
    public static final Element MARIADBITEM = new Element("MARIADB",By.xpath("//*[@id=\"competence_1515\"]"));
    public static final Element OKBUTTON  = new Element("OK",By.xpath("//*[@class=\"toolbar-content yui3-widget component toolbar\"]/button[2]"));
    public static final Element REQUIRED_ITEM = new Element("Желательные компетенции",By.xpath("//*[@id=\"editnotRequiredCompetence\"]"));
    public static final Element MYSQLITEM  = new Element("MYSQL",By.xpath("//*[@id=\"competence_196\"]"));
    public static final Element COMMENT = new Element("Комментарий",By.xpath("//*[@id=\"comment\"]"));
    public static final Element SAVE  = new Element("Сохранить",By.xpath("//*[@id=\"save\"]"));

}
