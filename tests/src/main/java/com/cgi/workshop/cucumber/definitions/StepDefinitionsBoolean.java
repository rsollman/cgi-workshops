package com.cgi.workshop.cucumber.definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;

/**
 * Created by sollmanr on 7-12-2015.
 */
public class StepDefinitionsBoolean {

    private static final Logger LOG = Logger.getLogger(StepDefinitionsBoolean.class);

    private boolean b1;
    private boolean b2;
    private boolean result;

    @When("^I pass the boolean \"([^\"]*)\" and \"([^\"]*)\"$")
    public void I_pass_the_boolean(String arg1, String arg2) throws Throwable {
        if ( !isBoolean(arg1) || !isBoolean(arg2)) {
            throw new IllegalArgumentException("Can only pass in zero or one as argument");
        }
        b1 = Boolean.parseBoolean(arg1);
        b2 = Boolean.parseBoolean(arg2);
    }

    private boolean isBoolean(String b) {
        return b.equals("0") || b.equals("1");
    }

    @And("^I execute the OR operation$")
    public void I_execute_the_OR_operation() throws Throwable {
        result = b1 || b2;
    }

    @Then("^I expect the result to be \"([^\"]*)\"$")
    public void I_expect_the_result_to_be(String arg1) throws Throwable {
        if (!isBoolean(arg1)) {
            throw new IllegalArgumentException("Can only pass in zero or one as argument");
        }
        assertEquals(0, Boolean.compare(Boolean.parseBoolean(arg1), result));
    }
}
