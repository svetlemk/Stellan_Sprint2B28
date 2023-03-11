@US13_Vasyl
Feature: As a user, I should be able to configure the menu

  Background:
    Given User is on the log in page
    When User enters username "hr1@cybertekschool.com" and password "UserUser"
    Then User on the homepage

  Scenario: Verify users see 6 module in Configure Menu

    When users click Configure Menu
    Then verify the users see flowing 6 options:
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |
