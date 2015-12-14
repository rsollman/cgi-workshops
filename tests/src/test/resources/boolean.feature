Feature: Boolean

  Scenario: OR function for boolean
    When I pass the boolean "0" and "0"
    And I execute the OR operation
    Then I expect the result to be "1"
