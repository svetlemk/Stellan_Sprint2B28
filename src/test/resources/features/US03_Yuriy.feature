Feature: As a user, I should be able to logout.

  Background:
    Given User is on the log in page
    When User enters username "hr1@cybertekschool.com" and password "UserUser"
    Then User on the homepage

  @US03
  Scenario: Verify theUsers log out from the app

    When users click the user profile name
    And users select the “Log Out” option
    Then verify the user back to the login page

