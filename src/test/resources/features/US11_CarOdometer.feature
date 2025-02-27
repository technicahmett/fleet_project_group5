@wipSalia
Feature: Vehicles Odometer Info Page
  User Story:
  As a user, I should be able to view car odometer info on the Vehicles Odometer page.
  Accounts are: truck driver, store manager, sales manager

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify view Car Odometer Info Page as Driver User
    Given the user logged in as "driver"
    When user hover over Fleet Button
    And user clicks Vehicle Odometer Button
    Then user sees the default page value as "1"
    Then user sees the View Per Page as "25" by default


  Scenario: Verify view Car Odometer Info Page as Sales Manager User
    Given the user logged in as "sales manager"
    When user hover over Fleet Button
    And user clicks Vehicle Odometer Button
    Then user should see the error message


  Scenario: Verify view Car Odometer Info Page as Store Manager
    Given the user logged in as "store manager"
    When user hover over Fleet Button
    And user clicks Vehicle Odometer Button
    Then user should see the error message
