Feature: As a user
  I want to be able to see the place holder in 
  the text fields for contact support page

  Scenario Outline: assert enter your name is displayed
    Given I launch the url
    And the "Home" is displayed
    When I click on "CONTACT SUPPORT" tabs
    Then the "<Confirm>" is displayed in the text field

    Examples: 
      | Confirm     |
      | Name        |
      | Middle name |
      | Surname     |
      | Address     |
      | Postcode    |
      | Email       |
      | Message     |
