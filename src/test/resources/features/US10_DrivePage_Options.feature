@US10
Feature: Drive page modules verification

  User Story:
  As a user, I want to access the Drive page.

  Background:
    Given User is on the log in page
    When User enters username "hr1@cybertekschool.com" and password "UserUser"
    Then User on the homepage


  Scenario: Verify the users view all modules on the Drive page.
    When  User clicks on the Drive icon on the homepage
    Then  Verify if user sees all following 6 modules:

      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |






