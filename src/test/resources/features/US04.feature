@wip04
Feature: Users can access the Vehicle Contracts page

  User Story:
  As a user, I want to access the Vehicle Contracts page.
  Accounts are: driver, store manager, sales manager

  Background: User is already on the login page
    Given the user is on the login page

  @storeManager
  Scenario: Verify access to Vehicle Contracts page as Store Manager
    Given the user is logged in as "store manager"
    When the user navigates to "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract"
    Then the page title should be "All - Vehicle Contract - Entities - System - Car - Entities - System"
    And the user should have access to the Vehicle Contracts page

  @salesManager
  Scenario: Verify access to Vehicle Contracts page as Sales Manager
    Given the user is logged in as "sales manager"
    When the user navigates to "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract"
    Then the page title should be "All - Vehicle Contract - Entities - System - Car - Entities - System"
    And the user should have access to the Vehicle Contracts page

  @driver
  Scenario: Verify Drivers cannot access Vehicle Contracts page
    Given the user is logged in as "driver"
    When the user navigates to "https://qa2.vytrack.com/entity/Extend_Entity_VehicleContract"
    Then the user should see an error message "You do not have permission to perform this action."
    And the user should not have access to the Vehicle Contracts page
