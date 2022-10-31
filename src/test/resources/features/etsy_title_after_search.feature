
      #TC#51: Etsy Title Verification
      #1. User is on https://www.etsy.com
      #2. User sees title is as expected.
      #
      #Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for
      #everyone
            # TC#52: Etsy Search Functionality Title Verification (without parameterization)
        #1. User is on https://www.etsy.com
        #2. User types Wooden Spoon in the search box
        #3. User clicks search button
        #4. User sees Wooden Spoon is in the title
        #

        #TC#53: Etsy Search Functionality Title Verification (with parameterization)
        #1. User is on https://www.etsy.com
        #2. User types Wooden Spoon in the search box
        #3. User clicks search button
        #4. User sees Wooden Spoon is in the title

      Feature: Etsy Title Verification
  user story: User sees title is as expected.

        Background:
          Given "User is on home page"
          When User types Wooden Spoon in the search box
          And User clicks search button

  Scenario: Etsy Search Functionality Title Verification (without parameterization)

    Then User sees Wooden spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parameterization)

    Then User sees "Wooden spoon" is in the title

