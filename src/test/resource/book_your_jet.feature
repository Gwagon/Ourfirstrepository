@testcompleted @test
Feature: As a user 
I want to be able to fill in the text
field, select a dropdown and check the 
radio buttons

Background: login
Given I launch the url
And the "Home" page is displayed
When I click on "Bookyourjet" tabs
Then the "BookYourJet" page is displayed


Scenario: Book your jet form
Given I enter "start destination" in the text field
And I enter "end destination" in the text field
When I select "US" from the select zone dropdown
Then I check "family" checkbox 













