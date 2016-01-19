Feature: Google

  Scenario: Our memory decreases because there is the google search entry
    Given I have an internet connection
    When  I browse to google.com
    Then I expect the google homepage search entry
    ##And I search for the word "cucumber"
    ##Then I expect search results