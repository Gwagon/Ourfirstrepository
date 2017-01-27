Feature: As a user 
I want to be able to see the place holder in 
the text fields for trade your luxurious item

@testcompleted
Scenario Outline: See place holders and assert text
Given I launch the url
And the "Home" is displayed
When I click on "Just Trade" tabs
And "Firstname" text field is displayed
Then the "<Confirm>" is displayed


Examples: #this is for then scenario
|       Confirm      |
| Enteryourfirstname |
|    Pagetext_Offer  |











