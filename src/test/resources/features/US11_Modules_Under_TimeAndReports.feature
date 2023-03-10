@US11

Feature:US11_Modules_Under_TimeAndReports
  User Story : As a user, I want to access the Time and Reports page.

  Background:
    Given User is on the log in page
    When User enters username "hr1@cybertekschool.com" and password "UserUser"
    Then User on the homepage

  @US11
  Scenario:Verify the users view all modules in the Time and Reports page.
    When users click the Time and Reports module
    Then verify the users see flowing 5 modules:
      | Absence Chart          |
      | Worktime               |
      | Bitrix24.Time          |
      | Work Reports           |
      | Meetings and Briefings |





