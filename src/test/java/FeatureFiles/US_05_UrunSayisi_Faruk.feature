Feature: Items Functionality

  @Faruk
  Scenario: Confirming items count
    Given Navigate to CleverPPC
    When Click on the dresses in TopNav_Faruk
    And User should confirm the shown total numbers in DialogContent_Faruk
    And User creates a list of all items in DialogContent_Faruk
    Then User should confirm the list size is equal with shown total numbers DialogContent_Faruk