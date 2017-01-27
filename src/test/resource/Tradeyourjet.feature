Feature: As a user 
I want to be able to fill in 
the text field and click the radio button 


Background: login
Given I launch the url
And the "Home" page is displayed
When I click on "Trade your jet" tabs
Then the "Trade your jet" page is displayed

@testcompleted
Scenario: Trade your jet form
Given I enter "2m_Current_jet_price_text" in the text field
And I enter "15m_Purchase_price_text" in the text field
And I enter "120000h_Flight_time" in the text field
When I click on "Range" Radio button
When I click on "Take off time" Radio button


 