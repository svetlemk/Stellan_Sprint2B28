Feature: Login feature

  User Story:
  As a user, I should be able to log in to the with valid credentials.

  #jast copy this all "Scenario: " paste to your feature file, and change to "Background: "
  Scenario: Login for all US
    Given User is on the log in page
    When User enters username
    And User enters password
    Then User clicks Log in button

  Scenario Outline: User should be able to log in to the with valid credentials
    Given User is on the log in page
    When User enters username "<username>"
    And User enters password "<password>"
    Then User clicks Log in button and see correct title

    Examples:
      | username                      | password |
      | hr2@cybertekschool.com        | UserUser |
      #| hr3@cybertekschool.com        | UserUser |
      #| hr4@cybertekschool.com        | UserUser |
      | hr5@cybertekschool.com        | UserUser |
      #| helpdesk1@cybertekschool.com  | UserUser |
      #| helpdesk2@cybertekschool.com  | UserUser |
      | helpdesk3@cybertekschool.com  | UserUser |
      | helpdesk4@cybertekschool.com  | UserUser |
      #| marketing1@cybertekschool.com | UserUser |
      #| marketing2@cybertekschool.com | UserUser |
      | marketing3@cybertekschool.com | UserUser |
      | marketing4@cybertekschool.com | UserUser |



