#TC : hioscar.com care options web app testing
#1. Open Chrome browser
#2. Go to https://www.hioscar.com/care-options
#3. Click Search network
#4. From Coverage year dropdown Select 2023 option
#5. From Coverage access dropdown Select Employer-
#provided option
#6. From Network partner dropdown Select Oscar
#option
#7. From Coverage area dropdown Select New Jersey
#8. Click Continue button
#9. Verify title contains “Oscar”
@smoke
Feature: hioscar search feature

  Scenario:
    Given user is on hioscar page
    When user click Search network
    And user from Coverage year dropdown Select "2023" option
    And user from Coverage access dropdown Select "Employer-provided" option
And user from Network partner dropdown Select "Oscar" option
And user from Coverage area dropdown Select "New Jersey"
    And user click Continue button
    Then user should see title name of the page: "Oscar"