@wip06
Feature: Users can see edit car info icons
  User Story:
  As a user, I want to see edit car info icons from the Vehicle page.
  Accounts are: truck driver, store manager, sales manager

  Background: User is already in the log in page
    Given the user is on the login page

  @driver06
  Scenario:  Verify Driver sees , edit, delete” options
    Given the user logged in as "driver"
    When user hover over to Fleet Button
    And user clicks Vehicles Button
    Then user should see three icons named "View", "Edit" and "Delete" in the dropdown menu

  @salesManager06
  Scenario:  Verify Sales Manager sees “view, edit, delete” options
    Given the user logged in as "sales manager"
    When user hover over to Fleet Button
    And user clicks Vehicles Button
    Then user should see three icons named "View", "Edit" and "Delete" in the dropdown menu

  @storeManager06
  Scenario:  Verify Store Manager sees “view, edit, delete” options
    Given the user logged in as "store manager"
    When user hover over to Fleet Button
    And user clicks Vehicles Button
    Then user should see three icons named "View", "Edit" and "Delete" in the dropdown menu