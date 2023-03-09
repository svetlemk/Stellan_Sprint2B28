Feature: Driver page options verification

  User Story:
  As a user, I want to access the Drive page.

  Background:
    Given User is on the log in page
    When User enters username "hr1@cybertekschool.com" and password "UserUser"

  Scenario Outline :Verify the users view all modules in the Drive page.
    Given user is on the homepage
    When  User clicks on the Driver icon on the homepage
    Then  Verify the user see all following 5 <options>:

    Examples:
      | options                    |
      | Driver                     |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |






