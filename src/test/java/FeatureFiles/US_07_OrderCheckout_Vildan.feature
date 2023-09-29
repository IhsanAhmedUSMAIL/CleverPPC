
Feature: Online Shopping

  Scenario: Order and Checkout
    Given Navigate to CleverPPC
    And Click sign in button
    When Enter username and password and click login button
    Then User should login successfully
    And the user can click on the shopping cart icon (Cart)

    When the user clicks on the Checkout button
    Then Selected address  should be displayed
    And the Shipment method is selected by default
    And the Terms and Conditions Agreement is accepted by clicking I Agree...

    And the user can click on the Proceed to checkout button
    And the user clicks on the Pay with PayPal button

    Then the negative message should be displayed

    And the user navigates back
    And the user clicks on the Pay with Credit Card button
    Then the credit card negative message should be displayed

    And the user navigates back
    And the user can click on the Pay with Bank Transfer button

    Then it should be verified that the total amount shown in the message matches the sum of the product cost including tax and shipping cost

    And the user can click on the I confirm my order button


    And it should be displayed that the message indicates the payment has been processed

    And the order number from the displayed message should be verified




