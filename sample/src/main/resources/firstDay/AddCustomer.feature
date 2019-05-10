
Feature: To test the add customer functionality

  Scenario: to verify the customer id
    Given the user is in add customer page
    When the user fill in the customer details
    When the user click on submit button
    Then the user should see the customer id is generated
