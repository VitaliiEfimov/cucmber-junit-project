Feature:  User should be have access to VyTrack

  Scenario Outline:
    Given User is on a VyTrack login page
    When user enters user name "<username>"
    And user enters  password "<password>"
    Then user should see VyTrack homepage

    Examples:

      | username        | password    |
      | user184         | UserUser123 |
      | storemanager251 | UserUser123 |
      | salesmanager251 | UserUser123 |





