Feature: Test Log-in Function

  Scenario Outline: Check Log-in is successful with Valid Credentials
    Given browser is already open by User
    And User is already at log-in page
    When User provides <username> and <password>
    And User enters
    Then User is able to login and home page is shown

    Examples: 
      | username | password |
      | Hitesh   |    12345 |
      | Parth    |    12345 |
