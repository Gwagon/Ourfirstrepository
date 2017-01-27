Feature: As a user, I want to be 
able to view / launch the homepage 
and click all the tabs

@testcompleted
Scenario: HomePage displayed
Given I launch the url
And the "Home" is displayed
When I click on "all the" tabs
Then the "ContactPage" is displayed

