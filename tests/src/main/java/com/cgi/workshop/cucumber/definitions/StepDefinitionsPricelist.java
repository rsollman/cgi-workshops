package com.cgi.workshop.cucumber.definitions;

import com.cgi.workshop.cucumber.Price;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by sollmanr on 7-12-2015.
 */
public class StepDefinitionsPricelist {

    private Map<String, Price> priceList;
    private int sekSum;
    private int euroSum;

    @Given("^the price list for an international coffee shop$")
    public void the_price_list_for_an_international_coffee_shop(List<Price> prices) throws Throwable {
        priceList = new HashMap<String, Price>();

        for (Price price : prices) {
            String key = price.getProduct();
            priceList.put(key, price);
        }
    }

    @When("^I buy (\\d+) (.*) and (\\d+) (.*)$")
    public void i_order_coffee_and_donut(int numberOfFirstItems, String firstItem,
                                         int numberOfSecondItems, String secondItem) throws Throwable {
        Price firstPrice = priceList.get(firstItem);
        calculate(numberOfFirstItems, firstPrice);
        Price secondPrice = priceList.get(secondItem);
        calculate(numberOfSecondItems, secondPrice);
    }

    private void calculate(int numberOfItems, Price price) {
        if (price.getCurrency().equals("SEK")) {
            sekSum += numberOfItems * price.getPrice();
            return;
        }
        if (price.getCurrency().equals("EUR")) {
            euroSum += numberOfItems * price.getPrice();
            return;
        }
        throw new IllegalArgumentException("The currency is unknown");
    }

    @Then("^should I pay (\\d+) EUR and (\\d+) SEK$")
    public void should_I_pay_EUR_and_SEK(int expectedEuroSum, int expectedSekSum) throws Throwable {
        assertEquals(euroSum, expectedEuroSum);
        assertEquals(sekSum, expectedSekSum);
    }
}
