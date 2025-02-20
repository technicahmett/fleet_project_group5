
Feature: Vehicles Odometer Info Page
  User Story:
  As a user, I should be able to view car odometer info on the Vehicles Odometer page.
  Accounts are: truck driver, store manager, sales manager

  Background: User is already in the log in page
    Given the user is on the login page

  @driver
  Scenario: Verify view Car Odometer Info Page as Driver User
    Given the user logged in as "driver"
    When user hover over Fleet Button
    And user clicks Vehicle Odometer Button
    Then user should see Car Odometer Info Page

 # @sales manager
  Scenario: Verify view Car Odometer Info Page as Sales Manager User
    Given the user logged in as "sales manager"
    When user clicks Fleet
    And user clicks Vehicle Odometer
    Then user should see the error message

  #@store manager
  Scenario: Verify view Car Odometer Info Page as Store Manager
    Given the user logged in as "store manager"
    When user clicks Fleet
    And user clicks Vehicle Odometer
    Then user should see the error message
