Feature: As a user, I should be able to logout.

  Background:
    Given users are on the homepage

  @TC003
  Scenario: Verify theUsers log out from the app

    When users click the user profile name
    And users select the “Log Out” option
    Then verify the user back to the login page

