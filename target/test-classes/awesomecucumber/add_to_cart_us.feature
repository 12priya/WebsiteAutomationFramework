Feature: Add to cart

  Scenario: Add one product to cart
    Given I'm on cart page
    When I add a "186002344" to the cart
    Then I should see 1 "186002344" in the cart
