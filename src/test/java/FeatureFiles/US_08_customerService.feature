Feature: Customer Service functionality

  Scenario: Contact customer service and share a payment receipt
    Given Navigate to cleverPPC
    When The user click on the contact us button
    And select a subject heading
    And enters their email address
    And choose an order reference
    And write down a message
    When choose a file from the computer
    And attach a payment receipt file
    And Click on the Send button
    Then the user should successfully send the payment receipt to customer service

