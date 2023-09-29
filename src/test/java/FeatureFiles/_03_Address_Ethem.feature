Feature: Adress functionality


  Scenario: Create Addresses
    Given Navigate to CleverPPC
    When Click the SiteMap
    When Enter username and password and click login button
    And Click the Address
    Then User should login successfully
    When Click on the element in DialogContent
      | adanewaddress |

    And User sending the keys in DialogContent
      | firstNameInput | Eto |
      | lastNameInput | etoa |
      | address       | Techno|
      | city | Los Angeles |
      | zip | 12356 |
      | homephone | 12345 |
      | mobilephone | 05546 |
      | reference | Technoo |

   And select state

    When Click on the element in DialogContent
      | saveButton |

    Then Success message should be displayed




