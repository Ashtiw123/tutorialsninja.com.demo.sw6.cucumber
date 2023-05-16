package demo.com.tutorialsninja.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.com.tutorialsninja.pages.DesktopsPage;

public class HomepageSteps {


        @Given("^I am on homepage$")
        public void iAmOnHomepage() {
        }

    @When("^I hover mouse over Desktop$")
    public void iHoverMouseOverDesktop() {
            new DesktopsPage().mouseHoverOnDesktopsAndClick();
    }

    @And("^I hover mouse over Desktop and click Show AllDesktops$")
    public void iHoverMouseOverDesktopAndClickShowAllDesktops() {
    }

    @Then("^I should see label \"([^\"]*)\"$")
    public void iShouldSeeLabel(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I hover mouse over Laptops and Notebooks$")
    public void iHoverMouseOverLaptopsAndNotebooks() {
    }

    @And("^I hover mouse over Laptops and Notebooks and click on Show AllLaptops & Notebook$")
    public void iHoverMouseOverLaptopsAndNotebooksAndClickOnShowAllLaptopsNotebook() {
    }

    @When("^I hover mouse over Components$")
    public void iHoverMouseOverComponents() {
    }

    @And("^I hover mouse over Components and click on Show AllComponents$")
    public void iHoverMouseOverComponentsAndClickOnShowAllComponents() {
    }
}

