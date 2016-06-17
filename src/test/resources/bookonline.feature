Feature: bookonline
Scenario: Display book details
Given user choose on "Scrum Guide"
When click on "Scrum Guide"
Then new window open with details "Scrum Guide", author "Jeff & Ken" price "15"

Scenario: Display book details
Given user choose on "Scrum book"
When click on "Scrum Guide"
Then new window open with details "Scrum Guide", author "Jeff & Ken" price "15"

