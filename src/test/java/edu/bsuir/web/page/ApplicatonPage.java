package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.ApplicationElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
        WebElement element = driver.findElement(ApplicationElements.POSITION);
        element.clear();
        element.sendKeys(position);
    }
    public void typeDate(String date){
        WebElement element = driver.findElement(ApplicationElements.DATE);
        element.clear();
        element.sendKeys(date);
    }
    public void clickPriority(){
        WebElement element = driver.findElement(ApplicationElements.PRIORITY);
        element.click();
    }
    public void typeQuantity(String quantity){
        WebElement element = driver.findElement(ApplicationElements.QUANTITY);
        element.clear();
        element.sendKeys(quantity);
    }
    public void typeCreationReason(String reason){
        WebElement element = driver.findElement(ApplicationElements.CREATION_REASON);
        element.clear();
        element.sendKeys(reason);
    }
    public void clickContractType(){
        WebElement element = driver.findElement(ApplicationElements.CONTRACT_TYPE);
        element.click();
    }
    public void typeSalary(String salary){
        WebElement element = driver.findElement(ApplicationElements.SALARY);
        element.clear();
        element.sendKeys(salary);
    }
    public void clickCurrency(){
        WebElement element = driver.findElement(ApplicationElements.CURRENCY);
        element.click();
    }
    public void clickCurrencyOption(){
        WebElement element = driver.findElement(ApplicationElements.CURRENCY_OPTION);
        element.click();
    }
    public void clickJobType(){
        WebElement element = driver.findElement(ApplicationElements.JOBTYPE);
        element.click();
    }
    public void clickJobTypeOption(){
        WebElement element = driver.findElement(ApplicationElements.JOBTYPE_OPTION);
        element.click();
    }
    public void typeEmployees(String employees){
        WebElement element = driver.findElement(ApplicationElements.EMPLOYEES);
        element.clear();
        element.sendKeys(employees);
    }
    public void typeBusinessTrip(String trip){
        WebElement element = driver.findElement(ApplicationElements.BUSINESS_TRIP);
        element.clear();
        element.sendKeys(trip);
    }
    public void typeTimetable(String timetable){
        WebElement element = driver.findElement(ApplicationElements.TIMETABLE);
        element.clear();
        element.sendKeys(timetable);
    }
    public void typeProbationPeriod(String period){
        WebElement element = driver.findElement(ApplicationElements.PROBATION_PERIOD);
        element.clear();
        element.sendKeys(period);
    }
    public void typeResponsibilities(String responsibilities){
        WebElement element = driver.findElement(ApplicationElements.RESPONSIBILITIES);
        element.clear();
        element.sendKeys(responsibilities);
    }
    public void clickCandidateType(){
        WebElement element = driver.findElement(ApplicationElements.CANDIDATE_TYPE);
        element.click();
    }
    public void clickEducation(){
        WebElement element = driver.findElement(ApplicationElements.EDUCATION);
        element.click();
    }
    public void clickEducationOption(){
        WebElement element = driver.findElement(ApplicationElements.EDUCATION_OPTION);
        element.click();
    }
    public void typeRequiredEducation(String education){
        WebElement element = driver.findElement(ApplicationElements.EDUCATION_SPECIALIZATION);
        element.clear();
        element.sendKeys(education);
    }
    public void clickExperience(){
        WebElement element = driver.findElement(ApplicationElements.EXPERIENCE);
        element.click();
    }
    public void clickExperienceOption(){
        WebElement element = driver.findElement(ApplicationElements.EXPERIENCE_OPTION);
        element.click();
    }
    public void typeDesirableOrganization(String organizations){
        WebElement element = driver.findElement(ApplicationElements.PRIORITY_WORKING_EXPERIENCE);
        element.clear();
        element.sendKeys(organizations);
    }
    public void typeUnesirableOrganization(String organizations){
        WebElement element = driver.findElement(ApplicationElements.UNDESIRABLE_WORKING_EXPERIENCE);
        element.clear();
        element.sendKeys(organizations);
    }
    public void clickRequiredCompetence(){
        WebElement element = driver.findElement(ApplicationElements.REQUIRED_COMPETENCES);
        element.click();
    }
    public void clickFindButton(){
        WebElement element = driver.findElement(ApplicationElements.FIND_BUTTON);
        element.click();
    }
    public void clickProgrammersCheckbox(){
        WebElement element = driver.findElement(ApplicationElements.PROGRAMMER_CHECKBOX);
        element.click();
    }
    public void clickSubdItem(){
        WebElement element = driver.findElement(ApplicationElements.SUBDITEM);
        element.click();
    }
    public void clickMariaDBItem(){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(ApplicationElements.MARIADBITEM);
        action.moveToElement(element).perform();
        action.doubleClick(element).perform();
    }
    public void clickOkButton(){
        WebElement element = driver.findElement(ApplicationElements.OKBUTTON);
        element.click();
    }
    public void clickDesiredCompetance(){
        WebElement element = driver.findElement(ApplicationElements.REQUIRED_ITEM);
        element.click();
    }
    public void clickMySQLItem(){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(ApplicationElements.MYSQLITEM);
        action.moveToElement(element).perform();
        action.doubleClick(element).perform();
    }
    public void typeComment(String comment){
        WebElement element = driver.findElement(ApplicationElements.COMMENT);
        element.clear();
        element.sendKeys(comment);
    }
    public void clickSave(){
        WebElement element = driver.findElement(ApplicationElements.SAVE);
        element.click();
    }

}
