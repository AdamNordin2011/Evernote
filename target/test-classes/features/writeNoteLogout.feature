@todo
Feature: Login and write a note followed by a logout

  Scenario:
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be able to login
    When the user clicks "Create new note"
    Then the user should be able to type some notes
    Then the user signs out
