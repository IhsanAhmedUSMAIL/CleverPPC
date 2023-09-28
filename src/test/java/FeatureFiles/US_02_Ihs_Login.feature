Feature: Login functionality

  Scenario Outline: Login with invalid username and password
    Given Navigate to cleverPPC
    When Click sign-in button and enter "<invalid_email>" and "<invalid_password>" and click sign-in button
    Then User should not be able to login

    Examples:
      | invalid_email          | invalid_password |
      | null_1@example.com | null_pass_1 |
      | null_2@example.com | null_pass_2 |
      | null_3@example.com | null_pass_3 |
      | null_4@example.com | null_pass_4 |
      | null_5@example.com | null_pass_5 |
      | null_6@example.com | null_pass_6 |

  Scenario: Login with valid username and password
    Given Navigate to cleverPPC
    When Click sign-in button and enter valid email and password and click sign-in button
    Then User should login successfully



