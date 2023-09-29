Feature: Register Functionality

  @Faruk
  Scenario: Register with user information

    Given Navigate to CleverPPC

    When Click on the element in DialogContent_Faruk
      | signInButton |

    And User sending the keys in DialogContent_Faruk
      | emailCreateInput | cek7@gmail.com |

    When Click on the element in DialogContent_Faruk
      | createAccountButton |

    And User sending the keys in DialogContent_Faruk
      | firstNameInput | far |
      | lastNameInput | far |
      | passwordInput | far123 |

    When Click on the element in DialogContent_Faruk
      | registerButton |

    Then Success message should be displayed
