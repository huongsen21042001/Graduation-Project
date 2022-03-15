Feature: Register Function

  Scenario: Register with valid data
    Given User is on register page
    And Verify manage register page
    When User fill out <firstname>
    And User fill out <lastname>
    And User fill out <email>
    And User fill out <password>
    And User click on Register button
    Then Message will be displayed 
    
   
  Scenario: Register with empty data
    Given User is on register page
    And Verify manage register page
    And User click on Register button
    Then Message will be displayed 
    
  Scenario: Register with empty firstname
    Given User is on register page
    And Verify manage register page
    And User fill out <lastname>
    And User fill out <email>
    And User fill out <password>
    And User click on Register button
    Then Message will be displayed 
    
  Scenario: Register with empty lastname
    Given User is on register page
    And Verify manage register page
    And User fill out <firstname>
    And User fill out <email>
    And User fill out <password>
    And User click on Register button
    Then Message will be displayed 
    
  Scenario: Register with empty email
    Given User is on register page
    And Verify manage register page
    And User fill out <firstname>
    And User fill out <lastname>
    And User fill out <password>
    And User click on Register button
    Then Message will be displayed 
    
  Scenario: Register with empty password
    Given User is on register page
    And Verify manage register page
    And User fill out <firstname>
    And User fill out <lastname>
    And User fill out <email>
    And User click on Register button
    Then Message will be displayed 
    
   Scenario: Register with invalid email
    Given User is on register page
    And Verify manage register page
    And User fill out <firstname>
    And User fill out <lastname>
    And User fill out invalid <email>
    And User fill out <password>
    And User click on Register button
    Then Message will be displayed 
    
   Scenario: Register with invalid password
    Given User is on register page
    And Verify manage register page
    And User fill out <firstname>
    And User fill out <lastname>
    And User fill out <email>
    And User fill out invalid <password>
    And User click on Register button
    Then Message will be displayed 

  