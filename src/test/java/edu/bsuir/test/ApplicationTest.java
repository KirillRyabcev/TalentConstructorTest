package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.Login;
import edu.bsuir.web.page.ApplicatonPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Acer on 30.03.2018.
 */
public class ApplicationTest {

    private WebDriver driver = WebDriverSingleton.getInstance();
    ApplicatonPage ap = new ApplicatonPage();

    @Before
    public void comeToApplicationPage() throws Exception{
        Login l = new Login();
        l.login("Начальник отдела");
        Thread.sleep(3000);
        WebElement recruitButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/nav/ul/li[2]/a"));
        Thread.sleep(3000);
        recruitButton.click();
    }

    @Test
    public void applicationTest() throws InterruptedException{
        WebElement applicationButton = driver.findElement(By.xpath("//div[@class='panel-content row-fluid']/div[2]/a"));
        applicationButton.click();

        String position = "QA Engineer";
        String date = "10.04.2018";
        String priority = "средний";
        String countOfWorkers = "20";
        String causeOfVacancy = "Нехватка сотрудников";
        String typeOfAgreement = "контракт";
        String salary = "500";
        String currency = "EUR";
        String typeOfEmployment = "частичная занятость";
        String typeOfEmploymentValue = "2";
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

        Thread.sleep(2000);
        ap.enterApplicationPage();
        Thread.sleep(2000);
        ap.typePosition(position);
        ap.typeDate(date);
        ap.clickPriority();
        ap.typeQuantity(countOfWorkers);
        ap.typeCreationReason(causeOfVacancy);
        ap.clickContractType();
        ap.typeSalary(salary);
        ap.selectCurrencyByText(currency);
        ap.selectJobTypeByValue(typeOfEmploymentValue);
        ap.typeEmployees(employees);
        ap.typeBusinessTrip(businessTrip);
        ap.typeTimetable(timetable);
        ap.typeProbationPeriod(probationPeriod);
        ap.typeResponsibilities(responsibilities);
        ap.clickCandidateType();
        ap.selectEducationByText(education);
        ap.typeRequiredEducation(requiredEducation);
        ap.selectExperienceByText(experience);
        ap.typeDesirableOrganization(priorityOrganization);
        ap.typeUnesirableOrganization(undesirableOrganization);
        ap.clickRequiredCompetence();
        ap.clickFindButton();
        ap.clickProgrammersCheckbox();
        ap.clickSubdItem();
        Thread.sleep(2000);
        ap.clickMariaDBItem();
        Thread.sleep(2000);
        ap.clickOkButton();
        ap.clickDesiredCompetance();
        ap.clickFindButton();
        ap.clickProgrammersCheckbox();
        ap.clickSubdItem();
        Thread.sleep(2000);
        ap.clickMySQLItem();
        Thread.sleep(2000);
        ap.clickOkButton();
        ap.typeComment(comment);
        ap.clickSave();

        /************************************Assertions**********************************/

        Thread.sleep(1000);
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
}
