Feature: Search function

  Scenario: Search with author name
    Given User is on aladaa website
    And Verify manager website
    When User enter <author>
    And User click on Search button
    Then Message is displayed below
    
   Scenario: Search with courses name
    Given User is on aladaa website
    And Verify manager website
    When User enter <course>
    And User click on Search button
    Then Message will be displayed     
    
   Scenario: Search with empty data
    Given User is on aladaa website
    And Verify manager website
    And User click on Search button
    Then Message will be displayed                           