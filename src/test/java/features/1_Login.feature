@LoginFeature
Feature: User Login

  Scenario: Validation of Login Screen
    Given user navigates to the "SAUCEDEMOSITE" website
    Then the login page UI is validated

  Scenario: Login Success - Standard User
    Given user navigates to the "SAUCEDEMOSITE" website
    When a user logs in with "STANDARDUSER" and "PASSWORD"
    Then user is redirected to the Saucedemo homepage

  Scenario: Login Failed - Locked Out User
    Given user navigates to the "SAUCEDEMOSITE" website
    When a user logs in with "LOCKEDUSER" and "PASSWORD"
    Then a "LOCKED" error message will be displayed

  Scenario: Login Failed - Invalid User
    Given user navigates to the "SAUCEDEMOSITE" website
    When a user logs in with "INVALIDUSER" and "PASSWORD"
    Then a "INCORRECT" error message will be displayed

  Scenario: Login Failed - Missing Username
    Given user navigates to the "SAUCEDEMOSITE" website
    When a user logs in with "EMPTY" and "PASSWORD"
    Then a "MISSING USERNAME" error message will be displayed

  Scenario: Login Failed - Missing Password
    Given user navigates to the "SAUCEDEMOSITE" website
    When a user logs in with "STANDARDUSER" and "EMPTY"
    Then a "MISSING PASSWORD" error message will be displayed