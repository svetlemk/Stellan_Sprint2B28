Feature:
  As a user, I should be able to see desktop options to download.

Background: Login for all US
Given User is on the log in page
When User enters username "hr1@cybertekschool.com" and password "UserUser"
Then User on the homepage

  @Wip_V
Scenario:  Verify users can see desktop app options

Then verify the users see flowing 3 desktop options:
|   MAC OS    |
|  WINDOWS    |
|  LINUX      |

