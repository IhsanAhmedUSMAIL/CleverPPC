Feature: Items Functionality

  Scenario: Confirming items count
    Given Navigate to CleverPPC
    When Click on the dresses in DialogContent
    And User should confirm the shown total numbers in DialogContent
    And User creates a list of all items in DialogContent
    Then User should confirm the list size is equal with shown total numbers DialogContent