$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("boolean.feature");
formatter.feature({
  "id": "boolean",
  "description": "",
  "name": "Boolean",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "boolean;or-function-for-boolean",
  "description": "",
  "name": "OR function for boolean",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I pass the boolean \"0\" and \"0\"",
  "keyword": "When ",
  "line": 4
});
formatter.step({
  "name": "I execute the OR operation",
  "keyword": "And ",
  "line": 5
});
formatter.step({
  "name": "I expect the result to be \"1\"",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 20
    },
    {
      "val": "0",
      "offset": 28
    }
  ],
  "location": "StepDefinitionsBoolean.I_pass_the_boolean(String,String)"
});
formatter.result({
  "duration": 140427420,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsBoolean.I_execute_the_OR_operation()"
});
formatter.result({
  "duration": 30477,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 27
    }
  ],
  "location": "StepDefinitionsBoolean.I_expect_the_result_to_be(String)"
});
formatter.result({
  "duration": 1493016,
  "status": "passed"
});
formatter.uri("google.feature");
formatter.feature({
  "id": "google",
  "description": "",
  "name": "Google",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "google;our-memory-decreases-because-there-is-the-google-search-entry",
  "description": "",
  "name": "Our memory decreases because there is the google search entry",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "I have an internet connection",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I browse to google.com",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "I expect the google homepage search entry",
  "keyword": "Then ",
  "line": 6
});
formatter.match({
  "location": "StepDefinitionsGoogle.i_have_an_internet_connection()"
});
formatter.result({
  "duration": 21259044,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsGoogle.i_browse_to_google_com()"
});
formatter.result({
  "duration": 6075442863,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionsGoogle.i_expect_the_search_entry()"
});
formatter.result({
  "duration": 589246585,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "id": "test-login",
  "description": "",
  "name": "Test Login",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "test-login;login-success-and-failure;;2",
  "description": "",
  "name": "Login Success and Failure",
  "keyword": "Scenario Outline",
  "line": 10,
  "type": "scenario"
});
formatter.step({
  "name": "I navigate to the mock application",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I try to login with \u0027valid\u0027 credentials",
  "keyword": "When ",
  "line": 5,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I should see that I logged in \u0027successfully\u0027",
  "keyword": "Then ",
  "line": 6,
  "matchedColumns": [
    1
  ]
});
formatter.match({
  "location": "StepDefinitionsLogin.I_navigate_to_the_mock_application()"
});
formatter.result({
  "duration": 177039,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valid",
      "offset": 21
    }
  ],
  "location": "StepDefinitionsLogin.I_try_to_login_with_type_credentials(String)"
});
formatter.result({
  "duration": 144508,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "successfully",
      "offset": 31
    }
  ],
  "location": "StepDefinitionsLogin.I_should_see_that_I_logged_in_status_(String)"
});
formatter.result({
  "duration": 103073,
  "status": "passed"
});
formatter.scenario({
  "id": "test-login;login-success-and-failure;;3",
  "description": "",
  "name": "Login Success and Failure",
  "keyword": "Scenario Outline",
  "line": 11,
  "type": "scenario"
});
formatter.step({
  "name": "I navigate to the mock application",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "I try to login with \u0027invalid\u0027 credentials",
  "keyword": "When ",
  "line": 5,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I should see that I logged in \u0027unsuccessfully\u0027",
  "keyword": "Then ",
  "line": 6,
  "matchedColumns": [
    1
  ]
});
formatter.match({
  "location": "StepDefinitionsLogin.I_navigate_to_the_mock_application()"
});
formatter.result({
  "duration": 170875,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 21
    }
  ],
  "location": "StepDefinitionsLogin.I_try_to_login_with_type_credentials(String)"
});
formatter.result({
  "duration": 155123,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "unsuccessfully",
      "offset": 31
    }
  ],
  "location": "StepDefinitionsLogin.I_should_see_that_I_logged_in_status_(String)"
});
formatter.result({
  "duration": 180463,
  "status": "passed"
});
formatter.uri("pricelist.feature");
formatter.feature({
  "id": "cucumber-can-convert-a-gherkin-table-to-to-a-map.",
  "description": "This an example of a more complicated price list.",
  "name": "Cucumber can convert a Gherkin table to to a map.",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "cucumber-can-convert-a-gherkin-table-to-to-a-map.;an-international-coffee-shop-must-handle-currencies",
  "description": "",
  "name": "An international coffee shop must handle currencies",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "the price list for an international coffee shop",
  "keyword": "Given ",
  "line": 5,
  "rows": [
    {
      "cells": [
        "product",
        "currency",
        "price"
      ],
      "line": 6
    },
    {
      "cells": [
        "coffee",
        "EUR",
        "1"
      ],
      "line": 7
    },
    {
      "cells": [
        "donut",
        "SEK",
        "18"
      ],
      "line": 8
    }
  ]
});
formatter.step({
  "name": "I buy 1 coffee and 1 donut",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "should I pay 1 EUR and 18 SEK",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "StepDefinitionsPricelist.the_price_list_for_an_international_coffee_shop(Price\u003e)"
});
formatter.result({
  "duration": 15290746,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 6
    },
    {
      "val": "coffee",
      "offset": 8
    },
    {
      "val": "1",
      "offset": 19
    },
    {
      "val": "donut",
      "offset": 21
    }
  ],
  "location": "StepDefinitionsPricelist.i_order_coffee_and_donut(int,String,int,String)"
});
formatter.result({
  "duration": 390034,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    },
    {
      "val": "18",
      "offset": 23
    }
  ],
  "location": "StepDefinitionsPricelist.should_I_pay_EUR_and_SEK(int,int)"
});
formatter.result({
  "duration": 148274,
  "status": "passed"
});
});