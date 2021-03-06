package com.cgi.workshop.cucumber.definitions;

import com.cgi.selenium.BrowserDriver;
import com.cgi.selenium.PageStrategy;
import com.cgi.selenium.pagecontainers.GoogleHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.net.URL;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by sollmanr on 25-3-2015.
 */
public class StepDefinitionsGoogle {
    private final PageStrategy strategy = new PageStrategy();
    private final String URL_GOOGLE = "http://www.google.com";

    @Given("^I have an internet connection$")
    public void i_have_an_internet_connection() throws Throwable {
        assertNotNull(new URL(URL_GOOGLE).openConnection());
        //todo getContent...
    }

    @When("^I browse to google.com$")
    public void i_browse_to_google_com() throws Throwable {
        BrowserDriver.loadPage(URL_GOOGLE);
    }

    @Then("^I expect the google homepage search entry$")
    public void i_expect_the_search_entry() throws Throwable {
        assertTrue(strategy.getPage(GoogleHomePage.class.getName()).isDisplayed());
    }

    @And("^I search for the word \"([^\"]*)\"$")
    public void I_search_for_the_word(String q) throws Throwable {
        strategy.getPage(GoogleHomePage.class.getName()).search(q);
    }

    @Then("^I expect search results$")
    public void I_expect_search_results() throws Throwable {
        assertTrue(strategy.getPage(GoogleHomePage.class.getName()).hasResults());

    }
}
