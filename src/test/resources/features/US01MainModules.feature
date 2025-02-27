Feature: As a user, I should be accessing all the main modules of the app.

  AC #1: Verify that Store and Sales managers see 8 module names.
  Expected module names: Dashboards, Fleet, Customers, Sales, Activities,
  Marketing, Reports & Segments, System

  AC #2: Verify that Drivers see 4 module names.
  Expected module names: Fleet, Customers, Activities, System


  Background: User is already in the log in page
    Given the user is on the login page


  @storeManager01
  Scenario: Verify Store Managers should sees 8 modules
    Given the user logged in as "store manager"
    Then the user should see the following modules:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  @salesManager01
  Scenario: Verify Sales Managers should sees 8 modules
    Given the user logged in as "sales Manager"
    Then the user should see the following modules:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  @driver01
  Scenario: Verify Drivers should sees 4 modules
    Given the user logged in as "driver"
    Then the user should see the following modules:
      | Fleet       |
      | Customers   |
      | Activities  |
      | System      |
