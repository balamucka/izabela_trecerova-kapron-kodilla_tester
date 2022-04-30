Feature: Prevent users from withdrawing more money than their wallet contains
  Scenario: User tries to withdrawing more money than their balance
    Given There is $100 in my wallet
    When I withdraw $200
    Then nothing should be dispensed
    And I should be told that I don't have enough money in my wallet