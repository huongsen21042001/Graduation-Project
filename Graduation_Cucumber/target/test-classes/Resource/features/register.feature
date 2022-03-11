Feature: Register Function

  Scenario: Register with valid data
    Given User is on alada website
    And Verify manage website
    When User enter <username>
    And User enter <email>
    And User enter again <email>
    And User enter <password>
    And User enter again <password>
    And User enter <phone>
    And User click on Register button
    Then Message is displayed below
   
  Scenario: Register with empty data
    Given User is on alada website
    And Verify manage website
    And User click on Register button
    Then Message is displayed below
   
  Scenario: Register with empty username
    Given User is on alada website
    And Verify manage website
    And User enter <email>
    And User enter again <email>
    And User enter <password>
    And User enter again <password>
    And User enter <phone>
    And User click on Register button
    Then Message is displayed below
   
  Scenario: Register with invalid email
    Given User is on alada website
    And Verify manage website
    When User enter <username>
		And User enter invalid <email>
    And User enter again <email>
    And User enter <password>
    And User enter again <password>
    And User enter <phone>
    And User click on Register button
  	Then Message is displayed below

  Scenario: Register by enter email does not match
    Given User is on alada website
    And Verify manage website
    When User enter <username>
		And User enter <email>
    And User enter again email does not match <email>
    And User enter <password>
    And User enter again <password>
    And User enter <phone>
    And User click on Register button
    Then Message is displayed below
   
  Scenario: Register with empty email
    Given User is on alada website
    And Verify manage website
    When User enter <username>
    And User enter again <email>
    And User enter <password>
    And User enter again <password>
    And User enter <phone>
    And User click on Register button
    Then Message is displayed below

  Scenario: Register with enter again empty email
    Given User is on alada website
    And Verify manage website
    When User enter <username>
    And User enter <email>
    And User enter <password>
    And User enter again <password>
    And User enter <phone>
    And User click on Register button
    Then Message is displayed below

  Scenario: Register with empty password
    Given User is on alada website
    And Verify manage website
    When User enter <username>
    And User enter <email>
    And User enter again <email>
    And User enter again <password>
    And User enter <phone>
    And User click on Register button
    Then Message is displayed below
   
  Scenario: Register with invalid password
   	Given User is on alada website
    And Verify manage website
    When User enter <username>
    And User enter <email>
    And User enter again <email>
    And User enter invalid <password>
    And User enter again <password>
    And User enter <phone>
    And User click on Register button
    Then Message is displayed below
  