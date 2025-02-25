
Feature: = As a user (sales and store manager), I should be able to
select any vehicle from the Vehicle page(web table)

  Background: User is already in the log in page
    Given the user is on the login page

   # Given the user logged in with username as "User1" and password as "UserUser123"

  @salesman
  Scenario: Verify login with different user types

    Given the user logged in as "sales manager"
    When user enters  fleet management page
    And user enters inside Vehicles module
    And user selected all cars button click
    Then user should see the "All Cars"
    Then user should see each cars selected



  @store
  Scenario: Verify login with different user types

    Given the user logged in as "store manager"
    When user enters  fleet management page
    And user enters inside Vehicles module
    And user selected all cars button click
    Then user should see the "All Cars"
    Then user should see each cars selected











