Feature: As a user, I should be able to access to the Company page.

  Background:
    Given users are on the homepage

  @TC014
  Scenario:  Verify users see the 7 modules in the Company page shown as design

    When users click the Company module
    Then verify the users see flowing 7 options:
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Company        |
      | Video.               |
      | Business News(RSS)   |
      | Career               |

