Feature: Online calc
Scenario: Multiplication
Given user enter 5 and 4 in input box
And select option "Mul"
When click on calculate
Then result should be 20
