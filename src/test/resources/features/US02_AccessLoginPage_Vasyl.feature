@US02_Vasyl
Feature: 02 - access login page features
  Agile Story: As a user, I should be able to access login page features.

  Background: Login for all US
    Given User is on the log in page


  Scenario: Access Login Page features
  #  Given user is on the login page
    When user sees "Remember me on this computer" checkbox on the login page
    Then user clicks Remember me on this computer checkbox on the login page


  Scenario: Access Login Page features
   # Given user is on the login page
    When user clicks on Forgot Your Password? if user does not remember a password
    Then user gets to the "Get Password" page to reset password