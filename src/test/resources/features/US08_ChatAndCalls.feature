Feature: US08 - access Chat and Calls module
  Agile story: As a user, I should be able to access the Chat and Calls module.

  Background:
    Given User is on the log in page
    When User enters username
    And User enters password
    Then User clicks Log in button

  Scenario: Verify the users view all options in the Chat and Calls module
    Given users are on the homepage
    When users click the CHAT and Calls module
    Then verify the users see following 4 options:
      |Message      |
      |Notifications|
      |Settings     |
      |Active Stream|


