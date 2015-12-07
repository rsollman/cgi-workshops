package com.cgi.workshop.cucumber.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;

/**
 * Created by sollmanr on 7-12-2015.
 */
public class StepDefinitionsLogin {

    private static final Logger LOG = Logger.getLogger(StepDefinitionsLogin.class);

    @Given("^I navigate to the mock application$")
    public void I_navigate_to_the_mock_application() throws Throwable {
        LOG.info("Entering: I navigate to the mock application");
    }

    @When("^I try to login with '(.+)' credentials$")
    public void I_try_to_login_with_type_credentials(String credentials$Type) throws Throwable {
        LOG.info("Entering: I try to login with " + credentials$Type + " credentials");
    }

    @Then("^I should see that I logged in '(.+)'$")
    public void I_should_see_that_I_logged_in_status_(String outcome) throws Throwable {
        LOG.info("Entering: I should see that I logged in " + outcome);
    }

}
