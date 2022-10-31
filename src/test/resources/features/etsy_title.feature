
      #TC#51: Etsy Title Verification
      #1. User is on https://www.etsy.com
      #2. User sees title is as expected.
      #
      #Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for
      #everyone

      Feature: Etsy Title Verification
  user story: User sees title is as expected.

  Scenario: Etsy Home Page Title Verification
    Given User is on home page
    Then User sees title is as expected. Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone



