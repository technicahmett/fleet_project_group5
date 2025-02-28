Feature: User should be able to type into Description field when create a calendar event

  As a user
  I want to type into the Description field
  So that I can add details when creating a calendar event
@SalesAndStoreManager
  Scenario Outline: <userType> can type in the Description field when creating a calendar event
    Given the user logged in as "<userType>"
    And the user hover over on Activities button
    And the user clicks on Calendar Event button.
    And the user clicks on Create Calendar Event button.
    When the user enters text into theDescription field
    Then the entered text should be displayed in the Description field

    Examples:
      | userType      |
      | store manager |
      | sales manager |

  @driver
  Scenario: User can type in the Description field when creating a calendar event
    Given the user logged in as "driver"
    Given the user hover over on Activities button for driver
    And the user clicks on Calendar Event button.
    And the user clicks on Create Calendar Event button.
    When the user enters text into theDescription field
    Then the entered text should be displayed in the Description field
