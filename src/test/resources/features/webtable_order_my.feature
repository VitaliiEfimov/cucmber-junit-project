
Feature: Web table user order feature

  @smoke
  Scenario Outline: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity "<quantity>"
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<ZIP>"
    And user selects credit card type "<typeCard>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

    Examples:
      | productType | quantity | customerName    | street             | city    | state         | ZIP    | typeCard         | cardNumber       | expDate | expectedName    |
      | Familybea   | 2        | Sherlock Holmes | 221B Baker Street  | London  | England       | 50505  | American Express | 1111222233334444 | 12/23   | Sherlock Holmes |
      | MoneyCog    | 3        | James Bond      | 123C Tower Street  | London  | England       | 555005 | MasterCard       | 6546546545645558 | 15/25   | James Bond      |
      | Screenable  | 15       | Bill Murrey     | 12548 Anker Street | Florida | United States | 345008 | Visa             | 6545648978964632 | 01/26   | Bill Murrey     |