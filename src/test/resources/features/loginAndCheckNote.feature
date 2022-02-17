@smoke
Feature: Note Created Check

  Scenario: Login with valid credentials

    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be able to login
    Then the user should be able to see the created note