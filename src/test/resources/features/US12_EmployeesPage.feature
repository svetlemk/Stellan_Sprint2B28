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

  Scenario: Verification of access to all modules in the Employees page
  Given User is logged into NextBaseCRM
  When User clicks onto Employees Page
  Then User will be able to view all modules
