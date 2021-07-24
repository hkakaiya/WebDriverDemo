Feature: Feature to test log-in function

  Scenario: Check if logIn is successful with valid credentials
    Given User is on logIn page
    When User enters UserID & Password
    And Clicks on LogIn Button
    Then User is allowed to logIn and see the HomePage
