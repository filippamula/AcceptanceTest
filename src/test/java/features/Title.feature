Feature: Check title

  Scenario: Checking happy title
    When Load page
    Then Check if the title is "Google"

  Scenario: Checking unhappy title
    When Load page
    Then Check if the title is "NotGoogle"
