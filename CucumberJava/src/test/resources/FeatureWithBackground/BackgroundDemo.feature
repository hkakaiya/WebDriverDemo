Feature: Validate HomePage

  Background: User is logged-in
    Given User is on logIn page
    When User enters UserID & Password
    And Clicks on LogIn Button
    Then User is allowed to logIn and see the HomePage

  Scenario: Check Logout link
    When User clicks on Welcome link
    Then Logout is displayed

  Scenario: check quick launch toolbar is present
    When User clicks on dashboard link
    Then quick launch toolbar is displayed
