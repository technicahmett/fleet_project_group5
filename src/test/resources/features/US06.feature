Feature: Users can see edit car info icons
  User Story:
  As a user, I want to see edit car info icons from the Vehicle page.

  Background: User is already in the log in page
    Given the user is on the login page

  @driver
  Scenario:  Verify see “view, edit, delete” options as Driver
    Given the user logged in as "driver"
    When user goto Fleet Button
    And user clicks Vehicles Button
    Then user goto three dots

  @salesManager
  Scenario:  Verify see “view, edit, delete” options as Driver
    Given the user logged in as "sales manager"
    When user goto Fleet Button
    And user clicks Vehicles Button
    Then user goto three dots

  @storeManager
  Scenario:  Verify see “view, edit, delete” options as Driver
    Given the user logged in as "store manager"
    When user goto Fleet Button
    And user clicks Vehicles Button
    Then user goto three dots
