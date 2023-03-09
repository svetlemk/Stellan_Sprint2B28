
@wip
Feature:Options visibility

  User story: As a user,
  I should be able to see all the options under the user profile.

  Background:
    Given User is on the log in page
    When User enters username "hr1@cybertekschool.com" and password "UserUser"

  Scenario:  Verify the users view all options under the profile
    Given user is on the homepage
    When users click the profile name
    Then verify the users see following 5 options:
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                  |



