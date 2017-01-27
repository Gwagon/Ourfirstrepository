Feature: click all tab

@testcompleted
Scenario Outline: Click all tabs
Given I launch the url
Then I click on "<Weg Tabs>" tabs

Examples: all tabs
|    Weg Tabs     | 
| Homepage        | 
| Trade your jet  | 
| Book your jet   | 
| Just Trade      | 
| About Us        | 
| Contact Support | 





