Feature: AzulCRM functionality 08 - access Chat and Calls module
  Agile story: As a user, I should be able to access the Chat and Calls module.

  @regression
  Scenario: Verify the users view all options in the Chat and Calls module
    Given users are on the homepage
    When users click the Chat and Calls module
    Then users see a Message button icon
    And user should see a Notifications button icon
    And user should see a Settings button icon
    And user should see a Activity Stream button icon




    #MAC --> command + shift + L
    #WINDOWS --> control + Alt + L