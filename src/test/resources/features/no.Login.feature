@smoke
Feature: Unsuccessful login check

  Scenario: Unsuccessful login with wrong email

    Given the user is on the login page
    When the user enters wrong username
    Then the user should NOT be able to login

