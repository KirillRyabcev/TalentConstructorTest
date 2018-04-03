package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.element.Element;
import edu.bsuir.web.element.ApplicationElements;
import edu.bsuir.web.element.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

/**
 * Created by Acer on 02.04.2018.
 */
public class ApplicatonPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterApplicationPage(){
        driver.get(ApplicationElements.URL);
    }

    public void typePosition(String position){
        ApplicationElements.POSITION.type(position);
    }
    public void typeDate(String date){
        ApplicationElements.DATE.type(date);
    }
    public void clickPriority(){
        ApplicationElements.PRIORITY.click();
    }
    public void typeQuantity(String quantity){
        ApplicationElements.QUANTITY.type(quantity);
    }
    public void typeCreationReason(String reason){
        ApplicationElements.CREATION_REASON.type(reason);
    }
    public void clickContractType(){
        ApplicationElements.CONTRACT_TYPE.click();
    }
    public void typeSalary(String salary){
        ApplicationElements.SALARY.type(salary);
    }
    public void selectCurrencyByText(String value){
        Select select = new Select(ApplicationElements.CURRENCY.getWebElement());
        select.selectByVisibleText(value);
    }
    public void selectJobTypeByValue(String value){
        Select select = new Select(ApplicationElements.JOBTYPE.getWebElement());
        select.selectByValue(value);
    }
    public void typeEmployees(String employees){
        ApplicationElements.EMPLOYEES.type(employees);
    }
    public void typeBusinessTrip(String trip){
        ApplicationElements.BUSINESS_TRIP.type(trip);
    }
    public void typeTimetable(String timetable){
        ApplicationElements.TIMETABLE.type(timetable);
    }
    public void typeProbationPeriod(String period){
        ApplicationElements.PROBATION_PERIOD.type(period);
    }
    public void typeResponsibilities(String responsibilities){
        ApplicationElements.RESPONSIBILITIES.type(responsibilities);
    }
    public void clickCandidateType(){
        ApplicationElements.CANDIDATE_TYPE.click();
    }
    public void selectEducationByText(String value){
        Select select = new Select(ApplicationElements.EDUCATION.getWebElement());
        select.selectByVisibleText(value);
    }
    public void typeRequiredEducation(String education){
        ApplicationElements.EDUCATION_SPECIALIZATION.type(education);
    }
    public void selectExperienceByText(String value){
        Select select = new Select(ApplicationElements.EXPERIENCE.getWebElement());
        select.selectByVisibleText(value);
    }
    public void typeDesirableOrganization(String organizations){
        ApplicationElements.PRIORITY_WORKING_EXPERIENCE.type(organizations);
    }
    public void typeUnesirableOrganization(String organizations){
        ApplicationElements.UNDESIRABLE_WORKING_EXPERIENCE.type(organizations);
    }
    public void clickRequiredCompetence(){
        ApplicationElements.REQUIRED_COMPETENCES.click();
    }
    public void clickFindButton(){
        ApplicationElements.FIND_BUTTON.click();
    }
    public void clickProgrammersCheckbox(){
        ApplicationElements.PROGRAMMER_CHECKBOX.click();
    }
    public void clickSubdItem(){
        ApplicationElements.SUBDITEM.click();
    }
    public void clickMariaDBItem(){
        ApplicationElements.MARIADBITEM.moveToElement();
        ApplicationElements.MARIADBITEM.doubleClick();;
    }
    public void clickOkButton(){
        ApplicationElements.OKBUTTON.click();
    }
    public void clickDesiredCompetance(){
        ApplicationElements.REQUIRED_ITEM.click();
    }
    public void clickMySQLItem(){
        ApplicationElements.MYSQLITEM.moveToElement();
        ApplicationElements.MYSQLITEM.doubleClick();
    }
    public void typeComment(String comment){
        ApplicationElements.COMMENT.type(comment);
    }
    public void clickSave(){
        ApplicationElements.SAVE.click();
    }

}
