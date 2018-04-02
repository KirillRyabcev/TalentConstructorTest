package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.page.ApplicatonPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Acer on 30.03.2018.
 */
public class ApplicationTest {

    private WebDriver driver = WebDriverSingleton.getInstance();
    ApplicatonPage ap = new ApplicatonPage();

    @Before
    public void comeToApplicationPage() throws InterruptedException{
        driver.get("http://testing.cld.iba.by/web/guest/home");

        WebElement searchField = driver.findElement(By.id("_58_login"));
        searchField.sendKeys("kabanov@tc.by");
        WebElement passwordField = driver.findElement(By.id("_58_password"));
        passwordField.sendKeys("welcome");

        WebElement button = driver.findElement(By.xpath("//div[@class = 'button-holder ']//button"));
        button.sendKeys(Keys.RETURN);

        Thread.sleep(5000);
        WebElement recruitButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/nav/ul/li[2]/a"));
        recruitButton.click();
    }

    @Test
    public void applicationTest() throws InterruptedException{
        WebElement applicationButton = driver.findElement(By.xpath("//div[@class='panel-content row-fluid']/div[2]/a"));
        applicationButton.click();

        String position = "QA Engineer";
        String date = "03.04.2018";
        String priority = "средний";
        String countOfWorkers = "20";
        String causeOfVacancy = "Нехватка сотрудников";
        String typeOfAgreement = "контракт";
        String salary = "500";
        String currency = "EUR";
        String typeOfEmployment = "частичная занятость";
        String employees = "Нет";
        String businessTrip = "Возможно";
        String timetable = "с 9-00 до 17-00";
        String probationPeriod = "2 недели";
        String responsibilities = "-Создание тест планов\n" +
                                   "-Автоматизация тестирование\n" +
                                   "-Консультация клиентов\n" +
                                   "и др.";
        String candidateType = "внешний";
        String education = "Среднее специальное";
        String requiredEducation = "Техническое\n" + "Специализация - IT";
        String experience = "Не имеет значения";
        String priorityOrganization = "BSU\n" + "BSUIR";
        String undesirableOrganization = "epam";
        String requiredCompetences = "MariaDB";
        String desirableCompetences = "MySQL";
        String comment = "comment";

        /************************************Filling in forms*******************************/

        Thread.sleep(3000);
        ap.enterApplicationPage();
        Thread.sleep(3000);
        ap.typePosition(position);
        Thread.sleep(3000);
        ap.typeDate(date);
        ap.clickPriority();
        ap.typeQuantity(countOfWorkers);
        ap.typeCreationReason(causeOfVacancy);
        ap.clickContractType();
        ap.typeSalary(salary);
        ap.clickCurrency();
        ap.clickCurrencyOption();
        ap.clickJobType();
        ap.clickJobTypeOption();
        ap.typeEmployees(employees);
        ap.typeBusinessTrip(businessTrip);
        ap.typeTimetable(timetable);
        ap.typeProbationPeriod(probationPeriod);
        ap.typeResponsibilities(responsibilities);
        ap.clickCandidateType();
        ap.clickEducation();
        ap.clickEducationOption();
        ap.typeRequiredEducation(requiredEducation);
        ap.clickExperience();
        ap.clickExperienceOption();
        ap.typeDesirableOrganization(priorityOrganization);
        ap.typeUnesirableOrganization(undesirableOrganization);
        ap.clickRequiredCompetence();
        ap.clickFindButton();
        ap.clickProgrammersCheckbox();
        Thread.sleep(2000);
        ap.clickSubdItem();
        Thread.sleep(2000);
        ap.clickMariaDBItem();
        Thread.sleep(2000);
        ap.clickOkButton();
        ap.clickDesiredCompetance();
        ap.clickFindButton();
        ap.clickProgrammersCheckbox();
        Thread.sleep(2000);
        ap.clickSubdItem();
        Thread.sleep(2000);
        ap.clickMySQLItem();
        Thread.sleep(2000);
        ap.clickOkButton();
        ap.typeComment(comment);
        ap.clickSave();

        /************************************Assertions**********************************/

        Thread.sleep(2000);
        Assert.assertEquals(position,driver.findElement(By.xpath("//*[@class=\"application-name\"]")).getText());
        Assert.assertEquals(true, driver.findElement(By.xpath("//*[@class=\"pull-right\"]")).getText().contains(date));
        Assert.assertEquals(true, driver.findElement(By.xpath("//*[@class=\"priority-label label label-warning\"]")).getText().contains(priority));
        Assert.assertEquals(countOfWorkers, driver.findElement(By.xpath("//*[@class=\"application-info-block\"]/div[2]/span")).getText());
        Assert.assertEquals(causeOfVacancy, driver.findElement(By.xpath("//*[@class=\"application-info-block\"]/div[6]/div/pre")).getText());
        Assert.assertEquals(comment, driver.findElement(By.xpath("//*[@class=\"application-info-block\"]/div[5]/div/pre")).getText());
        Assert.assertEquals(countOfWorkers, driver.findElement(By.xpath("//*[@class=\"application-info-block\"]/div[2]/span")).getText());
        Assert.assertEquals(typeOfAgreement, driver.findElement(By.xpath("//*[@class=\"application-info-block\"][2]/div/div")).getText());
        Assert.assertEquals(true, driver.findElement(By.xpath("//*[@class=\"application-info-block\"][2]/div[2]/div")).getText().contains(salary));
        Assert.assertEquals(true, driver.findElement(By.xpath("//*[@class=\"application-info-block\"][2]/div[2]/div")).getText().contains(salary));
        Assert.assertEquals(true, driver.findElement(By.xpath("//*[@class=\"application-info-block\"][2]/div[2]/div")).getText().contains(currency));
        Assert.assertEquals(typeOfEmployment, driver.findElement(By.xpath("//*[@class=\"application-info-block\"][2]/div[3]/div")).getText());
        Assert.assertEquals(employees, driver.findElement(By.xpath("//*[@class=\"application-info-block\"][2]/div[4]/div")).getText());
        Assert.assertEquals(businessTrip, driver.findElement(By.xpath("//*[@class=\"application-info-block\"][2]/div[5]/div")).getText());
        Assert.assertEquals(timetable, driver.findElement(By.xpath("//*[@class=\"application-info-block\"][2]/div[6]/div")).getText());
        Assert.assertEquals(probationPeriod, driver.findElement(By.xpath("//*[@class=\"application-info-block\"][2]/div[7]/div")).getText());
        Assert.assertEquals(responsibilities, driver.findElement(By.xpath("//*[@class=\"application-info-block\"][2]/div[8]/div/pre")).getText());
        Assert.assertEquals(candidateType, driver.findElement(By.xpath("//*[@class=\"content application-content 0 col-md-6 col-xs-12\"]/div/div[2]/div/div")).getText());
        Assert.assertEquals(education, driver.findElement(By.xpath("//*[@class=\"content application-content 0 col-md-6 col-xs-12\"]/div/div[2]/div[2]/div")).getText());
        Assert.assertEquals(requiredEducation, driver.findElement(By.xpath("//*[@class=\"content application-content 0 col-md-6 col-xs-12\"]/div/div[2]/div[3]/div")).getText());
        Assert.assertEquals(experience, driver.findElement(By.xpath("//*[@class=\"content application-content 0 col-md-6 col-xs-12\"]/div/div[2]/div[4]/div")).getText());
        Assert.assertEquals(priorityOrganization, driver.findElement(By.xpath("//*[@class=\"content application-content 0 col-md-6 col-xs-12\"]/div/div[2]/div[5]/div")).getText());
        Assert.assertEquals(undesirableOrganization, driver.findElement(By.xpath("//*[@class=\"content application-content 0 col-md-6 col-xs-12\"]/div/div[2]/div[6]/div")).getText());
        Assert.assertEquals(requiredCompetences, driver.findElement(By.xpath("//*[@id=\"allCompetencies\"]/div/div/table/tbody/tr[2]/td/div")).getText());
        Assert.assertEquals(desirableCompetences, driver.findElement(By.xpath("//*[@id=\"allCompetencies\"]/div[2]/div/table/tbody/tr[2]/td/div")).getText());

    }

    //@After
    //public void shutDown() { driver.close(); }

}
