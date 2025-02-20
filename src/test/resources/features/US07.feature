
Feature: = As a user (sales and store manager), I should be able to
select any vehicle from the Vehicle page(web table)

  Background: User is already in the log in page
    Given the user logged in as "sales manager"
   # Given the user logged in with username as "User1" and password as "UserUser123"

  @kip
  Scenario: Verify login with different user types

    When user enters  fleet management page
    And user enters inside Vehicles module
    And user selected all cars button click
    Then user should see the all cars









