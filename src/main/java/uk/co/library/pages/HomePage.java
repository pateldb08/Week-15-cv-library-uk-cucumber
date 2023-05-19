package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement keyWords;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement locations;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distances;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement toggleMoreOptions;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryType;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement typeOfJob;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobs;

    @CacheLookup
    @FindBy(xpath = "//*[contains(text(),'Accept')]")
    WebElement acceptCookies;

    public void clickOnAcceptCookie() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptCookies);
        log.info("Clicking on Accept Cookies : " + acceptCookies.toString());
    }

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(keyWords, jobTitle);
        log.info("Sending keywords : " + jobTitle + " to " + keyWords.toString());
    }

    public void enterLocation(String location) {
        sendTextToElement(locations, location);
        log.info("Sending Location : " + location + " to " + locations.toString());
    }

    public void selectDistance(String distance) {
        selectByValueFromDropDown(distances, distance);
        log.info("Selecting distance : " + distance + " from " + distances.toString());
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(toggleMoreOptions);
        log.info("Clicking on More options : " + toggleMoreOptions.toString());
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
        log.info("Sending Min Salary : " + minSalary + " to " + salaryMin.toString());
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
        log.info("Sending Max Salary : " + maxSalary + " to " + salaryMax.toString());
    }

    public void selectSalaryType(String sType) {
        selectByValueFromDropDown(salaryType, sType);
        log.info("Selecting Salary Types : " + sType + " from " + salaryType.toString());
    }

    public void selectJobType(String jobType) {
        selectByValueFromDropDown(typeOfJob, jobType);
        log.info("Selecting Job Types : " + jobType + " to " + typeOfJob.toString());
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobs);
        log.info("Click on Find Jobs : " + findJobs.toString());
    }
}




