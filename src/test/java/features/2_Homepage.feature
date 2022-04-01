@HomepageFeature
Feature: Homepage

  Scenario: Validation of Homepage
    Given the user has logged in successfully
    Then the homepage page UI is validated

  Scenario: Filter - By Name(Z to A)
    Given the user has logged in successfully
    When the user filters the products by Name Z to A
    Then the products will be displayed in a descending name order

  Scenario: Filter - By Price (High to Low)
    Given the user has logged in successfully
    When the user filters the products by Price High to Low
    Then the products will be displayed in a descending price order

  Scenario: Filter - By Price (Low to High)
    Given the user has logged in successfully
    When the user filters the products by Price Low to High
    Then the products will be displayed in a ascending price order

  Scenario: Add To Cart
    Given the user has logged in successfully
    When the user adds products to the cart
    Then the user's cart is updated