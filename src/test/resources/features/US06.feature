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
    When user over hover to Fleet Button
    And user clicks Vehicles Button
    And user over hover to three dots

  @salesManager06
  Scenario:  Verify Sales Manager sees “view, edit, delete” options
    Given the user logged in as "sales manager"
    When user over hover to Fleet Button
    And user clicks Vehicles Button
    And user over hover to three dots

  @storeManager06
  Scenario:  Verify Store Manager sees “view, edit, delete” options
    Given the user logged in as "store manager"
    When user over hover to Fleet Button
    And user clicks Vehicles Button
    And user over hover to three dots