package uk.co.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class jobSearchSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() throws InterruptedException{
        new HomePage().clickOnAcceptCookie();
    }
    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String text)  {
      new HomePage().enterJobTitle(text);
    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String text)  {
        new HomePage().enterLocation(text);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String text)  {
        new HomePage().selectDistance(text);
    }
    @And("^I click on more search option$")
    public void iClickOnMoreSearchOption() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter minimum salary \"([^\"]*)\"$")
    public void iEnterMinimumSalary(String text)  {
        new HomePage().enterMinSalary(text);
    }

    @And("^I enter maximum salary \"([^\"]*)\"$")
    public void iEnterMaximumSalary(String text)  {
        new HomePage().enterMaxSalary(text);

    }

    @And("^I select salary type \"([^\"]*)\"$")
    public void iSelectSalaryType(String text) {
        new HomePage().selectSalaryType(text);
    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String text)  {
        new HomePage().selectJobType(text);
    }

    @And("^I click on find job button$")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("^I should be able to see message \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeMessage(String text)  {
        new ResultPage().verifyTheResults(text);
    }
}
