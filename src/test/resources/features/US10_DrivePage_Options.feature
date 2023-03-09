Feature: Driver page options verification

  User Story:
  As a user, I want to access the Drive page.

  Background:
    Given User is on the log in page
    When User enters username
    And User enters password
    Then User clicks Log in button

  Scenario Outline :Verify the users view all modules in the Drive page.
    Given : User on the Driver page
    When : User clicks on the Driver icon on the home page
    Then : Verify the user see all following 5 <options>:

    Examples:
      | options                    |
      | Driver                     |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |






