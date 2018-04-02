package edu.bsuir.web.element;

import org.openqa.selenium.By;

/**
 * Created by Acer on 02.04.2018.
 */
public class ApplicationElements {

    public static final String URL = "http://testing.cld.iba.by/web/guest/recruiting/applications/-/applications/createApplication";

    public static final By POSITION = By.xpath("//*[@id=\"name\"]");
    public static final By DATE = By.xpath("//*[@id=\"plannedClosingDate\"]");
    public static final By PRIORITY = By.xpath("//*[@id=\"priority-1\"]");
    public static final By QUANTITY = By.xpath("//*[@id=\"quantity\"]");
    public static final By CREATION_REASON = By.xpath("//*[@id=\"creationReason\"]");
    public static final By CONTRACT_TYPE = By.xpath("//*[@id=\"contractType-2\"]");
    public static final By SALARY = By.xpath("//*[@id=\"salary\"]");
    public static final By CURRENCY = By.xpath("//*[@id=\"currency\"]");
    public static final By CURRENCY_OPTION = By.xpath("//*[@id=\"currency\"]/option[3]");
    public static final By JOBTYPE = By.xpath("//*[@id=\"jobType\"]");
    public static final By JOBTYPE_OPTION = By.xpath("//*[@id=\"jobType\"]/option[2]");
    public static final By EMPLOYEES = By.xpath("//*[@id=\"employees\"]");
    public static final By BUSINESS_TRIP = By.xpath("//*[@id=\"businessTrip\"]");
    public static final By TIMETABLE = By.xpath("//*[@id=\"timetable\"]");
    public static final By PROBATION_PERIOD = By.xpath("//*[@id=\"probationPeriod\"]");
    public static final By RESPONSIBILITIES = By.xpath("//*[@id=\"responsibilities\"]");
    public static final By CANDIDATE_TYPE = By.xpath("//*[@id=\"candidateTypeExternal\"]");
    public static final By EDUCATION = By.xpath("//*[@id=\"education\"]");
    public static final By EDUCATION_OPTION = By.xpath("//*[@id=\"education\"]/option[4]");
    public static final By EDUCATION_SPECIALIZATION = By.xpath("//*[@id=\"educationSpecialization\"]");
    public static final By EXPERIENCE = By.xpath("//*[@id=\"experience\"]");
    public static final By EXPERIENCE_OPTION = By.xpath("//*[@id=\"experience\"]/option[1]");
    public static final By PRIORITY_WORKING_EXPERIENCE = By.xpath("//*[@id=\"priority.working.experience\"]");
    public static final By UNDESIRABLE_WORKING_EXPERIENCE = By.xpath("//*[@id=\"undesirableWorkingExperience\"]");
    public static final By REQUIRED_COMPETENCES = By.xpath("//*[@id=\"editrequiredCompetence\"]");
    public static final By FIND_BUTTON = By.xpath("//*[@class=\"multiselect dropdown-toggle btn btn-default\"]");
    public static final By PROGRAMMER_CHECKBOX = By.xpath("//*[@id=\"func-area-filtermultiselect-3\"]");
    public static final By SUBDITEM = By.xpath("//*[@id=\"category_34\"]");
    public static final By MARIADBITEM = By.xpath("//*[@id=\"competence_1515\"]");
    public static final By OKBUTTON  = By.xpath("//*[@class=\"toolbar-content yui3-widget component toolbar\"]/button[2]");
    public static final By REQUIRED_ITEM = By.xpath("//*[@id=\"editnotRequiredCompetence\"]");
    public static final By MYSQLITEM  = By.xpath("//*[@id=\"competence_196\"]");
    public static final By COMMENT = By.xpath("//*[@id=\"comment\"]");
    public static final By SAVE  = By.xpath("//*[@id=\"save\"]");

}
