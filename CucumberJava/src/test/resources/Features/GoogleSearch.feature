Feature: To test google search function
  
  Scenario: Google search is working
    Given browser is open
    And User is on Google search page
    When User enters the text in the search box
    And hits enter
    Then User should be able to see search results
