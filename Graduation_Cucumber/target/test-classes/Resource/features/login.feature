
Feature: Login function

  Scenario: Login with valid data
    Given User is on login page
    And Verify manage login page
    When User enter <email> and <password> 
    And User click on Login button
    Then Message is displayed
   
  Scenario: Login with invalid data
    Given User is on login page
    And Verify manage login page
    When User enter invalid <email> 
    And User enter invalid <password> 
    And User click on Login button
    Then Message is displayed
   
  Scenario: Login with invalid password
    Given User is on login page
    And Verify manage login page
    When User enter <email> 
    And User enter invalid <password> 
    And User click on Login button
    Then Message is displayed
       
  Scenario: Login with password empty
    Given User is on login page
    And Verify manage login page
    When User enter <email>
    And User click on Login button
    Then Message is displayed
    
  Scenario: Login with email empty
    Given User is on login page
    And Verify manage login page
    When User enter <password>
    And User click on Login button
    Then Message is displayed
    
  Scenario: Login with unregistered email
    Given User is on login page
    And Verify manage login page
    When User enter unregistered <email>
    And User enter <password> 
    And User click on Login button
    Then Message is displayed
    
    
    
    
    
   
   



