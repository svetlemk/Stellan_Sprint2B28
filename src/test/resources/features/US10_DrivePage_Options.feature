Feature: Driver page modules verification

  User Story:
  As a user, I want to access the Drive page.

  Background:
    Given User is on the log in page
    When User enters username "hr1@cybertekschool.com" and password "UserUser"
    Then User on the homepage

  Scenario Outline :Verify the users view all modules in the Drive page.
    When  User clicks on the Driver icon on the homepage
    Then  Verify if user sees all following 5 <modules>:

      | Driver                     |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |






