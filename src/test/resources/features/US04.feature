@wip04
Feature: Users can access the Vehicle Contracts page

  User Story:
  As a user, I want to access the Vehicle Contracts page.
  Accounts are:  store manager, sales manager, driver

  Background: User is already on the login page
    Given the user is on the login page

  @storeManager
  Scenario: Verify access to Vehicle Contracts page as Store Manager
    Given the user logged in as "store manager"
    When the user hover overs to fleet button
    And the user clicks to  Vehicle Contracts page

    Then the page title is "Vehicle Contract - Entities - System - Car - Entities - System"
    Then the URL is "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract"



  @salesManager
  Scenario: Verify access to Vehicle Contracts page as Sales Manager
    Given the user logged in as "sales manager"
    When the user hover overs to fleet button
    And the user clicks to  Vehicle Contracts page

    Then the page title is "Vehicle Contract - Entities - System - Car - Entities - System"
    Then the URL is "https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract"

  @driver
  Scenario: Verify that Drivers cannot access the Vehicle Contracts page
    Given the user logged in as "driver"
    When the user hover overs to fleet button
    Then the user should see an error message "You do not have permission to perform this action."


