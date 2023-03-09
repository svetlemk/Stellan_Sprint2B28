Feature: Login feature

  User Story:
  As a user, I should be able to log in to the with valid credentials.

  #jast copy this all "Scenario: " paste to your feature file, and change to "Background: "
  Scenario: Login for all US
    Given User is on the log in page
    When User enters username "hr1@cybertekschool.com" and password "UserUser"


  Scenario Outline: User should be able to log in with valid credentials
    Given User is on the log in page
    When User enters username "<username>" and password "<password>"
    Then User should see correct title

    Examples:
      | username               | password |
      | hr2@cybertekschool.com | UserUser |
      #| hr3@cybertekschool.com        | UserUser |
      #| hr4@cybertekschool.com        | UserUser |
      #| hr5@cybertekschool.com        | UserUser |
      #| helpdesk1@cybertekschool.com  | UserUser |
      #| helpdesk2@cybertekschool.com  | UserUser |
      #| helpdesk3@cybertekschool.com  | UserUser |
      #| helpdesk4@cybertekschool.com  | UserUser |
      #| marketing1@cybertekschool.com | UserUser |
      #| marketing2@cybertekschool.com | UserUser |
      #| marketing3@cybertekschool.com | UserUser |
      #| marketing4@cybertekschool.com | UserUser |

  @US01
  Scenario Outline: User should see "Incorrect username or password" message when enters the wrong username or password.
    Given User is on the log in page
    When User enters username "<username>" and password "<password>"
    Then User see "Incorrect username or password" message

    Examples:
      | username               | password |
      | hr2@cybertekschool.com | 1234567a |
      #| hr3@cybertekschool.com        | UserUser |
      #| hr4@cybertekschool.com        | UserUser |
      #| hr@cybertekschool.com        | useruser |
      #| helpdesk1@cybertekschool.com  | UserUser |
      #| helpdesk2@cybertekschool.com  | UserUser |
      #| helpdesk3@gmail.com    | UserUser |
      #| helpdesk4@cybertekschool.com  | UserUser |
      #| marketing1@cybertekschool.com | UserUser |
      #| marketing2@cybertekschool.com | UserUser |
      #| marketing@cybertek.com | 1234567a |
      #| marketing4@cybertekschool.com | UserUser |

