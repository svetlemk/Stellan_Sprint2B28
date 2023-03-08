Feature: As a user, I should be able to access to the Company page.

  Background:
    Given User is on the log in page
    When User enters username
    And User enters password
    Then User clicks Log in button

  @TC14
  Scenario:  Verify users see the 7 modules in the Company page shown as design

    When users click the Company module
    Then verify the users see flowing 7 options:
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |

