Feature: Adress functionality

  Scenario: Create Addresses
    Given Navigate to CleverPPC
    When Click the SiteMap
    When User enters username and password and click login button
    And Click the Address
    Then User should be able to login positively
    When Click on the element in DialogContent
      | adanewaddress |

    And User send the keys in DialogContent
      | firstNameInputET | Eto |
      | lastNameInputET | etoa |
      | address       | Techno|
      | city | Los Angeles |
      | zip | 12356 |
      | homephone | 12345 |
      | mobilephone | 05546 |
      | reference | Technoo |

   And select state

    When Clicks on the element in DialogContent
      | saveButton |

    Then Success message should be displayed




