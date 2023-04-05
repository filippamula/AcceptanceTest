Feature: Search

  @Test
  Scenario: Search in google
    Given Load page
    When Search "Cat"
    Then Check if path have "search"