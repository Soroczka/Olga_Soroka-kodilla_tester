Feature: Cash Withdrawal
#  Scenario: Successful withdrawal from a wallet in credit
#    Given I have deposited $200 in my wallet
#    When I request $30
#    Then $30 should be dispensed


  Scenario Outline: Successful withdrawal from a wallet in debit and credit
    Given I have deposited <money> in my wallet
    When I request <amount>
    Then <amount> should be dispensed
    Examples:
      | money  | amount |
      | 200    | 30     |
      | 100    | 110    |
      | 0      | 100    |
      | 0      | -100   |
      | -100   | 0      |
      | -100   | 100    |


