@Alonso
Feature: Access the Employees Page

  User Story : Verify the users view all modules in the Employees page.
  Company Structure
  Find Employee
  Telephone Directory
  Staff Changes
  Efficiency report
  Honored Employees
  Birthdays
  New page

Background:
  Given User is on the log in page
  When User enters username "hr1@cybertekschool.com" and password "UserUser"
  Then User on the homepage

  Scenario: Verification of access to all modules in the Employees page
    When user clicks onto Employees page
    Then User will be able to view all modules
