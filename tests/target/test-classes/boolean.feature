Feature: Boolean feature

  Scenario: OR function for boolean
    When I pass the boolean "0" and "1"
    And I execute the OR operation
    Then I expect the result to be "1"
